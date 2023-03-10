package rahulShettyPractic;

public class maxDiff {

	public static void main(String[] args) {
		
		int a[] = {2,4,7,19,23};
		int diff = 0;
		for(int i=0; i <a.length-1; i++) {
			
			if(a[i+1]-a[i]>diff) {
				diff = a[i+1]-a[i];
			}
		
		}
		System.out.println(diff);
		

	}

}
