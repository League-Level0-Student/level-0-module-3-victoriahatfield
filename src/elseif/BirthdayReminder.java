
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "January something";
		String dadsBirthday = "Febuary something";
		String myBirthday = "November 28";

		// 2. Find out which birthday the user wants and and store their response in a variable

		String name=JOptionPane.showInputDialog(null, "Who's birthday do you want?");
	
		// 3. Print out what the user typed
		JOptionPane.showMessageDialog(null, "Ok, you want "+name+"'s Birthday.");
		
		// 4. if user asked for "mom"
	if (name.equals("mom")) {
		JOptionPane.showMessageDialog(null, "My moms birthday is "+momsBirthday+"!");
	}
			//print mom's birthday
		// 5. if user asked for "dad"
	if (name.equals("dad")) {
		JOptionPane.showMessageDialog(null, "My dads brithday "+dadsBirthday+"!");
	}
			// print dad's birthday
		// 6. if user asked for your name
	if (name.equals("my")) {
		JOptionPane.showMessageDialog(null, "My birthday is "+myBirthday+"!");
	}
	else if (name.equals("you")) {
		JOptionPane.showMessageDialog(null, "My birthday is "+myBirthday+"!");
	}
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
