package BasicPrograms;

public class StringReversal {
	static String recursivefunction(String str) {
		if(null==str || str.length()<=1) {
			return str;
		}
		else {
			return recursivefunction(str.substring(1))+str.charAt(0);
		}
	}

	public static void main(String[] args) {
//		1.using for loop.
		String  str = "MyJava";
		char[] ch = str.toCharArray();
		for(int i = ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
		
//		2.using recursion
		System.out.println();
		System.out.println(recursivefunction(str));
	
		
//		3.using string buffer
		StringBuffer sbf = new StringBuffer(str);
		System.out.println(sbf.reverse());

	}

}
