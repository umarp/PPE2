package tpFINAL;


import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;

public class Supprimer extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Supprimer frame = new Supprimer();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
				String filePath2 = "C:/Users/Azhar/eclipse-workspace/compte bancair2/Comptes.dat";
				 String newline = "\n";

	public Supprimer() {
		setTitle("Compte Bancaire - Supprimer");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 725, 547);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.windowBorder);
		contentPane.setForeground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		JTextArea textArea = new JTextArea();
		textArea.setBounds(89, 134, 506, 305);
		JButton btnValider = new JButton("Tout Afficher");
		btnValider.setBounds(174, 63, 113, 23);
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				File file =new File("Compte.dat");

				if(!file.exists()){
					try {
						file.createNewFile();
					} 
					catch (IOException e1) {
						e1.printStackTrace();
					}
				}

				 textArea.append(comptebanque.afficherCompte(filePath2) + newline);			        
			}
		});
		
		JButton btnMenuPrincipale = new JButton("Menu Principale");
		btnMenuPrincipale.setBounds(362, 63, 130, 23);
		btnMenuPrincipale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu compte= new menu();
				compte.setVisible(true);
			}
		});
		
		JLabel lblNumCompte = new JLabel("Numero Compte");
		lblNumCompte.setBounds(89, 109, 97, 14);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setBounds(212, 109, 57, 14);
		
		JLabel lblPrenom = new JLabel("Prenom");
		lblPrenom.setBounds(279, 109, 64, 14);
		
		JLabel lblSex = new JLabel("Sexe");
		lblSex.setBounds(377, 109, 52, 14);
		
		JLabel lblType_1 = new JLabel("Type");
		lblType_1.setBounds(453, 109, 39, 14);
		
		textField = new JTextField();
		textField.setBounds(406, 455, 86, 20);
		textField.setColumns(10);
		
		JButton btnLigneSupprimer = new JButton("Ligne supprimer");
		btnLigneSupprimer.setBounds(507, 454, 140, 23);
		btnLigneSupprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				int ligne = Integer.parseInt(textField.getText());
				
				int numlines=1;
				
				comptebanque.supprimerCompte("Compte.dat", ligne, numlines);
				textArea.setText(null);
				textArea.append(comptebanque.afficherCompte(filePath2) + newline);	
			}
		});
		contentPane.setLayout(null);
		contentPane.add(textArea);
		contentPane.add(lblNumCompte);
		contentPane.add(lblNom);
		contentPane.add(lblPrenom);
		contentPane.add(btnLigneSupprimer);
		contentPane.add(lblSex);
		contentPane.add(textField);
		contentPane.add(lblType_1);
		contentPane.add(btnValider);
		contentPane.add(btnMenuPrincipale);
		
		JLabel lblSupprimerUnCompte = new JLabel("Supprimer un compte");
		lblSupprimerUnCompte.setForeground(SystemColor.activeCaption);
		lblSupprimerUnCompte.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblSupprimerUnCompte.setBackground(Color.BLACK);
		lblSupprimerUnCompte.setBounds(238, 11, 191, 41);
		contentPane.add(lblSupprimerUnCompte);
		
		JLabel lblInserezLeNumero = new JLabel("Inserez le numero de la ligne de laquelle vous voulez effacer: ");
		lblInserezLeNumero.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblInserezLeNumero.setBounds(10, 448, 386, 34);
		contentPane.add(lblInserezLeNumero);
	}
}