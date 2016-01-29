package se.mah.ke.k3lara;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;

public class CalculatorGui extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	Calculator myCalculator;
	private JTextField textField_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGui frame = new CalculatorGui();
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
	public CalculatorGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		myCalculator = new Calculator();
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);

		JButton button = new JButton("3");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("3");
				myCalculator.numberButtonPressed(3);
			}
		});
		panel.add(button);
		
		JButton button_1 = new JButton("+");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("+");
				myCalculator.numberButtonPressed(+);
			}
		});
		panel.add(button_1);
		
		JButton button_2 = new JButton("7");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("7");
				myCalculator.numberButtonPressed(7);
			}
		});
		panel.add(button_2);
		
		JButton button_3 = new JButton("=");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.equals();
				int i = myCalculator.getResult();
				textField.setText(String.valueOf(i));
			}
		});
		panel.add(button_3);
		
		textField_1 = new JTextField();
		panel.add(textField_1);
		textField_1.setColumns(10);
	
		

	
	
	
	}

}
