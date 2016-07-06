package ruiz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KeyChainStore extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldAmountAdd;
	private JTextField textFieldAmountSubtract;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KeyChainStore frame = new KeyChainStore();
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
	public KeyChainStore() {
		setTitle("Key Chains");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSubmitOrder = new JButton("Submit");
		
		
		btnSubmitOrder.setBounds(199, 179, 175, 71);
		contentPane.add(btnSubmitOrder);
		
		textFieldAmountAdd = new JTextField();
		textFieldAmountAdd.setBounds(10, 11, 86, 20);
		contentPane.add(textFieldAmountAdd);
		textFieldAmountAdd.setColumns(10);
		
		JLabel lblAddAmount = new JLabel("Add Keychain Amount");
		lblAddAmount.setBounds(106, 14, 105, 14);
		contentPane.add(lblAddAmount);
		
		textFieldAmountSubtract = new JTextField();
		textFieldAmountSubtract.setBounds(10, 42, 86, 20);
		contentPane.add(textFieldAmountSubtract);
		textFieldAmountSubtract.setColumns(10);
		
		JLabel lblSubtractAmount = new JLabel("Subtract Keychain Amount");
		lblSubtractAmount.setBounds(106, 45, 127, 14);
		contentPane.add(lblSubtractAmount);
		
		JButton btnViewOrder = new JButton("View Order");
		btnViewOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String addAmountString, subtractAmountString;
				int addAmount, subtractAmount;
				addAmountString = textFieldAmountAdd.getText();
				subtractAmountString = textFieldAmountSubtract.getText();
				
				addAmount = Integer.parseInt(addAmountString);
				subtractAmount = Integer.parseInt(subtractAmountString);
				JOptionPane.showMessageDialog(null, "");
			}
		});
		btnViewOrder.setBounds(7, 179, 182, 71);
		contentPane.add(btnViewOrder);
	}
}
