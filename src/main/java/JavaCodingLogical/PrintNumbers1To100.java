package JavaCodingLogical;

public class PrintNumbers1To100 {

	public static void main(String[] args) {

		//printnum(1);
		printnum(1000, 1050);
	}

	public static void printnum(int num) {

		if (num <= 100) {

			System.out.println(num);
			num++;
			printnum(num);
		}

	}

	public static void printnum(int stanum, int endnum) {

		if (stanum <= endnum) {

			System.out.println(stanum);
			stanum++;
			printnum(stanum, endnum);
		}

	}

}
