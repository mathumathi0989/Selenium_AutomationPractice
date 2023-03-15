package rahulShettyPractic;

public class reverseStringPalindrome {
//Reverse the string without using predefined reverse methods or Palindrome Verification
	
	public static void main(String[] args) {
		String s = "madam";
		String t = "";
		for(int i=s.length()-1; i>=0;i--) {
			char s1 = s.charAt(i);
			t = t + s1;
			
		}
		System.out.println(t);
		if(t.equalsIgnoreCase(s)) {
			System.out.println("Given string is palindrome");
		}
		else {
			System.out.println("Given string is not palindrome");
		}
	}

}
