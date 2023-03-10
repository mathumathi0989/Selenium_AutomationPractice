package rahulShettyPractic;

import java.util.ArrayList;

public class cmpr2arrays {

	public static void main(String[] args) {
		int a[] = {2,4,7,19,23};
		int b[] = {3,4,5,22,23};
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		for(int i =0; i<a.length; i++) {
			if(a[i] == b[i] ) {
				ar.add(a[i]);
				
			}
			
		}
		System.out.println(ar);
		
		
		
		
		
		
		
		
		
	}

}
