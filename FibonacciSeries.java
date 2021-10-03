package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range = 8;
		int firstnum = 0;
		int secnum = 1;
		int sum = 0;
		System.out.println(firstnum);
		System.out.println(secnum);
		for (int i = 1; i <= range-2; i++) {
			sum = firstnum + secnum;
			firstnum = secnum;
			secnum = sum;
			System.out.println(sum);
		}

	}

}
