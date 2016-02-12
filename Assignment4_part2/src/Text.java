/*the text area that the prints the info about the animals with an array*/
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;

public class Text extends JFrame {

	private JPanel contentPane;
private ArrayList <Animal> Djuren;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Text frame = new Text();
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
	public Text() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 5, 404, 218);
		panel.add(textArea);
		Djuren = new ArrayList <Animal>();
		Djuren.add(new Dog(" Canis latrans ", 3, true ));
		Djuren.add(new Cat(" Feline Feline ", 8, 6));
		Djuren.add(new Cat(" Feline Feline ", 6, 1));
		Djuren.add(new Snake("Solid Snake", false));
		Djuren.add(new Snake("Venom Snake",true ));
		for(Animal a:Djuren){
			textArea.append(a.getInfo()+"\n");
		}
		
	}
}
