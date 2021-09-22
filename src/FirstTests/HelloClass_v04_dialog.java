package FirstTests;

import javax.swing.JOptionPane;

public class HelloClass_v04_dialog {
	
	/*
	//Pop-out a massage window with the given strung
	public static void main (String[] args)
	{
		JOptionPane.showMessageDialog(null, "Hello, Vessy!");
	}
	*/
	
	
	//Pop-out input diolog where the user enter the information asked. In the console is printed the entered line
	public static void main (String[] args)
	{
		String inputString = JOptionPane.showInputDialog(null,"What is your name?");
		
		System.out.println("My name is " + inputString);
	}
	
	
}
