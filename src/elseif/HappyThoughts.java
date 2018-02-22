package elseif;

import javax.swing.JOptionPane;

public class HappyThoughts {
	public static void main(String[] args) {
		String yn=JOptionPane.showInputDialog("Are you happy? (: (:");
		if (yn.equals("Yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever your doing! (:");
		}
		if (yn.equals("No")) {
			String newyn=JOptionPane.showInputDialog("Do you want to be happy?");
			if (newyn.equals("Yes")) {
				JOptionPane.showMessageDialog(null, "Change something.");
			}
			if (newyn.equals("No")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever your doing! (:");
			}
		}else {
			JOptionPane.showMessageDialog(null, "Im SoRrY I cAnT hElP...");
		}
	}
}
