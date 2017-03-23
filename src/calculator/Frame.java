package calculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame extends JFrame {

	private JPanel contentPane;
	private JTextField txtInput;
	private JTextField txtSum;
	private JTextField textProduct;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
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
	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 130);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtInput = new JTextField();
		txtInput.setToolTipText("Input");
		txtInput.setBounds(10, 11, 254, 29);
		contentPane.add(txtInput);
		txtInput.setColumns(10);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					int num = Integer.parseInt(txtInput.getText());
					
					
				} catch(NullPointerException|NumberFormatException x){
					txtSum.setText("Please input a valid number.");
					textProduct.setText("");
				}
				
				
				
				
			}
		});
		btnCalculate.setToolTipText("Calculate");
		btnCalculate.setBounds(274, 11, 100, 29);
		contentPane.add(btnCalculate);
		
		txtSum = new JTextField();
		txtSum.setText("Please type your input above.");
		txtSum.setToolTipText("Results");
		txtSum.setEditable(false);
		txtSum.setColumns(10);
		txtSum.setBounds(10, 51, 180, 29);
		contentPane.add(txtSum);
		
		textProduct = new JTextField();
		textProduct.setToolTipText("Results");
		textProduct.setEditable(false);
		textProduct.setColumns(10);
		textProduct.setBounds(194, 51, 180, 29);
		contentPane.add(textProduct);
	}
}
