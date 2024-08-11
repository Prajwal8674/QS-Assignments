
import java.util.Scanner;
class ExtractNo{
	
	public static void main(String []args){
	
    Scanner sc = new Scanner(System.in);
	
	
	int num =1234;
	
		while(num>0){
			
			int last=num%10;
			System.out.println(last);
			num/=10;
		}
		
	}
}
