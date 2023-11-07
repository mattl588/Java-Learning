
public class JavaBasics { //public class name must match file name 
	public static void main(String[] args) { /*static means an instance of a class 
												need not exist for method to be called.
												void, of course, means the method will not return anything.
												IMPORTANT: classes should have uppercase first letters.
												classes are either PUBLIC, DEFAULT, PROTECTED, or PRIVATE.
*/
		System.out.print("Testing");
	}
	public static void printHello(String[] args) { //note that methods, by convention, have a lowercase first letter.
		System.out.print("Hello!");
	}
}

