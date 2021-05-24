package tpFINAL;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class verifierCarte {

	JFrame frmCompteBancaireverifier;
	private JTextField textField;
	private JTextField txtResulta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					verifierCarte window = new verifierCarte();
					window.frmCompteBancaireverifier.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	static boolean checkLuhn(String cardNo) 
	{ 
	    int nDigits = cardNo.length(); 
	  
	    int nSum = 0; 
	    boolean isSecond = false; 
	    for (int i = nDigits - 1; i >= 0; i--)  
	    { 
	  
	        int d = cardNo.charAt(i) - '0'; 
	  
	        if (isSecond == true) 
	            d = d * 2; 
	  
	        // We add two digits to handle 
	        // cases that make two digits  
	        // after doubling 
	        nSum += d / 10; 
	        nSum += d % 10; 
	  
	        isSecond = !isSecond; 
	    } 
	    return (nSum % 10 == 0); 
	} 	    
	/**
	 * Create the application.
	 */
	public verifierCarte() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	String a;
	private void initialize() {
		frmCompteBancaireverifier = new JFrame();
		frmCompteBancaireverifier.getContentPane().setBackground(Color.DARK_GRAY);
		frmCompteBancaireverifier.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Verifier:");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cardNo = textField.getText(); 
		        if (checkLuhn(cardNo)) {
		            a= "La Carte est valide"; 
		        }
		        else {
		            a="La Carte n'est pas valide"; 
		        }
				txtResulta.setText(a);

		     }
		});
		
		
		
		txtResulta = new JTextField();
		
		txtResulta.setEditable(false);
		txtResulta.setBounds(162, 124, 199, 20);
		txtResulta.setColumns(10);
		
		
		btnNewButton.setBounds(56, 73, 89, 23);
		frmCompteBancaireverifier.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(189, 73, 150, 23);
		frmCompteBancaireverifier.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Menu principal");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCompteBancaireverifier.setVisible(false);
				frmCompteBancaireverifier.dispose();
			}
		});
		btnNewButton_1.setBounds(162, 168, 134, 23);
		frmCompteBancaireverifier.getContentPane().add(btnNewButton_1);
		frmCompteBancaireverifier.getContentPane().add(txtResulta);
		frmCompteBancaireverifier.setTitle("Compte Bancaire -Verifier carte");
		frmCompteBancaireverifier.setBounds(100, 100, 450, 300);
		frmCompteBancaireverifier.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
		
}
