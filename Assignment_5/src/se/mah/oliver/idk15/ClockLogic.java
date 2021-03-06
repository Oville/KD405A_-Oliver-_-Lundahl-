package se.mah.oliver.idk15;

import java.util.Calendar;

public class ClockLogic {
	private digitalClock DigitalClock;
	private int alarmHour;
	private int alarmMinute;

	private class ClockThread extends Thread {
		@Override
		public void run() {
			while (true) {
				Calendar C = Calendar.getInstance();
				int Hour = C.get(Calendar.HOUR_OF_DAY);
				int Minute = C.get(Calendar.MINUTE);
				int Sec = C.get(Calendar.SECOND);
				DigitalClock.setTimeOnLabel(nice(Hour) + ":" + nice(Minute) + ":" + nice(Sec));
				if (Hour == alarmHour && Minute == alarmMinute) {
					DigitalClock.alarm(true);
				}
				try {
					Thread.sleep(900);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		}
	}

	public static String nice(int i) {
		String s = String.valueOf(i);
		if (s.length() == 1) {
			s = "0" + s;
		}
		return s;
	}

	public ClockLogic(digitalClock DigitalClock) {
		this.DigitalClock = DigitalClock;
		Thread t = new ClockThread();
		t.start();
	}

	public void setAlarm(int hour, int minute) {
		System.out.println("New alarm: " + hour + ":" + minute);
		alarmHour = hour;
		alarmMinute = minute;
	}

	public void clearAlarm() {
		System.out.println("Alarm Cleared");
		alarmHour = 0;
		alarmMinute = 0;
	}
}