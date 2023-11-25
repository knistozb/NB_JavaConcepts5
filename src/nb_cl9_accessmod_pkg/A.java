
///// JAVA Class 9 part 2.a: on May 21, 2023, Sunday with Instructor AP ////


package nb_cl9_accessmod_pkg;

import nb_cl9_accessPart2_pkg.C;
import nb_cl9_accessPart2_pkg.D;

public class A extends X {

	
	// Access Modifiers: they are basically the keywords that restrict things what is accessible and what is not accessible 
		// keywords that are used in OOP (object-oriented programming) in order to specify the accessibility of the methods, classes, constructors, and other members of the class.
	
	// In Java, there are 4 main types:
		// 1. public access modifier: accessible to every class and package as long as we call them right
	
		// 2. private access modifier: gives access to methods in the same class only
			// rest of those private ones will error out
			// can be called within same package only
			// even after inheritance, if certain method is made private then this method cannot be inherited
	
		// 3. default : means you put nothing at the front
			// non return type including void, non-static...... for constructor then no public/private to make it default
			// only invoke/call classes of the same package. if you are in different package then will error out
	
		// 4. protected : almost like default, but if it is being inherited then it is fine even if different packages
			// if not inherited then it will error out since they are in different packages
	
	
	// ======== ============== ======================= ============== ======================= ============== ===============
	
	
	
	
	public static void main(String[] args) {

	
		a1();
		x1();
		d1();
				
		A a = new A();
		a.a2();
		a.x2();
		a.d2();
		
		B.b1();
		B b = new B();
		b.b2();
		
		C.c1();
		C c = new C();
		c.c1();
		c.c3();
				
	}
	
	
	protected static void a1(){
			
		System.out.println("a1");
	}
		
	protected void a2() {
			
		System.out.println("a2");
	}
	
//	A(){
//		System.out.println("Something");
//	}

}
	


