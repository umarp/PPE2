package tpFINAL;


import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import tpFINAL.comptebanque;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

public class creationCompte extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					creationCompte frame = new creationCompte();
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
	public creationCompte() {
		setTitle("Compte Bancaire - Cree une compte");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100,  725, 547);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.windowBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnMenuPrincipale = new JButton("Menu Principale");
		btnMenuPrincipale.setBounds(255, 440, 252, 35);
		btnMenuPrincipale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu compte= new menu();
				compte.setVisible(true);
			}
		});
		
		textField = new JTextField("");
		textField.setBounds(374, 103, 232, 20);
		textField.setColumns(10);
		
		textField_1 = new JTextField("");
		textField_1.setBounds(374, 134, 232, 20);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(374, 165, 232, 20);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(374, 196, 232, 20);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nom: ");
		lblNewLabel.setBounds(273, 106, 51, 14);
		lblNewLabel.setForeground(Color.LIGHT_GRAY);
		lblNewLabel.setBackground(Color.BLACK);
		
		JLabel lblPrenom = new JLabel("Prenom: ");
		lblPrenom.setBounds(258, 137, 66, 14);
		lblPrenom.setForeground(Color.LIGHT_GRAY);
		lblPrenom.setBackground(Color.BLACK);
		
		JLabel lblAdresse = new JLabel("Adresse: ");
		lblAdresse.setBounds(255, 168, 69, 14);
		lblAdresse.setForeground(Color.LIGHT_GRAY);
		lblAdresse.setBackground(Color.BLACK);
		
		JLabel lblDateDeNaissance = new JLabel("Date De naissance: ");
		lblDateDeNaissance.setBounds(208, 199, 116, 14);
		lblDateDeNaissance.setForeground(Color.LIGHT_GRAY);
		lblDateDeNaissance.setBackground(Color.BLACK);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(374, 227, 232, 22);
		
		 comboBox.addItem("M");
		 comboBox.addItem("F");
		
		JLabel lblSex = new JLabel("sexe:");
		lblSex.setBounds(270, 231, 54, 14);
		lblSex.setForeground(Color.LIGHT_GRAY);
		lblSex.setBackground(Color.BLACK);
		
		JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.setBounds(374, 260, 232, 22);
		comboBox_1.addItem("Courrant");
		comboBox_1.addItem("Joint");
		comboBox_1.addItem("Epargne");
		
		JLabel lblTypeDeCompte = new JLabel("Type de compte:");
		lblTypeDeCompte.setBounds(220, 264, 104, 14);
		lblTypeDeCompte.setForeground(Color.LIGHT_GRAY);
		lblTypeDeCompte.setBackground(Color.BLACK);
		
		JButton btnCreeCompte = new JButton("Cree Compte");
		btnCreeCompte.setBounds(262, 334, 220, 23);
		btnCreeCompte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
				
					
					comptebanque.nom = textField.getText();
					comptebanque.prenom = textField_1.getText();
					comptebanque.Adresse = textField_2.getText();
					comptebanque.DateDeNaissance = textField_3.getText();
					comptebanque.Sex=(String)comboBox.getSelectedItem();
					comptebanque.Type=(String)comboBox_1.getSelectedItem();
					
			        
					comptebanque.CreationCompte();
					}
					catch(Exception error) {
						JOptionPane.showMessageDialog(null, "Erreur !!!");
					}
			}
			
		});
		contentPane.setLayout(null);
		contentPane.add(lblDateDeNaissance);
		contentPane.add(lblAdresse);
		contentPane.add(lblPrenom);
		contentPane.add(lblNewLabel);
		contentPane.add(lblSex);
		contentPane.add(lblTypeDeCompte);
		contentPane.add(textField_1);
		contentPane.add(textField);
		contentPane.add(textField_2);
		contentPane.add(textField_3);
		contentPane.add(comboBox_1);
		contentPane.add(comboBox);
		contentPane.add(btnCreeCompte);
		contentPane.add(btnMenuPrincipale);
		
		JLabel lblCreUnCompte = new JLabel("Cr\u00E9e un compte");
		lblCreUnCompte.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblCreUnCompte.setForeground(SystemColor.activeCaption);
		lblCreUnCompte.setBackground(Color.BLACK);
		lblCreUnCompte.setBounds(255, 32, 191, 41);
		contentPane.add(lblCreUnCompte);
	}
}