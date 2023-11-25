
///// JAVA Class 9 part 4.a: on May 21, 2023, Sunday with Instructor AP ////


package nb_cl9_encapsulation_pkg;

public class A {

	
	
	
	// IQA 1: How can you make sure nobody else access our data? --> make it private
		// if something is private, let them be private. Instead, I am going to create another back door or public method to access them private data 
	
	// Oop Concept's 4 pillars:
		// Polymorphism: overload
		// Inheritance: override
		// Encapsulation: concept of accessing the shielded data...
			// uses getter (getDATA : accessing private data by creating public method) and setter (changing values for private ones by making/using public method)
				// for get() -- You are trying to fetch something so you need to have a return statement excluding void
				// for set() -- you are trying to change something, so you need void and don't need return
						// you can call change the value by: this.oldValue = newValue;
	
	
	
	// ========== ================ ===================== ================
	
	
	/*
// Exercise 2: For Non-static methods: values refer back to the original value for different objects we create... multiple values but original is referred to begin with

	public static void main(String[] args) {

		B b = new B();
		System.out.println(b.gety());  //20
		b.sety(25);
		System.out.println(b.gety()); // 25
		
		B b2 = new B();
		System.out.println(b2.gety());  // 20 coz for non-static, it refers back to original value for new object
	
	}
}	
	*/

	
// Exercise 1: For static methods: Values gets changed and updates everytime so everything that point on will refer to the last value instead of original ...Its 1 value or nothing

	public static void main(String[] args) {
		
		
		System.out.println(B.getx());  //10
		B.test();   //11
//		B.setx(100);
		System.out.println(B.getx());  // 100
		B.test();   // 101
				
		System.out.println(B.z);		
		B.z = 101;
		System.out.println(B.z);  // since it is static, value of z gets updated and changes from that point on
	
		B.test();   
		B b = new B();   // you need object here to import data from different class for non-static methods
		System.out.println(b.gety());
		System.out.println(B.getx());
	}

}
