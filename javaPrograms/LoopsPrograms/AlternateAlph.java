import java.util.Scanner;
class AlternateAlph{
	
	public static void main(String[] args){
				
	    char start = 'a';
		char end = 'z';
		
		while(start<end){
			
			System.out.println(start++);
			
			start++;			
		}
		
	}
}