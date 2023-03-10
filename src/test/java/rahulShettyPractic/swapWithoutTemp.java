package rahulShettyPractic;

public class swapWithoutTemp {

	//Swap the variable with and without using temp variable
	
	public static void main(String[] args) {
		//With temp variable
	int a = 5; 
	int b = 3;
	int c = 0;
	
	c = b;
	b = a;
	a = c;
	System.out.println("value of a is "+a);
	System.out.println("value of b is "+b);

	//Without temp variable
	int d = 3;
	int e = 8;
	d = d+e;
	e = d-e;
	d = d-e;
	 System.out.println("value of d is "+d);
		System.out.println("value of e is "+e);
		
	}

}
