package tpFINAL;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Font;

public class menu extends JFrame {


	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu frame = new menu();
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
	public menu() {
		setTitle("Compte Bancaire");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 725, 547);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.windowBorder);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.GRAY));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Cree une Compte");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				creationCompte compte= new creationCompte();
				compte.setVisible(true);
			}
		});
		
		
		JButton btnAffichercompte = new JButton("Afficher tout les Comptes");
		btnAffichercompte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AfficherComptes Acompte= new AfficherComptes();
				Acompte.setVisible(true);
			}
		});
		
		JButton btnSuppression = new JButton("Suprimer une compte");
		btnSuppression.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Supprimer supcompte= new Supprimer();
				supcompte.setVisible(true);
			}
		});
		

		JButton btnNewButton_1_1 = new JButton("Aide");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aide window = new aide();
				window.frmCompteBancaire.setVisible(true);
			}
		});
		JButton btnNewButton_1_1_1 = new JButton("Quitter");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] options = {"OUI", "NON", };
				int x = JOptionPane.showOptionDialog(null, "Voulez vous quitter !!!",
		                "banque",
		                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
			        System.out.println(x);
			        JOptionPane.showMessageDialog(null,"Au revoir.");
			        System.exit(0);
			}
		});
		
		JLabel lblCompteBancaire = new JLabel("Compte Bancaire");
		lblCompteBancaire.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblCompteBancaire.setForeground(SystemColor.activeCaption);
		lblCompteBancaire.setBackground(Color.WHITE);
		

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(135)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnNewButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
						.addComponent(btnAffichercompte, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
						.addComponent(btnSuppression, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
						.addComponent(btnNewButton_1_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
						.addComponent(btnNewButton_1_1_1, GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE))
					.addGap(150))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(266)
					.addComponent(lblCompteBancaire, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(283, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblCompteBancaire, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnAffichercompte, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnSuppression, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNewButton_1_1, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addComponent(btnNewButton_1_1_1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(132, Short.MAX_VALUE))
		);
		gl_contentPane.setAutoCreateGaps(true);
		gl_contentPane.setAutoCreateContainerGaps(true);
		contentPane.setLayout(gl_contentPane);
	}
}
