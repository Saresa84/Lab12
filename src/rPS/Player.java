package rPS;

public abstract class Player {
	//variables
	private String Name;
	private String Rvalue;
	
	//abstract method
	public abstract String generateRoshambo();

	//getters and setters
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getRvalue() {
		return Rvalue;
	}

	public void setRvalue(String rvalue) {
		Rvalue = rvalue;
	}
	
	
}
