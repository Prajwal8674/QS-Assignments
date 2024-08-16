class SumOfOdd{
	
	public static void main(String []args){
		int num = 121211;
		int num2 = num;

		int sumOdd=0;
		int sumEven=0;		
		
		while(num2>0){
			int last=num2%10;				
			if(last%2==0){
			System.out.println(last);
			 //sumEven=num+last;
			 sumEven+=last;
			} 
			num2/=10;
		}			
		System.out.println("TOTAL : "+sumEven);
		while(num>0){
			int last2=num%10;
			//System.out.println(last);
			if(last2%2!=0){
			System.out.println(last2);
			sumOdd+=last2;
			} 
			num/=10;
		}
		System.out.println("TOTAL : "+sumOdd);

		if(sumEven==sumOdd){
			System.out.println("TOTAL IS SAME");

		}
		else{
			System.out.println("TOTAL IS NOT SAME");
	
		}
	}
}
