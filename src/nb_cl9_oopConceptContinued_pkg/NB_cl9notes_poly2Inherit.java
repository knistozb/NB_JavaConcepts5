
///// JAVA Class 9 part 1.a: on May 21, 2023, Sunday with Instructor AP ////


package nb_cl9_oopConceptContinued_pkg;

public class NB_cl9notes_poly2Inherit {

	
	
	// Overload can come from both concept of polymorphism and inheritance. 
		// Given same methodName where object can be overloaded but on the right hand side, the constructors can be made different from different class and arguments. This way, we are calling methods from the constructor side
		// if className and constructor then right away think there is inheritance going on where they are using overloaded concept. Multiple same classNames but different constructors, and constructor's method is being called
	
	// Inheritance with Polymorphism:
		// If a class is being inherited by other classes, you can make a object of that class as Parent objName = new Child();
			// For example: Animal(parent), dog (child), pig (child)
			// Animal abc = new Dog();
			// and if we do that, animal object will have access to all method from Animal class
			// But if there are any override method animal object will invoke those override methods from child class.
			// during overrides, the child will get the preference to be invoked/called
	
	// private: it makes it accessible to that same class only
	
	// TestNG - provides additional functionalities like test annotations, prioritization, grouping, parameterization, and sequencing techniques in the codes which was not possible in Junit.
			// Besides managing, it also provides detailed reports of our test cases run along with summary of what passed and what failed along with failure trace map of its exact location.
				// Using the detailed report, if any bugs, they can be easily and quickly located and fixed by the developers.
			// Generates reports in proper format that includes the # of test cases runs, # of test cases passed, # of test cases failed, and the #test cases that were skipped.
			// multiple test cases can be grouped and set priorities.
	
	
	
	// ===================== ============================== =============== =============== =============== ===============
	
	
	/*
	
// Example 1:
	
	public static void main(String[] args) {

		Animal d = new Dog();  // Polymorphism with inheritance: if you have overload method and you do not want to call the parent, the override concept is always gonna call the child first unless you use super keyword
		Animal a = new Animal();
		
//		d.abcfromanimal();  // abc from different dog....even if same methodname then the child method will be called before parent
//		a.abcfromanimal();
//		d.AnimalSound();
		
//		a.abcfromanimal();
		
		
		Dog dd = new Dog();// same as below; just 2 different ways to call the same result
		dd.AnimalSound();  
		Animal ddd = new Dog();  // same as above
		ddd.AnimalSound();  // same result as top; just 2 ways to call it
//		super.AnimalSound();  // wont work coz super can only be called inside a non-static method. here main method is always static
		
		Animal aa = new Animal();
//		Animal ddd = new Dog();
		Animal p = new Pig();  // CLASSname objectName = new constructor();
			// Inheritance makes this possible to have className and constructor....if 2 different classes are given in the object creation then automatically learn that left side is superclass (parent) while right side constructor is subclass(child)
		Animal aaa = new Animal();
		aaa.AnimalSound();
		
	}

}
	*/




