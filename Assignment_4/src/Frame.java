/*takes the input form the buttons and prints it in the text field
 * the add_dog button takes the dogs, the add_human takes the humans
 * pressing the add info button prints the data to the text field, if an error occurs it prints an error message 
 * in the error the field */

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame extends JFrame {
    private Human human;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField Human;
	private JTextField Dog;
	private JTextField Error;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 127, 365, 59);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton Add_Human = new JButton("Add_human");
		Add_Human.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			String humaninfo= Human.getText();
			if(humaninfo.length() >= 3 ){
				human= new Human(humaninfo);
			}else{ Error.setText("Error pls fix mister");
				
			}
			
			}
		});
		Add_Human.setBounds(127, 11, 89, 23);
		panel.add(Add_Human);
		
		JButton btnNewButton_1 = new JButton("Add_dog");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String d= Dog.getText();
			if( human!=null ){
				Dog mydog=new Dog(d);
				human.buyDog(mydog);
			}else {
			Error.setText("Eror pls check input");	
			}
			}
		});
		btnNewButton_1.setBounds(127, 45, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton Add_info = new JButton("Add info");
		Add_info.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String s= human.getInfo();
			textField.setText(s);
			}
		});
		Add_info.setBounds(127, 79, 89, 23);
		panel.add(Add_info);
		
		Human = new JTextField();
		Human.setBounds(10, 12, 86, 20);
		panel.add(Human);
		Human.setColumns(10);
		
		Dog = new JTextField();
		Dog.setBounds(10, 46, 86, 20);
		panel.add(Dog);
		Dog.setColumns(10);
		
		Error = new JTextField();
		Error.setBounds(90, 209, 166, 20);
		panel.add(Error);
		Error.setColumns(10);
	}
}
