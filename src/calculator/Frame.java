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

public class Frame extends JFrame {

	private JPanel contentPane;
	private JTextField txtInput;
	private JTextField txtResult;

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
		btnCalculate.setToolTipText("Calculate");
		btnCalculate.setBounds(274, 11, 100, 29);
		contentPane.add(btnCalculate);
		
		txtResult = new JTextField();
		txtResult.setText("Please type your input in the text field.");
		txtResult.setToolTipText("Results");
		txtResult.setEditable(false);
		txtResult.setColumns(10);
		txtResult.setBounds(10, 51, 364, 29);
		contentPane.add(txtResult);
	}
}
