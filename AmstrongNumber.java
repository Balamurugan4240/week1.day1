package week1.day2;

public class AmstrongNumber {

	public static void main(String[] args) {
	int input =153;
		int sum = 0;
		int orginal=input;
		while(input > 0) {
			int rem = input % 10;
			sum = sum + (rem*rem*rem);
			input = input / 10;
		
	}
		if(sum == orginal) {
			System.out.println("It is an Armstrong Number");
		}
		else {
			System.out.println("It is not an Armstrong Number");
		}
	}

}
