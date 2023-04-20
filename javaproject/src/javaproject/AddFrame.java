package ctis221project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class AddFrame extends JFrame {

	private JPanel contentPane;
	
	OrganizationFrame of = null;
	private JTextField idTextField;
	private JTextField nameTextField;
	private JTextField placeTextField;
	private JTextField priceTextField;
	private JTextField quotaTextField;
	private JTextField musicianTextField;
	private JTextField prizeTextField;
	private JTextField genreTextField;
	
	private final ButtonGroup buttonGroup = new ButtonGroup();
	 private JRadioButton rbConcert;
	 private JRadioButton rbCompetition;
	 private JRadioButton rbParty;


	/**
	 * Create the frame.
	 */
	public AddFrame(JFrame fr) {
		of = (OrganizationFrame)fr;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 916, 464);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter the id:");
		lblNewLabel.setBounds(43, 106, 71, 13);
		contentPane.add(lblNewLabel);
		
		idTextField = new JTextField();
		idTextField.setBounds(150, 103, 96, 19);
		contentPane.add(idTextField);
		idTextField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Organization Name:");
		lblNewLabel_1.setBounds(43, 134, 124, 13);
		contentPane.add(lblNewLabel_1);
		
		nameTextField = new JTextField();
		nameTextField.setBounds(150, 132, 96, 19);
		contentPane.add(nameTextField);
		nameTextField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Organization Place:");
		lblNewLabel_2.setBounds(43, 157, 124, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Organization Price:");
		lblNewLabel_3.setBounds(43, 180, 124, 13);
		contentPane.add(lblNewLabel_3);
		
		
		placeTextField = new JTextField();
		placeTextField.setBounds(150, 154, 96, 19);
		contentPane.add(placeTextField);
		placeTextField.setColumns(10);
		
		priceTextField = new JTextField();
		priceTextField.setBounds(150, 177, 96, 19);
		contentPane.add(priceTextField);
		priceTextField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Enter the quota:");
		lblNewLabel_4.setBounds(43, 213, 124, 13);
		contentPane.add(lblNewLabel_4);
		
		quotaTextField = new JTextField();
		quotaTextField.setBounds(150, 210, 96, 19);
		contentPane.add(quotaTextField);
		quotaTextField.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Type of the Organization");
		lblNewLabel_5.setBounds(494, 10, 231, 30);
		contentPane.add(lblNewLabel_5);
		
		JCheckBox ageCheckBox = new JCheckBox("Are you under 18?");
		ageCheckBox.setBounds(742, 134, 136, 21);
		contentPane.add(ageCheckBox);
		
		JRadioButton rbConcert = new JRadioButton("Concert");
		buttonGroup.add(rbConcert);
		rbConcert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				musicianTextField.setEditable(true);
		        prizeTextField.setEditable(false);
		        genreTextField.setEditable(false);
		        ageCheckBox.setEnabled(false);
		        
			}
		});
		
		rbConcert.setBounds(394, 74, 103, 21);
		contentPane.add(rbConcert);
		
		JRadioButton rbCompetition = new JRadioButton("Competition");
		buttonGroup.add(rbCompetition);
		rbCompetition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prizeTextField.setEditable(true);
				musicianTextField.setEditable(false);
			    genreTextField.setEditable(false);
			    ageCheckBox.setEnabled(false);
			        
			        
			}
		});
		
		rbCompetition.setBounds(567, 74, 103, 21);
		contentPane.add(rbCompetition);
		
		JRadioButton rbParty = new JRadioButton("Party");
		buttonGroup.add(rbParty);
		rbParty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 genreTextField.setEditable(true);
				 ageCheckBox.setEnabled(true);
				 prizeTextField.setEditable(false);
				 musicianTextField.setEditable(false);
			}
		});
		rbParty.setBounds(780, 74, 103, 21);
		contentPane.add(rbParty);
		
		JLabel lblNewLabel_6 = new JLabel("Musician Name:");
		lblNewLabel_6.setBounds(276, 106, 165, 13);
		contentPane.add(lblNewLabel_6);
		
		musicianTextField = new JTextField();
		musicianTextField.setBounds(381, 104, 96, 16);
		contentPane.add(musicianTextField);
		musicianTextField.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Enter the Prize:");
		lblNewLabel_7.setBounds(494, 106, 176, 13);
		contentPane.add(lblNewLabel_7);
		
		prizeTextField = new JTextField();
		prizeTextField.setBounds(587, 103, 53, 19);
		contentPane.add(prizeTextField);
		prizeTextField.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Enter Genre:");
		lblNewLabel_8.setBounds(680, 106, 130, 13);
		contentPane.add(lblNewLabel_8);
		
		genreTextField = new JTextField();
		genreTextField.setBounds(765, 103, 79, 19);
		contentPane.add(genreTextField);
		genreTextField.setColumns(10);
		
		JLabel warningLabel = new JLabel("");
		warningLabel.setBounds(115, 295, 672, 19);
		contentPane.add(warningLabel);
		
		JButton addBtn = new JButton("Add");
		addBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//boolean res = false;
		        if (idTextField.getText().isEmpty() || nameTextField.getText().isEmpty() || placeTextField.getText().isEmpty() || priceTextField.getText().isEmpty() || quotaTextField.getText().isEmpty() ){
		            warningLabel.setText("Fill the necessary fields");
		        } else {
		            int id = Integer.parseInt(idTextField.getText());
		            String name = nameTextField.getText();
		            String place= placeTextField.getText();
		            double price= Double.parseDouble(priceTextField.getText());
		            int quota = Integer.parseInt(quotaTextField.getText());
		           
		           
		            if(OrganizationSys.checkId(id)) {
		            	warningLabel.setText("existing id!!");
		            }else {
		            
		    
		            if (rbConcert.isSelected()) {
		                if (musicianTextField.getText().isEmpty()) {
		                    warningLabel.setText("Fill the necessary fields");
		                } else {		                
		                	 String musician = musicianTextField.getText();
		                	 String type = "Concert";
		                	
		                    OrganizationSys.addOrganization(type, id, name, place, price, quota,musician, 0,"", false);
		               
		                }
		            } else if (rbCompetition.isSelected()){
		            	 if (prizeTextField.getText().isEmpty()) {
			                    warningLabel.setText("Fill the prize");
			                } else {
			                	 double prize= Double.parseDouble(prizeTextField.getText());
			                	 String type = "Competition";
			                    OrganizationSys.addOrganization(type, id, name, place, price, quota,"", prize,"", false);
		                }
		            }
		            else if (rbParty.isSelected()) {
		            	 if (genreTextField.getText().isEmpty()) {
			                    warningLabel.setText("Fill the genre");
			                } else {		  
			                	String genre= genreTextField.getText();
			                	String type = "Party";
			                    OrganizationSys.addOrganization(type, id, name, place, price, quota,"", 0,genre, false);
		                }
		            }
		            
		        }
		      }
		        
			}
		});
		addBtn.setBounds(507, 180, 85, 21);
		contentPane.add(addBtn);
		
		JButton bntClose = new JButton("CLOSE");
		bntClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				of.setVisible(true);
			}
		});
		bntClose.setBounds(765, 338, 85, 21);
		contentPane.add(bntClose);
		
	
		
		
	}
}
