package ctis221project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class OrganizationFrame extends JFrame {

	private JPanel contentPane;
	private JButton btnDisplay;
	
		AddFrame add = new AddFrame(this);
		searchFrame search = new searchFrame();
		
		public void fillComboBox() {
	        search.getTypeCMB().setModel(new DefaultComboBoxModel(OrganizationSys.getTypes()));
	    }
		
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrganizationFrame frame = new OrganizationFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public OrganizationFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 903, 507);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(68, 112, 751, 320);
		contentPane.add(scrollPane);
		
		JTextArea resultTextArea = new JTextArea();
		scrollPane.setViewportView(resultTextArea);
		
		btnDisplay = new JButton("Display");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(OrganizationSys.getAllOrganization().isEmpty()) {
					resultTextArea.setText("The array list is empty. Please fill first.");
				}else {
					resultTextArea.setText(OrganizationSys.getAllOrganization());
				}
			}
		});
		btnDisplay.setBounds(68, 43, 85, 21);
		contentPane.add(btnDisplay);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				add.setVisible(true);
				dispose();
			}
		});
		btnAdd.setBounds(490, 43, 85, 21);
		contentPane.add(btnAdd);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				search.setVisible(true);
				//fillComboBox();
				dispose();
			}
		});
		btnNewButton.setBounds(732, 43, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = resultTextArea.getText();
				
				if(OrganizationSys.removeOrganization(name)) {
					resultTextArea.setText("No name");
				}else {
					resultTextArea.setText(name + " is deleted");
				}
			}
		});
		btnNewButton_1.setBounds(606, 43, 85, 21);
		contentPane.add(btnNewButton_1);
	}
}
