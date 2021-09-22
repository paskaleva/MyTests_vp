package FirstTests;

import java.util.Scanner;

public class HelloClass_v03 {
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
	
		System.out.print("Enter your first name: ");
		String fName = scanner.nextLine();
	 
		System.out.print("Enter your second name: ");
		String sName = scanner.nextLine();
		
		System.out.print("Enter your family name: ");
		String familyName = scanner.nextLine();
		
		System.out.print("Enter your age: ");
		int age = scanner.nextInt();
		
		scanner.close();
		
		System.out.println("My name is " + fName + " " + sName + " " + familyName + ". I am " + age + " old.");
		
	}

}
