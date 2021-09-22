package FirstTests;

import javax.swing.JOptionPane;

public class HelloClass_v05_dialog_in_out {
	
	public static void main (String[] args)
	{
		String inputString = JOptionPane.showInputDialog(null,"What is your name?");
		
		JOptionPane.showMessageDialog(null, "Hello, " + inputString + "!");
		
	}
	
	//ToDo
	//Change the information dialog name

}
