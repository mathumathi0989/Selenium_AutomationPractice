package rahulShettyPractic;

public class fibonacci {

	//Print fibonacci series by swapping variables
	//1	2 3 5 8 13

	
	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
//	System.out.print(n1);
	//System.out.print(" ");
		for(int i=1; i <10; i++) {
			
			int n3 = n1 + n2;
			System.out.print(n3);
			System.out.print(" ");
			n1 = n2;
			n2 = n3;
			
		}
		
		
		
		
	}
}
