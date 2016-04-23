package vendingMachine_array;
import java.util.Scanner;

public class Array {
/*Array will have: {1 Sprite,  2 Pepsi,   3 diet pepsi}
* 				   {4 monster, 5 mountain dew, 6 water} */
	
	String[][] drinkArray = {{"Sprite", "Pepsi", "diet pepsi"},
							 {"monster", "mountain dew", "water"}};
	
	for (int i = 0; i < drinkArray.length; i++) {
	      System.out.print(drinkArray[i][0] + ": ");
	      	for (int j = 1; j < drinkArray[i].length; j++) {
	      		System.out.print(drinkArray[i][j] + " ");
	      }
	      System.out.println();
	};
}	      
}


