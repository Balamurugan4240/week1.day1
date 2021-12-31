package week1.day1.ass1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range = 8;
		int firNum = 0;
		int secNum = 1;
		System.out.println(firNum);
		System.out.println(secNum);
		
		int sum;
		for (int i = 0; i <=range; i++) {
			sum =firNum + secNum;
			System.out.println(sum);
			firNum =secNum;
			secNum=sum;
		}

	}

}
