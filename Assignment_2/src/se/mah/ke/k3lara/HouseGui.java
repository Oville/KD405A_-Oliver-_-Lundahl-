package se.mah.ke.k3lara;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class HouseGui extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseGui frame = new HouseGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public HouseGui() {
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 434, 261);
		getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

		// 1.2
		House house1;
		House house2;
		House house3;
		house1 = new House(1862, 342);
		house2 = new House(2000, 138);
		house3 = new House(1943, 98);

		int houseSize = house1.getSize();
		int houseYear = house1.getYearBuilt();
		int house2Size = house2.getSize();
		int house2Year = house2.getYearBuilt();
		int house3Size = house3.getSize();
		int house3Year = house3.getYearBuilt();

		System.out.println("Storleken p� huse 1 �r" + " " + houseSize);
		System.out.println("Hus 1 �r byggt" + " " + houseYear);
		System.out.println("Storleken p� hus 2" + " " + house2Size);
		System.out.println("Hus 2 �r byggt" + " " + house2Year);

		System.out.println("Storleken p� hus 3" + house3Size);
		System.out.println("Hus 3 �r byggt" + " " + house3Year);
		// 1.3
		House[] myHouses = new House[10];
		myHouses[0] = new House(1822, 131);
		myHouses[1] = new House(1999, 193);
		myHouses[2] = new House(1901, 80);
		myHouses[3] = new House(1811, 294);
		myHouses[4] = new House(1863, 751);
		myHouses[5] = new House(1836, 182);
		myHouses[6] = new House(1905, 257);
		myHouses[7] = new House(1911, 364);
		myHouses[8] = new House(1801, 99);
		myHouses[9] = new House(2012, 120);

		for (int i = 0; i < myHouses.length; i++) {
			textArea.setText("Huset �r byggt" + " " + myHouses[i].getYearBuilt() + " och �r" + " "
					+ myHouses[i].getSize() + " kvm stort" + "\n");
		}
		// 1,4
		ArrayList<House> myHouse;
		myHouse = new ArrayList<House>();
		int year;
		int size;
		Random r = new Random();
		size = r.nextInt((1000 - 10) + 1) + 10;
		year = r.nextInt((2015 - 1800) + 1) + 1800;
		for (int i = 0; i < 100; i++) {
			year = r.nextInt((2015 - 1800) + 1) + 1800;
			size = r.nextInt((1000 - 10) + 1) + 10;
			myHouse.add(new House(year, size));
		}
		for (House house : myHouses) {
			house.getYearBuilt();
			house.getSize();
			textArea.append("Huset �r byggt" + " " + String.valueOf(house.getYearBuilt()) + " och �r "
					+ String.valueOf(house.getSize()) + " kvm stort" + "\n");
		}
	}
}
