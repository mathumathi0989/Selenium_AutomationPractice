package Selenium.AutoPractices;

public class reverseString {

	public static void main(String[] args) {
		
		String s = "mathu";
		for (int i=s.length()-1; i>=0; i--) {
		    System.out.print( s.charAt(i));
		}
		System.out.println();
		
		StringBuilder s1 = new StringBuilder(s);
		System.out.println("Using StringBuilder " +s1.reverse());
		
		StringBuffer s2 = new StringBuffer(s);
		System.out.println("Using StringBuffer " +s2.reverse());
		
	}
	
	
	
	
}
