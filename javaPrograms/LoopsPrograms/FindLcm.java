
// find the least lcm

import java.util.Scanner;
class FindLcm{
 
public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("ENTER NUMBER 1 : ");
	int n1= sc.nextInt();
	
	System.out.println("ENTER NUMBER 2 : ");
	int n2= sc.nextInt();
	
	int lcm=n1>n2?n1:n2;
	
	while(true){
		if(lcm%n1==0&& lcm%n2==0){
		System.out.println("THE LEAST LCM OF THE NUMBER IS : "+lcm);
		break;
		}
		lcm++;
	}

	
	
}
}