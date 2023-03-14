package rahulShettyPractic;

public class minMaxArray {

	//Print min and max number in multi dimensional array 3*3 matrix
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[][] = {{3,6,5},{3,4,19},{9,8,2}};

int min=a[0][0];
int max = a[0][0];

for(int i=0; i<a.length;i++) {
	for (int j=0; j<a.length; j++) {
		if(a[i][j]<min) {
			min = a[i][j];
		}
		if(a[i][j]>max) {
			max = a[i][j];
		}
		
	}
	
}
System.out.println("Minimum value is " +min);
System.out.println("Maximum value is "+max);

	}

}
