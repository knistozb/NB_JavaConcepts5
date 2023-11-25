
///// JAVA Class 9 part 4.b: on May 21, 2023, Sunday with Instructor AP ////


package nb_cl9_encapsulation_pkg;

public class B {

	
	
	
	/*
// Example 2:	
// Interview Question to demonstrate getter and setter concept:	
// public class Hello(){
	
	private int a = 10;
	private String b = "ball";
	
	
	public int getA() {
		return a;
		// return this.a;  // since same class and both non-static, you can simply call like that
	}
	
	public void setA(int a) {
		this.a = a;
	}

	public String getB() {
		return this.b;    //  use either or because since you are in the same class and non-static to non-static, you can call either way
		// return b; 	 //	
	}

	public void setB( String b) {
		this.b = b;
	}
}
	*/
	
	/*
// Example 1:	
	
	public static int z = 99;
	
	private static int x = 10;
	
	private int y = 20;
	
	
// Exercise 3: Using the eclipse shortcut to generate getter and sitter using right click then source...

	public static int getX() {
		return x;
	}

	public static void setX(int x) {
		B.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}	
	*/

	
//	Exercise 2: 
	
	public static int z = 99;
	
	private static int x = 10;
	
	private int y = 20;
	
	public static int getx() {  // getter = responsible to get something from private method
		return B.x;
	}
	
	public void setx(int newValue) {  // they change the variable name to the original name in the industry so keep that in mind
	this.x = newValue;  // whatever variable name you give at top, has to match at this bottom

//	public static void setx(int newValue) {
//		B.x = newValue;
		// left hand side (B.x): old value that we are trying to change
		// right hand side (newValue): new value that we are supposed to change to
	}
	
	public int gety() {  // getter = responsible to get something from private method
		return this.y;   // if you are both non-static and inside same class, you dont even need an object. Just use THIS keyword
//		B b = new B();	 // final answer same as above just different approach
//		return b.y;
	}
	
	public void sety(int y) {  // they change the variable name to the original name in the industry so keep that in mind
		this.y = y;  // whatever variable name you give at top, has to match at this bottom
	}
	
//	public void sety(int newValue) {  // set to change some values and does not need return so use void
//		System.out.println(y);  // 20 coz this is referring to class level global y before the change has been made to new y value
//		this.y = newValue;
//	}
		
	public static void test() {
		System.out.println(x+1);
	}
}	
	
	
	/*
// Exercise 1: 	
	public static void test() {
		
		System.out.println(x);
		B b = new B();
		System.out.println(b.y);
	}
	
	public static void test() {	
		System.out.println("test");
	}
}
	 */
	