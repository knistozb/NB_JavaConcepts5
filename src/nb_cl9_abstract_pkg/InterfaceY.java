
///// JAVA Class 9 part 4.d: on May 21, 2023, Sunday with Instructor AP ////


package nb_cl9_abstract_pkg;

public interface InterfaceY extends InterfaceZ{

	// point of interface is to achieve 100% abstractions
	// by default you don't need to put abstract at the front
	// you need to be in the same type for inheritance like interface to interface, abstract to abstract or non to non
	// it cannot have main because interface cannot have any executable method like main in the class
	
	
	
	
	public static void testAP() {
		
	}
	
	public void y1();
	
	default void y2() {
		System.out.println("default y2");
	}
	
}
