import javax.swing.JOptionPane;

public class OwnAdventure {
	public static void main(String[] args) {
		String begin = JOptionPane.showInputDialog("Are you ready to begin, Adventurer?");
		if (begin.equals("y")) {
			JOptionPane.showMessageDialog(null, "Great, lets begin!");
			intro();
		}
		if (begin.equals("n")) {
			JOptionPane.showMessageDialog(null, "Good bye");
		}
	}

	public static void intro() {
		JOptionPane.showMessageDialog(null,
				"You are an adventurer looking for a way\n out of the jungle you have\n lost yourself in.\n you must now find your way home.");
		String story = JOptionPane
				.showInputDialog("y=yes\n n=no\n #=number of option\n Good luck mortal\n type y to begin");
		if (story.equals("y")) {
			choiceone();
		}
	}

	public static void choiceone() {
		String path = JOptionPane.showInputDialog(
				"Before you mortal, is two paths:\n 1- the jungle is thicker and darker\n you can hear the cries of animals\n 2- this path is less dense, but the path is steep and slippery");
		if (path.equals("1")) {
			JOptionPane.showMessageDialog(null,
					"you walkdown the path as the trees block out much of the sunlight\n You can hear snarling of animals\n and the smell of carnage.\n"
							+ "Suddenly you see a building, old and decayed.\n it smells terribly of decaying plants.\n you don't look at the builing long before you hear the loud howling of\n canines. Wolves.");
			String wolfhouse = JOptionPane.showInputDialog(
					"You have two options:\n 1-Go into the old susptsious house.\n 2-Keep going and risk the wolves");
			if (wolfhouse.equals("1")) {
				JOptionPane.showMessageDialog(null,
						"You take a step into the musty cabin.\n all seems fine when all of a sudden a large spike comes from behind\n and impales you.\n you fall limp to the spike; you have lost.");

			}
			if (wolfhouse.equals("2")) {
				JOptionPane.showMessageDialog(null,
						"you ignore the warnings and keep on walking.\n after a while of walking you sre suddenly surrounded by wolves\n "
								+ "in a matter of seconds you are torn to shreds by the blood stained teeth and claws of the large canines.\n you have died");
			}
		}
		if (path.equals("2")) {
			JOptionPane.showMessageDialog(null,
					"You scamble down the steep hill when you reach a river.\n You hear a loud BOOM when you feel see some pebbles fall next to you.\n"
							+ "Looking up you see a large clusters of boulders above.\n cornred you look behind you to see a cliff the river leads off of.");
			String runjump = JOptionPane.showInputDialog(
					"Your options are:\n 1-Try to find shelter from the falling rocks\n 2-Jump off the water fall and hope for the best.");
			if (runjump.equals("1")) {
				JOptionPane.showMessageDialog(null,
						"you try to find shelter but you cannot see any form of help from your obvious doom.\n You close you eyes and let the large boulders crush your feeble body.\n you have died");

			}
			if (runjump.equals("2")) {
				JOptionPane.showMessageDialog(null,
						"You turn around and take a running start and jump.\n unsupisingly you fall face-first to your dwath.\n"
								+ " You impale youself on the long stiral rocks at hr bottom.\n You died a really dumb death.\n like seriously\n did you think you would fly?");

			}

		}
		
	}
}
