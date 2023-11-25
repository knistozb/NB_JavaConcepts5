
///// JAVA Class 9 part 4.a: on May 21, 2023, Sunday with Instructor AP ////


package nb_cl9_abstract_pkg;

public class NB_cl9notes_NonAbstractA implements InterfaceY, InterfaceZ {
//public class NB_cl9notes_NonAbstractA extends NB_cl9notes_abstractB {

	
	// Abstraction: Data abstraction is the process of hiding certain details and showing only essential information to the user.
			// Abstraction can be achieved with either abstract classes or interfaces 
	
	// The abstract keyword is a non-access modifier, used for classes and methods:
		// Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
			// An abstract class can have both abstract and regular methods:
			// Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
	
		// Another way to achieve abstraction in Java, is with interfaces.
			// An interface is a completely "abstract class" that is used to group related methods with empty bodies:
			// To access the interface methods, the interface must be "implemented" (kinda like inherited) by another class with the implements keyword (instead of extends). 
					// The body of the interface method is provided by the "implement" class:
			// Notes on Interfaces:
				// Like abstract classes, interfaces cannot be used to create objects (in the example above, it is not possible to create an "Animal" object in the MyMainClass)
				//	Interface methods do not have a body - the body is provided by the "implement" class
				//	On implementation of an interface, you must override all of its methods
				//	Interface methods are by default abstract and public
				//	Interface attributes are by default public, static and final
				//	An interface cannot contain a constructor (as it cannot be used to create objects)

			//	Why And When To Use Interfaces?
				//	1) To achieve security - hide certain details and only show the important details of an object (interface).
				//	2) Java does not support "multiple inheritance" (a class can only inherit from one superclass). However, it can be achieved with interfaces, because the class can implement multiple interfaces. 
		
			//		Note: To implement multiple interfaces, separate them with a comma.		
	
	
	// In Java, there are 2 ways to do the abstraction: abstract class and interface
		// class is abstract means it can hold both abstract methods and non-abstract methods (main method)... For example class B (NB_cl9notes_abstractB)
			 	// for a method to be abstract, its class needs to abstract
		// class is non-abstract means, it can only have non-abstract methods. For example this current class A (NB_cl9notes_NonAbstractA)
	
	// Rules for a method to be abstract:
		// 1. it cannot have a body.
		// 2. it cannot be static.... static/fixed/stationary means one thing/value VS abstract/dynamic means multiple values/perspectives
		// 3. you must have the word abstract either in front of return type (like abstract void...) or in front of access modifier (like abstract public...).
		// 4. You cannot make an object out of abstract class for the non-static methods
		// 5. Inheritance must be done by overriding the parent method in the child class for calling non-abstract class to abstract class
	
	
	// In order for inheritance to happen between abstract and non-abstract class, all the method that are abstract method has to have an override in the child class
		// subclass has to be implemented using the override
			// Implemented means: in order to have a method with a body
	
	
	// IQA 1 : What is the way to achieve 100% abstraction?
		// only way is using the interface	
		// ==> another way is through abstract class but here is the possibility that the class might have non-abstract method
	
	// Abstract: non static for sure, no body
	// Non-abstract: non-static, yes body
	
	// Interface: it has to be the same type like interface to interface for inheritance to work
		// cannot have executable method like main in class 
		// class can implement the interface, but cannot extend (inheritance)
		// Interface can do all abstract methods, but it allows to have a "default body" if you want to
	
	// IQA 2: How can a class get something from a interface?
		// The class will have to use the keyword "implement" the given interface 
	
	// IQA 3: Can a class implement multiple interfaces at the same time?
		// Even though a class cannot inherit (extend) multiple classes, it can implement more than 1 interfaces
	
	// IQA 4: How can a class inherit an abstract class?
		// It must implement all the unimplemented methods from the abstract class because a non-abstract class cannot have any unimplemented methods
	
	// IQA 5: How can we instantiate (make an object) an abstract class?
		// we cannot do that in abstract class. 
	
	// IQA 6: If we cannot instantiate then how can we get the stuff?
		// we have to inherit the abstract class and then do the override in the child class
	
	
	// Before Sunday, May 28, 2023:
		// 1. Create a free github account: https://github.com/
		// 2. Download github desktop: https://desktop.github.com/
		// 3. Download and install gitbash:  https://git-scm.com/download/mac
		// 4. 
	
	
	// ============ ============= ============ ========== ========== ================== ==================== 
	
	
	
	public static void main(String[] args) {

		
		NB_cl9notes_NonAbstractA.a1();  // ??????? WHY TF Is it not working?	
		
//		InterfaceY.testAP();
		// CLASSname.methodName  .... same rule to call the static method
		// InterfaceName.methodname 
		
//		NB_cl9notes_abstractB b = new NB_cl9notes_abstractB();   // wont work coz object cannot be made for abstract class
//		b.abc();
		
	}

	
	public static void a1() {
		System.out.println("a1");
	}
	
	public static void a2() {
		System.out.println("a2");
	}


	@Override
	public void z1() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void y1() {
		// TODO Auto-generated method stub
		
	}
	
	public void y2() {
		System.out.println("orange");
	}
	
	
//	@Override
//	public void test() {
//		System.out.println("I am a test method");
//	}
//
//	@Override
//	public void b2(int a, int x) {
//		System.out.println(a+a+x+x);
//	}
}
	
	
	
	