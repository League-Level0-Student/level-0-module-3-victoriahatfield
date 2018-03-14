import javax.swing.JOptionPane;

public class PiDay {
	public static void main(String[] args) {
		String pi = ("3.14159265358979323846264338327950288419716939937510582");

		for (int i = 0; i < 4; i++) {
			System.out.print(pi.charAt(i));

		}
		for (int i = 4; i < pi.length(); i++) {
			System.out.print(pi.charAt(i));
			String guess = JOptionPane.showInputDialog("What is the next number?");

			if (guess.equals(Character.toString(pi.charAt(4)))) {
				JOptionPane.showMessageDialog(null, "Your code works");

			} else {
				JOptionPane.showMessageDialog(null, "NO PIE FOR YOU!");
				System.exit(0);
			}
			
				
			

		}

	}

}
