public class setter_and_getter_encapsulation { 
      
    static String user_name; //declaring variables in memory; statically-typed language. 
    static int height;
    static int weight; 
  
    static void set(String n, int h, int w) {  //setter method 
        setter_and_getter_encapsulation.user_name = n; // prefix setter_and_getter is optional. 
        setter_and_getter_encapsulation.height = h;
        setter_and_getter_encapsulation.weight = w;
        
    } 
  
    static void get() { //getter method 
        System.out.println("Username is: " + user_name ); 
        System.out.println("Height is " + height + " inches"); 
        System.out.println("Weight is " + weight + " pounds");
    } 
  
    public static void main(String args[]) { 
        setter_and_getter_encapsulation.set("mattl588", 70, 145); 
        setter_and_getter_encapsulation.get(); 
    } 
} 