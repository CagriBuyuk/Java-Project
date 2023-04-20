package ctis221project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class searchFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	private JTextArea searchText;
	private JComboBox typeCMB; 
	
	public JComboBox getTypeCMB() {
		return typeCMB;
	}

	/**
	 * Create the frame.
	 */
	public searchFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 433);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox typeCMB = new JComboBox();
		typeCMB.setModel(new DefaultComboBoxModel(new String[] {"Concert", "Competition", "Party"}));
		typeCMB.setBounds(207, 24, 74, 21);
		contentPane.add(typeCMB);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(OrganizationSys.getTypes()==null) {
					searchText.setText("Array list is empty");
				}
				else {
					//searchText.setText(OrganizationSys.searchType((String)typeCMB.getSelectedItem()).toString());
					//searchText.setText(OrganizationSys.searchType()typeCMB.getSelectedItem()).toString());
				}
			}
		});
		btnNewButton.setBounds(327, 24, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Close");
		btnNewButton_1.setBounds(454, 24, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Organization Type:");
		lblNewLabel.setBounds(44, 28, 118, 13);
		contentPane.add(lblNewLabel);
		
		JTextArea searchText = new JTextArea();
		searchText.setBounds(44, 87, 518, 279);
		contentPane.add(searchText);
	}
}
