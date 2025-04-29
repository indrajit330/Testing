package Assignment;

public class P13 {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};

		double sum = 0;
		for (int i = 0; i < numbers.length; i++) {
		   sum = sum+numbers[i];
		}

		double average = sum / numbers.length;
		System.out.println(average); 
	}

}
