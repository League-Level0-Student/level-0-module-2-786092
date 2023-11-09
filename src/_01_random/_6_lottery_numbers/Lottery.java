package _01_random._6_lottery_numbers;
import java.util.Random;

import javax.swing.JOptionPane;
public class Lottery {
	public static void main(String[] agrs) {
		String lottery = "";
		Random ran = new Random();
		for(int num=0; num<6; num+=1) {
			lottery+= ran.nextInt(100)+ " "; 
		}
		JOptionPane.showMessageDialog(null, lottery, "Lottery", JOptionPane.PLAIN_MESSAGE);
	}
}
