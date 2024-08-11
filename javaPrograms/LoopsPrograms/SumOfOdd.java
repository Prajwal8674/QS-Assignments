class SumOfOdd{
	
	public static void main(String []args){
		
		
		int num = 1234;
				
		while(num>0){
			int last=num%10;
			System.out.println(last);
			num/=10;

		}
		
	}
}
