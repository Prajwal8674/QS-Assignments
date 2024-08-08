import java.util.Scanner;

class EvenLeapYear{
	public static void main(String[] args){
		
        Scanner sc = new Scanner(System.in)	;	
	
	    System.out.print("Enter Start Of the Year :");
	    int start =sc.nextInt();
	
		System.out.print("Enter End Of the Year :");
		int end =sc.nextInt();
		int count = 0;
		while(start<=end){
			
			if((start%4==0 && start%100!=0) || (start%400==0)){
				if(start %2==0){
					System.out.println(start);
					count +=1;
				}
			}
			start++;
			
		}
		System.out.println("Total Count = "+count);
		

	
 
 
	}		
	
	
}