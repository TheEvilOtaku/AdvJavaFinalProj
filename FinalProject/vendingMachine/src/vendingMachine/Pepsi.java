package vendingMachine;

public class Pepsi extends Drink {
	private String drinkName;
	
	public Pepsi(){
		super();
		drinkName = "Pepsi";
	}
	
	public Pepsi(String dN){
		drinkName = dN;
	}
	
	public String toString(){
		return (super.toString() +"drink name: " + drinkName +"\n");
	}

	public String getDrinkName() {
		return drinkName;
	}

	public void setDrinkName(String drinkName) {
		this.drinkName = drinkName;
	}
}