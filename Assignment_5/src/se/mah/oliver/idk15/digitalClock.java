package se.mah.oliver.idk15;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class digitalClock extends JFrame {
	private ClockLogic ClockLogik = new ClockLogic(this);
	JLabel time = new JLabel("New label");
	private boolean alarmOn = false;

	public void setTimeOnLabel() {

	}

	public void activateAlarm() {

	}

	private JPanel contentPane;
	private JTextField texthour;
	private JTextField textminute;
	JLabel lblAlarmSetAt = new JLabel("Alarm set at");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					digitalClock frame = new digitalClock();
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
	public digitalClock() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(digitalClock.class.getResource("/icon/alarmclock.jpg")));
		setTitle("Alarm");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JButton btnSetAlarm = new JButton("set alarm");
		btnSetAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean errorinput = false;
				String alarmHours = texthour.getText();
				String alarmMinute = textminute.getText();
				int alarmhour = 0;
				int alarmminute = 0;
				try {
					alarmhour = Integer.parseInt(alarmHours);
					alarmminute = Integer.parseInt(alarmMinute);
					if (alarmhour < 0 || alarmhour > 23) {
						errorinput = true;
					}
					if (alarmminute < 0 || alarmminute > 59) {
						errorinput = true;
					}
				} catch (NumberFormatException s) {
					errorinput = true;
				}
				if (errorinput) {
					lblAlarmSetAt.setText("error");
				} else {
					lblAlarmSetAt.setText("alarm at:" + ClockLogic.nice(alarmhour) + ":" + ClockLogic.nice(alarmminute));
					ClockLogik.setAlarm(alarmhour, alarmminute);
					texthour.setText("");
					textminute.setText("");
				}
			}
		});
		btnSetAlarm.setBounds(173, 173, 89, 23);
		panel.add(btnSetAlarm);

		JButton btnClearAlarm = new JButton("clear alarm");
		btnClearAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblAlarmSetAt.setText("alarm cleared");
				ClockLogik.clearAlarm();
				alarm(false);
			}
		});
		btnClearAlarm.setBounds(272, 173, 89, 23);
		panel.add(btnClearAlarm);

		texthour = new JTextField();
		texthour.setBounds(63, 136, 86, 20);
		panel.add(texthour);
		texthour.setColumns(10);

		textminute = new JTextField();
		textminute.setBounds(63, 174, 86, 20);
		panel.add(textminute);
		textminute.setColumns(10);

		JLabel lblHour = new JLabel("Hour");
		lblHour.setBounds(7, 139, 46, 14);
		panel.add(lblHour);

		JLabel lblMinute = new JLabel("Minute");
		lblMinute.setBounds(7, 177, 46, 14);
		panel.add(lblMinute);

		time.setBounds(229, 27, 159, 88);
		panel.add(time);

		lblAlarmSetAt.setBounds(215, 136, 89, 14);
		panel.add(lblAlarmSetAt);
	}

	public void setTimeOnLabel(String Time) {
		time.setText(Time);

	}

	public void alarm(boolean activate) {
		if (activate) {
			Toolkit.getDefaultToolkit().beep();
		} else {
			alarmOn = false;
		}
	}
}
