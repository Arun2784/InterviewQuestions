package ArrayConcept;

import java.util.Arrays;

public class HowtoSortArrat {

	public static void main(String[] args) {

		int[] numbers = new int[] { 1, 4, 3, 2, 5, 6 };

		Arrays.sort(numbers);

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

	}

}
