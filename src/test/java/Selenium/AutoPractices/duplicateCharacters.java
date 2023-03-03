package Selenium.AutoPractices;

public class duplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "mathuma";
		
		for(int i = 0; i<s.length()-1; i++) {
			System.out.println("i is "+i);
			for(int j = 0; j<s.length(); j++) {
				System.out.println("j is "+j);
				//char a = s.charAt(i);
			//	char b = s.charAt(j);
			if (s.charAt(i)==s.charAt(j)) {
				System.out.println(s.charAt(i));
			}
			}
		}
		
		
		
	}

}
