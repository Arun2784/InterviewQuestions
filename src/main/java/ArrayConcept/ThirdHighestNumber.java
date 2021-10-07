package ArrayConcept;

public class ThirdHighestNumber {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 4, 8, 900, 11, 89, 101,800,1500 };

		int largest = 0;
		int secondLargest = 0;
		int thirdLargest = 0;

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] > largest) { //1>0/yes secondlargest =0 and largest =1 then now 2 >
				                         //2>1//yes second largest=1 and largest 2 then now 4>
				                         //2//yes secondLargest=2 and largest 4 then now 8>
				                         //4//yes second laresg 4 and largest 8 then now 900>
				                         //8 yes second largest 8 and largest 900 then now 11>   
				                         //900//	No
				                         //11>8//then second largest=11/
				secondLargest = largest;
				largest = numbers[i];
				
			} else if (numbers[i] > secondLargest) {
				thirdLargest=secondLargest;
				secondLargest = numbers[i];
			}

		}

		System.out.println(thirdLargest);


	}

}
