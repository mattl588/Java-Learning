
public class privateVariablePractice {
	public static void main(String[] args) {
		Test t = new Test();
		//System.out.println(t.age); //this fails. The variable is private and not accessible outside of the class. 
		t.printAge();
	}
}

class Test {
	private int age = 29; 
	
	void printAge() {
		System.out.println("This person is " + age + " years old.");
	}
}