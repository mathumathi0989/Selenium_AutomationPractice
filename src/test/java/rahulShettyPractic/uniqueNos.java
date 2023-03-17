package rahulShettyPractic;

import java.util.ArrayList;

public class uniqueNos {
//Eliminate duplicate and print unique nos. along with how many times it repeated
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {4,4,5,4,2,6,3,6,2,5,8};
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		for(int i=0; i <a.length; i++) {
			int k=0;
			if(!ar.contains(a[i])) {
				ar.add(a[i]);
				k++;
				for(int j=i+1; j<a.length; j++) {
					if(a[i]==a[j]) {
						k++;
					}
				}
			}
	
		if(k==1) {
		System.out.println(a[i] + "is unique number");
		}
		}

	}

}
