import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.Box;
import javax.swing.JMenu;

public class frame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField txtNamnAndersJansson;
	private JTextField txtAdressNordenskildsgatan;
	private JTextField txtPersonr;
	private JTextField txtTelefonr;
	private JTextField txtEmailJansonjansongmailcom;
	private JMenu mnMedlem;
	private JLabel lblNyMedlem;
	private JLabel lblHittaMedlem;
	private JMenu mnHjlp;
	private JLabel lblHjlp;
	private JLabel lblOmProgrammet;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame frame = new frame();
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
	public frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table.setBackground(Color.YELLOW);
		table.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		table.setModel(new DefaultTableModel(new Object[][] { { "Anders Janson" }, { "Hanna Lind" },
				{ "Erik Lundgren" }, { "Maja West" }, { "Ola Erikson" }, { "Emilia Svenson" }, { "Mats Brob\u00E4ck" },
				{ "Matilda Hammar" }, { "Johennes Brolin" }, }, new String[] { "Medlemmar" }));
		table.getColumnModel().getColumn(0).setPreferredWidth(621);
		table.getColumnModel().getColumn(0).setMinWidth(50);
		table.setForeground(Color.BLACK);
		table.setBounds(10, 60, 123, 146);
		contentPane.add(table);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(143, 289, -132, -227);
		contentPane.add(scrollPane);

		txtNamnAndersJansson = new JTextField();
		txtNamnAndersJansson.setBackground(Color.YELLOW);
		txtNamnAndersJansson.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtNamnAndersJansson.setText("NAMN: Anders Jansson");
		txtNamnAndersJansson.setBounds(257, 50, 195, 38);
		contentPane.add(txtNamnAndersJansson);
		txtNamnAndersJansson.setColumns(10);

		txtAdressNordenskildsgatan = new JTextField();
		txtAdressNordenskildsgatan.setBackground(Color.YELLOW);
		txtAdressNordenskildsgatan.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtAdressNordenskildsgatan.setText("ADRESS: Nordenski\u00F6ldsgatan 1\r\n");
		txtAdressNordenskildsgatan.setBounds(257, 88, 195, 38);
		contentPane.add(txtAdressNordenskildsgatan);
		txtAdressNordenskildsgatan.setColumns(10);

		txtPersonr = new JTextField();
		txtPersonr.setBackground(Color.YELLOW);
		txtPersonr.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtPersonr.setText("\r\nPERSONR: 2007256723");
		txtPersonr.setBounds(257, 123, 195, 38);
		contentPane.add(txtPersonr);
		txtPersonr.setColumns(10);

		txtTelefonr = new JTextField();
		txtTelefonr.setBackground(Color.YELLOW);
		txtTelefonr.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtTelefonr.setText("TELEFONR: 687125942\r\n");
		txtTelefonr.setBounds(257, 161, 195, 38);
		contentPane.add(txtTelefonr);
		txtTelefonr.setColumns(10);

		txtEmailJansonjansongmailcom = new JTextField();
		txtEmailJansonjansongmailcom.setBackground(Color.YELLOW);
		txtEmailJansonjansongmailcom.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtEmailJansonjansongmailcom.setText("E-MAIL Jansonjanson@gmail.com ");
		txtEmailJansonjansongmailcom.setBounds(257, 199, 195, 38);
		contentPane.add(txtEmailJansonjansongmailcom);
		txtEmailJansonjansongmailcom.setColumns(10);

		JLabel lblNewLabel = new JLabel("GITFIT\r\n");
		lblNewLabel.setForeground(Color.MAGENTA);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setBounds(400, 11, 79, 29);
		contentPane.add(lblNewLabel);

		Box horizontalBox = Box.createHorizontalBox();
		horizontalBox.setBounds(257, 50, 347, 210);
		contentPane.add(horizontalBox);

		JButton btnSpara = new JButton("Spara");
		btnSpara.setBounds(391, 258, 61, 23);
		contentPane.add(btnSpara);
		btnSpara.setBackground(Color.LIGHT_GRAY);

		JMenu mnNewMenu = new JMenu("Arkiv");
		mnNewMenu.setBounds(10, 11, 107, 22);
		contentPane.add(mnNewMenu);

		JLabel lblAvsluta = new JLabel("Avsluta");
		mnNewMenu.add(lblAvsluta);

		JLabel lblSkrivUt = new JLabel("Skriv ut");
		mnNewMenu.add(lblSkrivUt);

		mnMedlem = new JMenu("Medlem");
		mnMedlem.setBounds(127, 11, 107, 22);
		contentPane.add(mnMedlem);

		lblNyMedlem = new JLabel("Ny medlem");
		mnMedlem.add(lblNyMedlem);

		lblHittaMedlem = new JLabel("Hitta medlem");
		mnMedlem.add(lblHittaMedlem);

		mnHjlp = new JMenu("Hj\u00E4lp");
		mnHjlp.setBounds(243, 11, 107, 22);
		contentPane.add(mnHjlp);

		lblHjlp = new JLabel("Hj\u00E4lp");
		mnHjlp.add(lblHjlp);

		lblOmProgrammet = new JLabel("Om programmet");
		mnHjlp.add(lblOmProgrammet);
	}
}
