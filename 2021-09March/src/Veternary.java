
public class Veternary {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog();		// Object of Dog.java initialized with no parameter
		Dog dog2 = new Dog("German Shephard"); 		//Object of Dog.java initialized with one parameter
		Dog dog3 = new Dog("Rottweiler", "Meat");	//Object of Dog.java initialized with two parameter
		
		dog1.setKind("Rottweiler");		// Kind of dog1 is set through method which have encapsulated function.
		System.out.println("The Scientific Name of Dog1 is: " + dog1.Genus + " " + dog1.Species);
		System.out.println("The Scientific Name of Dog1 is: " + dog2.Genus + " " + dog2.Species);
		System.out.println("The Scientific Name of Dog1 is: " + dog3.Genus + " " + dog3.Species);
		
		System.out.println("");
		System.out.println("");

		System.out.println("The Kind of Dog2 is: " + dog2.getKind());
		System.out.println("The Kind of Dog3 is: " + dog3.getKind());
	}

}

