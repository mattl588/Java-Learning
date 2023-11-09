/*  A point of contention for me is the presence of both interfaces and abstract classes in Java. This script
 * has been written to exploit and make clear the differences between the two data structures. 
 * My reference: https://www.geeksforgeeks.org/difference-between-abstract-class-and-interface-in-java/
 * This code is my own. 
*/
public class interfaces_and_abstract_classes { //public class
	public static void main(String[] args) { //automatically executed
		 ClassOne x = new PrintStatements(); //new PrintStatements object. 
		 //PrintStatements t = new PrintStatements(); //alternative syntax for line above- right?
		 x.printFirstLine();
		 x.printSecondLine(); 
		 PrintStatements2 y = new PrintStatements2(); //new instance of PrintStatements2 class. 
		 y.printThirdLine();	 
	}
}

class PrintStatements extends ClassOne {
	void printFirstLine() { //defining abstract blueprint of first line
		System.out.println("First line to be printed.");
	}
}

class PrintStatements2 implements PrintThirdLine {
	public void printThirdLine() { //implementations of interface methods MUST be public. 
		System.out.println("Third line to be printed");
	}
}

abstract class ClassOne { //can contain non-abstract methods too. 
	abstract void printFirstLine(); //unspecified blueprint for abstract method.
	
	void printSecondLine() { //non-abstract method within the abstract class. 
		System.out.println("Second line to be printed.");
	}
}

interface PrintThirdLine { //interface with blueprints for methods to be defined later. 
	void printThirdLine();
}