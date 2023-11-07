import java.util.*; //could also just do java.util.Scanner. This is probably faster as it loads only Scanner. 

public class User_Input_Scanner {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String firstString = scn.nextLine(); //nextLine is for sentences, not just strings. 
		System.out.println("First string is " + firstString);
		
		//System.out.println("First string is " + scn.nextLine()); //this works too! No need to convert type str to type object.
		
		String secondString = scn.nextLine(); //using the wrapper class to make the string an object. 
		System.out.println("Second string is " + secondString);
		
		Float firstFloat = scn.nextFloat(); //nextFloat, nextInt, next(), etc. are all input methods. 
		System.out.println("Float value is " + firstFloat);
	}
}
