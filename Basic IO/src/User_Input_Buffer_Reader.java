import java.io.*; // * means importing all classes. Works like Python. java.io is the input/output package. 

public class User_Input_Buffer_Reader {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader( /*we have System.in wrapped inside a InputStreamReader, which
													itself is wrapped within a BufferedReader */
				new InputStreamReader(System.in));
		String phrase; //declaring string
		try {
			System.out.println("Enter a phrase");
			phrase = reader.readLine(); //line where input is taken. reader object has method readLine()
			System.out.println("Your phrase is: " + phrase); 
		}
		catch (Exception e) { //e is an exception variable. we can do e.toString() to make it a string. 
		}
	}
}
