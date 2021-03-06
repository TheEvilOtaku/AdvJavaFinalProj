import java.io.*;
import java.util.*;
public class Order_processing implements Array_Interface {
	public static void main(String[] args) throws Exception {
		long drinkID = 0;
		double price = 0.00;
		boolean itemFound = false;	
		String drinkName = "Unknown";
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		try{
			System.out.println("enter vending machine slot number: ");
				drinkID = Long.parseLong(br.readLine());	
		}
		catch(InputMismatchException ime){
			System.out.println("ERROR program terminated");
		}

		for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (drinkID == selectionNumber[i][j]) {
                    drinkName = drinkNames[i][j];
                    price = selectionPrice[i][j];
                    itemFound = true;
                }
            }
		}
        
		if (itemFound == true) {
        	System.out.println("Number selected: " + drinkID);
        	System.out.println("Drink selected: " + drinkName);
        	System.out.printf("Price: $%.2f", price);
        }
        else
        	System.out.println("Item not found");
	}
}
