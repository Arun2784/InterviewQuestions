package JavaCodingLogical;

public class OccurenceOfChar {

	public static void main(String[] args) {

		String s1 = "arunkumarpandeyseleniumautomation";

		int length = s1.length();

		int count = 0;

		char ch = 'p';

		for (int i = 0; i < length; i++) {
			
			char ch1 = s1.charAt(i);
			if(ch==ch1) {
				
				count ++;
				
			}

		}

		
		System.out.println("character of = "+ch+ " and occuring times= " +count);
	}

}
