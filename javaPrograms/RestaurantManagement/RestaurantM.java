import java.util.Scanner;

class RestaurantM{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int totalAmt;
		
		System.out.println();
		System.out.println("+--------RESTAURANT---------+");
		
		System.out.println();
		System.out.println("+---------------------------+");
		System.out.println("|-----CHOOSE PREFERENCE-----|");
		System.out.println("|                           |");
		System.out.println("| 1 | VEG                   |");
		System.out.println("| 2 | NON-VEG               |");
		System.out.println("|                           |");
		System.out.println("+---------------------------+");
		System.out.print("> ");
		int pref = sc.nextInt();
		System.out.println();

		 switch(pref){
			
			case 1: 
		System.out.println();
		System.out.println("+--------------------------+");
		System.out.println("|   | CHOOSE DISH    |PRICE|");
		System.out.println("|                          |");
		System.out.println("| 1 | NOODLES        |  50 |");
		System.out.println("| 2 | FRIED RICE     |  60 |");
		System.out.println("| 3 | VEG MANCHURIAN |  80 |");
		System.out.println("|                          |");
		System.out.println("+--------------------------+");
		System.out.print("> ");
		int dish = sc.nextInt();
		
        switch(dish){
			
			case 1 :
			System.out.println();
		System.out.println("+--------------------------+");
		System.out.println("|   | DISH           |PRICE|");
		System.out.println("|                          |");
		System.out.println("| 1 | NOODLES        |  50 |");
		System.out.println("|                          |");
		System.out.println("|--------------------------|");
	    System.out.println("| HOW much PLATE ?         |");
		System.out.println("+--------------------------+");
		System.out.print("> ");
		int plate = sc.nextInt();


		
			break;
			
			case 2 :
			
			break;
			
			case 3 :
			
			break;
		}
		
			 break;

			 case 2:
		System.out.println();
		System.out.println("+-----------------------------+");
		System.out.println("|   | CHOOSE DISH       |PRICE|");
		System.out.println("|                             |");
		System.out.println("| 1 | CHICKEN LOLLIPOP  | 100 |");
		System.out.println("| 2 | CHILLI CHICKEN    | 150 |");
		System.out.println("| 3 | CHICKEN ROLL      |  80 |");
		System.out.println("|                             |");
		System.out.println("+-----------------------------+");
	    System.out.println();

		
			 
			 break;
			 
		 }
		
		

		








		
		
		
			
		
	}
}
