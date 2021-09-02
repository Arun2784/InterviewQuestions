package JavaCodingLogical;

import org.apache.poi.hslf.record.TextCharsAtom;

public class ReversetheString {

	public static void main(String[] args) {

		String s1 = "Selenium";

		int length = s1.length();

		String rev = "";

		for (int i = length - 1; i >= 0; i--) {

			rev = rev + s1.charAt(i);

		}

		System.out.println(rev);

	}

}
