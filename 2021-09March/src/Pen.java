
public class Pen {

	private String manufacturer;	//Cannot be accessed directly
	
	
	String ink;				//Can be accessed directly
	String color;			//Can be accessed directly
	double inkThickness;	//Can be accessed directly
	
	
	public String getManufacturer() {		//Getter Method for accessing the name of manufacturer
		return manufacturer;
	}
	
	public void setManufacturer(String manufacturer) {		//Setter Method for setting name of manufacturer
		this.manufacturer = manufacturer;
	}
}

