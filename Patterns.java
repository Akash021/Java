package BasicPrograms;

public class Patterns {

	public static void main(String[] args) {
		int n = 6;
		int i,j,k;
		for(i=1;i<n;i++) {
			// inner loop to handle number spaces
			for(j=1;j<n-i;j++) {
				System.out.print(" ");
			}
		   // inner loop to handle number of columns
			for(k=1;k<=i;k++) {
				System.out.print("* ");
			}
			// ending line after each row
			System.out.println();
		}
		System.out.println("*********************");
		
//		print numbers
		for(i=1;i<n;i++) {
			// inner loop to handle number spaces
			for(j=1;j<n-i;j++) {
				System.out.print(" ");
			}
		   // inner loop to handle number of columns
			for(k=1;k<=i;k++) {
				System.out.print(k+" ");
			}
			// ending line after each row
			System.out.println();
		}
		System.out.println("*********************");
		
		//floyd's algorithm
		
		int number = 1;
		for(i=1;i<=n;i++) {
			for(k=1;k<=i;k++) {
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
		}

	}

}
