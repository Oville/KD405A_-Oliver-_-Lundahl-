package se.mah.oliver.idk15;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;

public class BikestoreGUI extends JFrame {

	private JPanel contentPane;
	private JTextField sizeField;
	private JTextField colorField;
	private JTextField priceField;
	private JTextArea textArea;
	BikeStore bikeStore = new BikeStore();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BikestoreGUI frame = new BikestoreGUI();
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
	public BikestoreGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel sizeFIeld = new JPanel();
		contentPane.add(sizeFIeld, BorderLayout.CENTER);
		sizeFIeld.setLayout(null);

		textArea = new JTextArea();
		textArea.setForeground(Color.ORANGE);
		textArea.setBounds(90, 65, 228, 156);
		sizeFIeld.add(textArea);

		priceField = new JTextField();
		priceField.setBounds(32, 6, 86, 20);
		sizeFIeld.add(priceField);
		priceField.setColumns(10);

		colorField = new JTextField();
		colorField.setBounds(126, 6, 86, 20);
		sizeFIeld.add(colorField);
		colorField.setColumns(10);

		JButton btnNewButton = new JButton("Add bike");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int size;
				int price;
			try{
				size= Integer.parseInt(sizeField.getText());
				price= Integer.parseInt(priceField.getText());
				bikeStore.addBike(colorField.getText(), size, price);
				textArea.setText(bikeStore.getAllBikes());
			}catch (NumberFormatException e){
				e.printStackTrace();
			}
			}
		});
		btnNewButton.setBounds(318, 5, 89, 23);
		sizeFIeld.add(btnNewButton);

		sizeField = new JTextField();
		sizeField.setBounds(222, 6, 86, 20);
		sizeFIeld.add(sizeField);
		sizeField.setColumns(10);
		
		JLabel Price = new JLabel("Price");
		Price.setBounds(57, 32, 46, 14);
		sizeFIeld.add(Price);
		
		JLabel lblColor = new JLabel("Color");
		lblColor.setBounds(148, 37, 46, 14);
		sizeFIeld.add(lblColor);
		
		JLabel lblSize = new JLabel("Size");
		lblSize.setBounds(245, 37, 46, 14);
		sizeFIeld.add(lblSize);
	}
}
