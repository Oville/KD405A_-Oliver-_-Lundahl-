package se.mah.ke.k3lara;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.lang.reflect.Array;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class HouseGui extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea txtr;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public HouseGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane);
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		//1.2
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
		
		System.out.println("Storleken p� huset" + houseSize);
		System.out.println("Hus 1 �r byggt" + houseYear);
        System.out.println("Storleken p� huset" + house2Size);
		System.out.println("Hus 2 �r byggt" + house2Year);

		System.out.println("Storleken p� hus 2" + house3Size);
		System.out.println("Hus 3 �r byggt" + house3Year);
		
		textArea.append("Hus 1 �r byggt" + houseYear + "och �r" + houseSize + "kvm stort" + "\n");
		textArea.append("Hus 2 �r byggt" + house2Year + "och �r" + house2Size + "kvm stort" + "\n");
		textArea.append("Hus 3 �r byggt" + house3Year + "och �r" + house3Size + "kvm stort" + "\n");
		//1.3
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
		
		for(int i = 0; i < myHouses.length; i++){
			textArea.append("Huset �r byggt" + myHouses[i].getYearBuilt() + " och �r" + myHouses[i].getSize() + " kvm stort" + "\n");
		}
		//1,4
		ArrayList<House> myArea;
		myArea = new ArrayList<House>();
		int year;
		int size;
		Random rand = new Random();
		size = rand.nextInt((1000 - 10)+ 1) + 10;
		year = rand.nextInt((2015 - 1800)+ 1) + 1800;
		for(int i = 0; i < 100; i++){
			year = rand.nextInt((2015 - 1800)+ 1) + 1800;
			size = rand.nextInt((1000 - 10)+ 1) + 10;
			myArea.add(new House(year, size));
		}
		for(House house : myArea){
			house.getYearBuilt();
			house.getSize();
			textArea.append("Huset �r byggt" + String.valueOf(house.getYearBuilt()) + " och �r " + String.valueOf(house.getSize()) + " kvm stort" + "\n");
		}
	}
}
	

