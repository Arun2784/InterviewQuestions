package ArrayConcept;

public class SmallestNumberinArray {

	public static void main(String[] args) {

		int[] numbers = { 1, 10, -8, -100, 90, 2000, -5000, 0 };

		int smallest = numbers[0];
		System.out.println(smallest);


		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] < smallest) {  //1<1= flase 1// 10<1

				smallest = numbers[i];

			}

		}

		System.out.println(smallest);

	}

}
