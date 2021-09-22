package FirstTests;

import javax.swing.JOptionPane;

public class Address {
	
	//a class that prints your full name, street address, city, state, and 	zip code on three separate lines
	public static void main (String[] args)
	{
		String inputName = JOptionPane.showInputDialog(null,"What is yourfull name?");
		
		String inputStreet = JOptionPane.showInputDialog(null,"What street do you live?");
		
		String inputCity = JOptionPane.showInputDialog(null,"What is the name of the city you live?");
		
		String inputCountry = JOptionPane.showInputDialog(null,"Which is your country?");
		
		String inputZipCode = JOptionPane.showInputDialog(null,"What's the zip code?");
		
		JOptionPane.showMessageDialog(null, "My name is " + inputName + ". " + "\n" 
												+ "I live in " + inputCity + ", " + inputCountry + "\n" 
												+ "at " + inputStreet + "Str, " + inputZipCode );
		
	}
	

}
