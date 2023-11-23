package _03_string_conversion._1_intro;

import javax.swing.JOptionPane;

public class String_Conversion {
	public static void main(String[] agrs) {
		String example=JOptionPane.showInputDialog("Enter a number: ");
		int num = Integer.parseInt(example);
		num++;
		JOptionPane.showMessageDialog(null, num);
	}
}
