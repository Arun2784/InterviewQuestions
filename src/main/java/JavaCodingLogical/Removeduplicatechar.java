package JavaCodingLogical;

import org.checkerframework.checker.units.qual.s;

public class Removeduplicatechar {

	public static void main(String[] args) {

		String s1 = "seleniumnseleniumnseleniumnseleniumnabcdf";

		int length = s1.length();

		String removeDup = "";//s= blankc
		
		for (int i = 0; i < length; i++) {
			char ch = s1.charAt(i);
			if (removeDup.indexOf(ch) == -1) {

				removeDup = removeDup + ch;

			}

		}
		
		System.out.println(removeDup);

	}

}
