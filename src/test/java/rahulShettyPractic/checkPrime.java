package rahulShettyPractic;

import java.util.Scanner;

public class checkPrime {

	//To check if given number is prime 
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = sc.nextInt();
//	System.out.println(n);
		
	boolean flag = false;
	for(int i=2; i<=n/2; i++) {
		if(n%i==0) {
			flag = true;
			break;
		}
	}
		if(flag) {
			System.out.println(n+" is not prime");
		}
		else {
			System.out.println(n+ " is prime number");
		
		}
		}
	
		
		
		
		
	
}
