
public class Dog {
	
	static String Genus = "Canis";
	
	static String Species = "lupus";
	
	String Kind; 				
	
	String food;						
	String color;
	
	
	public Dog() {			//Constructor with no parameter
		
	}
	
	public Dog(String Kind) {		//Constructor with one parameter
		setKind(Kind);
	}
	
	public Dog(String Kind, String food) {		// Constructor with two parameters
		setKind(Kind);
		this.food = food;
	}
	
	
	public String getKind() {	
		return Kind;
	}

	public void setKind(String kind) {	
		Kind = kind;			//The concept of Encapsulation is used here. As the Kind of dog will set from this method but user don't know how it is happening.
	}
	
	


}


