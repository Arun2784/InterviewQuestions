package ArrayConcept;

public class FindtheMaximuminArray {

	public static void main(String[] args) {

		int[] numbers = new int[] { 100, 40, 70, 120, 90, 0, 1, 4, 800 };

		int max = numbers[0];

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] > max) {  //120>100 true; 120

				max = numbers[i];  //

			}

		}

		System.out.println(max);

	}

}
