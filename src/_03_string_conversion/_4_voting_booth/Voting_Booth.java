package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class Voting_Booth {
	public static void main(String[] agrs) {
		String age=JOptionPane.showInputDialog("How old are you? ");
		int vote = Integer.parseInt(age);
		if(vote>=18) {
			String president = JOptionPane.showInputDialog("Who should the next president be? ");
			if(president.equals("Donald Trump")) {
				JOptionPane.showMessageDialog(null, "Good Answer");
			}
			if(president.equals("Joe Biden")) {
				JOptionPane.showMessageDialog(null, "Not a Good Answer");
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "Nobody cares what you think");
		}
	}
}