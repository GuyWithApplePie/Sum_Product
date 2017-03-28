/*			Sum Product Calculator
 * 
 * Programmer: Nick Couzelis
 * 		 Date: 28/03/2017
 * 
 * This program finds Sum of n and n! for n user input.
 * Accurate to 20!
 */

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
	private JTextField txtProduct;

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
		
		//When the Calculate button is pushed, the input it checked then the output is generated.
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Variable List
				int num = 0;		//User input
				int	sum = 0;		//Sum of num
				long product = 1;	//num factorial
				
				try {				//	Checking for bad input.
					num = Integer.parseInt(txtInput.getText());
					if(Integer.signum(num) != 1){ //Checking for positive number.
						//Result of non-positive number. ex. "0","-7"
						txtSum.setText("Please input a positive integer.");
						txtProduct.setText("");
						return;
					}
					//Creating Sum and Product
					for(int i=1;i<=num;i++){
						sum += i;
						product *= i;
					}
				} catch(NullPointerException|NumberFormatException x){
					//Results of a bad input. ex. "1.3","Apple"
					txtSum.setText("Please input a valid number.");
					txtProduct.setText("");
				}
				//Outputting values.
				txtSum.setText(Integer.toString(sum));
				txtProduct.setText(Long.toString(product));
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
		
		txtProduct = new JTextField();
		txtProduct.setToolTipText("Results");
		txtProduct.setEditable(false);
		txtProduct.setColumns(10);
		txtProduct.setBounds(194, 51, 180, 29);
		contentPane.add(txtProduct);
	}
}
