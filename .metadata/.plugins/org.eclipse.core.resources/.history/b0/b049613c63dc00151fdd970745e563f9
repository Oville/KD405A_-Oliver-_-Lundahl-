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

public class SearchGui extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldBusStop;
	private JTextField textFieldFrom;
	private JTextField textFieldTo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchGui frame = new SearchGui();
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
	public SearchGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 192, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textFieldBusStop = new JTextField();
		textFieldBusStop.setBounds(0, 11, 86, 20);
		panel.add(textFieldBusStop);
		textFieldBusStop.setColumns(10);
		
		JButton btnbuss = new JButton("Search BussStop");
		btnbuss.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnbuss.setBounds(96, 10, 89, 23);
		panel.add(btnbuss);
		
		JTextArea textAreaBusstop = new JTextArea();
		textAreaBusstop.setBounds(10, 60, 158, 89);
		panel.add(textAreaBusstop);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(194, 0, 240, 261);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		textFieldFrom = new JTextField();
		textFieldFrom.setBounds(10, 11, 86, 20);
		panel_1.add(textFieldFrom);
		textFieldFrom.setColumns(10);
		
		textFieldTo = new JTextField();
		textFieldTo.setBounds(119, 11, 86, 20);
		panel_1.add(textFieldTo);
		textFieldTo.setColumns(10);
		
		JButton btnSearchJourney = new JButton("Search");
		btnSearchJourney.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSearchJourney.setBounds(61, 42, 89, 23);
		panel_1.add(btnSearchJourney);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 71, 220, 77);
		panel_1.add(textArea);
	}
}
