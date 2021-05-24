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
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;

public class AfficherComptes extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AfficherComptes frame = new AfficherComptes();
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
	public AfficherComptes() {
		setTitle("Compte Bancaire - Afficher comptes");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 725, 547);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.windowBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		JTextArea textArea = new JTextArea();
		textArea.setBounds(64, 118, 570, 352);
		JButton btnValider = new JButton("Afficher les compte");
		btnValider.setBounds(160, 57, 147, 23);
		
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
				String filePath2 = "C:/Users/Azhar/eclipse-workspace/compte bancair2/Comptes.dat";
				String newline = "\n";
				   
				textArea.append(comptebanque.afficherCompte(filePath2) + newline);			        
			}
		});
		
		JButton btnMenuPrincipale = new JButton("Menu Principale");
		btnMenuPrincipale.setBounds(397, 57, 138, 23);
		btnMenuPrincipale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				
				
			}
		});
		
		JLabel lblNumCompte = new JLabel("Numero Compte");
		lblNumCompte.setBounds(76, 93, 106, 14);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setBounds(192, 93, 34, 14);
		
		JLabel lblPrenom = new JLabel("Prenom");
		lblPrenom.setBounds(262, 93, 45, 14);
		
		JLabel lblSex = new JLabel("Sexe");
		lblSex.setBounds(335, 93, 40, 14);
		
		JLabel lblType_1 = new JLabel("Type de compte");
		lblType_1.setBounds(397, 93, 106, 14);
		
		JLabel lblAfficherUnCompte = new JLabel("Afficher  les compte");
		lblAfficherUnCompte.setBounds(251, 5, 191, 41);
		lblAfficherUnCompte.setForeground(SystemColor.activeCaption);
		lblAfficherUnCompte.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblAfficherUnCompte.setBackground(Color.BLACK);
		contentPane.setLayout(null);
		contentPane.add(textArea);
		contentPane.add(btnValider);
		contentPane.add(btnMenuPrincipale);
		contentPane.add(lblNumCompte);
		contentPane.add(lblNom);
		contentPane.add(lblPrenom);
		contentPane.add(lblSex);
		contentPane.add(lblType_1);
		contentPane.add(lblAfficherUnCompte);
	}
}
