import java.util.Scanner;
class AlternateAlph{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
	    char start = 'a';
		char end = 'z';
		
		while(start<=end){
			
			System.out.println(start++);
			
			start++;			
		}
		
	}
}