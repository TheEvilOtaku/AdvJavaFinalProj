package vendingMachine;

public class Sprite extends Drink {
private String drinkName;
	
	public Sprite(){
		super();
		drinkName = "Sprite";
	}
	
	public Sprite(String dN){
		drinkName = dN;
	}
	
	public String toString(){
		return (super.toString() +"drink name: " + drinkName + "\n");
	}

	public String getDrinkName() {
		return drinkName;
	}

	public void setDrinkName(String drinkName) {
		this.drinkName = drinkName;
	}
	
}
