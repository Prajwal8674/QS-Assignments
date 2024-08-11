import java.util.Scanner;
class AlternateNo{
	
	public static void main(String []args){
	
    Scanner sc = new Scanner(System.in);
	
				System.out.println("ENTER THE NUMBER : ");
				int num = sc.nextInt();
				int finall;
	
		while(num>0){
			int last=num%10;
			num/=100;
			System.out.print(last);

		}
		
	}
}
