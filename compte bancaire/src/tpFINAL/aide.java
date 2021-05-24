package tpFINAL;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class aide {

	JFrame frmCompteBancaire;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					aide window = new aide();
					window.frmCompteBancaire.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public aide() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCompteBancaire = new JFrame();
		frmCompteBancaire.setBackground(Color.DARK_GRAY);
		frmCompteBancaire.setTitle("Compte Bancaire - Aide");
		frmCompteBancaire.setBounds(100, 100, 450, 300);
		frmCompteBancaire.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmCompteBancaire.getContentPane().setLayout(null);
		
		JButton btnMenuPrincipale = new JButton("Menu Principale");
		btnMenuPrincipale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmCompteBancaire.setVisible(false);
                
				frmCompteBancaire.dispose();

			}
		});
		btnMenuPrincipale.setBackground(Color.WHITE);
		btnMenuPrincipale.setBounds(133, 135, 158, 23);
		frmCompteBancaire.getContentPane().add(btnMenuPrincipale);
		
		JTextPane txtpncreeUnCompte = new JTextPane();
		txtpncreeUnCompte.setForeground(Color.WHITE);
		txtpncreeUnCompte.setBackground(Color.DARK_GRAY);
		txtpncreeUnCompte.setBounds(0, 0, 434, 261);
		txtpncreeUnCompte.setText("1)Cree un compte - Inserez vos donnes pour cree une compte\r\n2)Affichier les vompte - Voir les comptes\r\n3)Supprimer les compte - Effacer une compte\r\n4)Aide \r\n5)Veriffier une carte bancaire - Voir si votre carte est valide\r\n6)Quitter");
		frmCompteBancaire.getContentPane().add(txtpncreeUnCompte);
	}

}
