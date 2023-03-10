package rahulShettyPractic;

import java.util.ArrayList;
import java.util.Collections;

public class arrAscDesc {

	//Sort the array in ascending and descending order
	
	public static void main(String[] args) {
		
		int[] a = {2,3,6,2,45};
		ArrayList a1 = new ArrayList();
		
		for(int i=0; i<a.length; i++) {
			a1.add(a[i]);
		}
	
		System.out.println("Array as  "+a1);
		
	Collections.sort(a1);
		
	System.out.println("Arrays asc as  "+a1);
	
	Collections.reverse(a1);
	System.out.println("Arrays desc as  "+a1);
	
	}
}
