class Constants { //only one public class per file; has same name as file name. 
    public static int a = 3;
    public static int b = 10;
    public static int c = 25;
}

abstract class Calculation { //abstract classes can only be instantiated if inherited. 
	abstract int sum(); //framework for some sum() method to be later defined. 
}

class Add extends Calculation { //inheritance. "Add" is subclass, "Constants is superclass. 
	int sum() {
		int sum = Constants.a + Constants.b + Constants.c;
		return sum;
	}
}

public class abstract_classes {
    public static void main(String[] args) {
    	Add a = new Add();
    	int solution = a.sum();
    	System.out.println("The sum of " + Constants.a + ", " + Constants.b + ", and " + Constants.c + " is " + solution);
    }
}