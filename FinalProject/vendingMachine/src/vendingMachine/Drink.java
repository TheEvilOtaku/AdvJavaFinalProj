package vendingMachine;

public class Drink {
	private boolean Bottle;
	private boolean Can;
	private String drinkType;
	
	
	public Drink(){
		Bottle = true;
		Can = false;
		drinkType = "soda";
	}
	
	public Drink(String dT, boolean bot, boolean c){
		drinkType = dT;
		Bottle = bot;
		Can = c;
	}
	
	public String toString(){
		String temp;
		temp = "Drink type: "+drinkType+",  ";
		temp += "Bottle?: "+Bottle+", ";
		temp += "or Can?: "+Can+", ";
		
		return temp;
	}

	public boolean isBottle() {
		return Bottle;
	}

	public void setBottle(boolean bottle) {
		Bottle = bottle;
	}

	public boolean isCan() {
		return Can;
	}

	public void setCan(boolean can) {
		Can = can;
	}

	public String getDrinkType() {
		return drinkType;
	}

	public void setDrinkType(String drinkType) {
		this.drinkType = drinkType;
	}
	
	
}
