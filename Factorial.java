package BasicPrograms;

public class Factorial {
	static int getFactorial(int number) {
		if(number == 0) {
			return 1;
		}
		return number*getFactorial(number-1);
	}
	int factorial(int n)
	  {
	 
	    // single line to find factorial
	    return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);
	 
	  }

	public static void main(String[] args) {
//		1.Using recursion
		System.out.println(getFactorial(5));
		
//		2.Using iterator
		int number = 5;
		int res = 1;
		for (int i = 2;i<=number;i++) {
			res = res*i;
		}
		System.out.println(res);

	}

}
