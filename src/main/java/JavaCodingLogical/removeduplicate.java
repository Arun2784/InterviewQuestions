package JavaCodingLogical;

public class removeduplicate {

	public static void main(String[] args) {

		String s1 = "arunkumarpandeyseleniumautomation";

		int length = s1.length();

		String removedupl = "";

		for (int i = 0; i < length; i++) {
			char ch = s1.charAt(i);

			if (removedupl.indexOf(ch) == -1) {

				removedupl = removedupl + ch;

			}

		}
		System.out.println(removedupl);

	}

}
