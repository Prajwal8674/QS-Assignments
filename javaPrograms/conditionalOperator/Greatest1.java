class Greatest1
{
	public static void main(String[] args) 
	{
		
	int n1=10;
	int n2= 20;
	int n3= 30;
	int n4=40;
	
	int greater1 = n1 > n2 ? n1 : n2;
	int greater2 = n3 > n4 ? n3 : n4;
	int greatest = greater1 > greater2 ? greater1 : greater2 ;
	
	//greatest2= (n1>n2?n1:n2)?
	
		System.out.println(greater1);
		System.out.println(greater2);
		System.out.println(greatest);
	

	}
}
