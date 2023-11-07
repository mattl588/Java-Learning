public class VariableScope //this is not my code. I made minor alterations. Credit belongs to Rishabh Mahrsee and geeksforgeeks.org. 
{
    static int x = 11; //static int has scope of being accessible within the class. 
    private int y = 33; //private variable. ONLY accessible within class. 
    public void method1(int x)
    {
    	VariableScope t = new VariableScope(); 
        VariableScope.x = 22; //altering the static int. This changes the value of the static integer. Can do "this" or "VariableScope". Interchangeable.
        y = 44; //variable created and destroyed as method1(int x) is called. 
 
        System.out.println("VariableScope.x: " + VariableScope.x);
        System.out.println("t.x: " + t.x);
        System.out.println("t.y: " + t.y);
        System.out.println("y: " + y);
    }
 
    public static void main(String args[])
    {
    	VariableScope t = new VariableScope(); //new object created
        t.method1(5); //invoking a method of object t. 
    }
}
