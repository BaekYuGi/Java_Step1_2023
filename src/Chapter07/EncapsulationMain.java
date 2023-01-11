package Chapter07;

import javax.swing.JOptionPane;

public class EncapsulationMain {

	public static void main(String[] args) {

		int side;
		int height;
		int area;

		Encapsulation En = new Encapsulation();

		side = Integer.parseInt(JOptionPane.showInputDialog("밑변"));
		height = Integer.parseInt(JOptionPane.showInputDialog("높이"));

		area = En.Cal_Area(side, height);
		System.out.println("넓이 : " + area);

	}

}
