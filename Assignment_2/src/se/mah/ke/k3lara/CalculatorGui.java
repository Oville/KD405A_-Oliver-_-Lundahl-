package se.mah.ke.k3lara;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorGui extends JFrame {

	private JPanel contentPane;
	Calculator myCalculator;
	private JTextField resultat;

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
		panel.setLayout(null);

		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultat.setText("5");
				myCalculator.numberButtonPressed(5);
			}
		});
		button_5.setBounds(10, 11, 89, 23);
		panel.add(button_5);

		JButton plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultat.setText("+");
				myCalculator.plus();
			}
		});
		plus.setBounds(112, 11, 89, 23);
		panel.add(plus);

		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultat.setText("8");
				myCalculator.numberButtonPressed(8);
			}
		});

		button8.setBounds(211, 11, 89, 23);
		panel.add(button8);

		JButton equals = new JButton("=");
		equals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.equals();
				int i = myCalculator.getResult();
				resultat.setText(String.valueOf(i));
			}
		});

		equals.setBounds(304, 11, 89, 23);
		panel.add(equals);

		resultat = new JTextField();
		resultat.setBounds(67, 72, 270, 130);
		panel.add(resultat);
		resultat.setColumns(10);
		
		JButton button = new JButton("*");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				resultat.setText("*");
				myCalculator.mult();
			}
		});
		button.setBounds(10, 38, 89, 23);
		panel.add(button);
		
		JButton button_1 = new JButton("-");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultat.setText("-");
				myCalculator.minus();
			}
		});
		button_1.setBounds(112, 38, 89, 23);
		panel.add(button_1);
	}
}