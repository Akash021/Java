package BasicPrograms;

public class PalindromExample {
	
	static boolean isPalinrome(String s1) {
		String s2 = s1.toLowerCase();
		char[] ch = s2.toCharArray();
		int i1 = 0;
		int i2 = ch.length-1;
		while(i1<=i2) {
			if(ch[i1]!=ch[i2]) {
				return false;
			}
			++i1;
			--i2;
		}
		return true;

	}
	


	public static void main(String[] args) {
		String str = "Madam";
		System.out.println(isPalinrome(str));
		

}
}
