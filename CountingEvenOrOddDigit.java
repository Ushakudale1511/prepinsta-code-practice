package javaprogramming;

public class countingevenorodddigits {

	public static void main(String[] args) {
		int number =123456789;
		int even_count=0;
		int odd_count=0;
		
		while(number>0) {
			int remb =number%10;
			if(remb%2==0) {
				even_count++;
			}
			else {
				odd_count++;
			}
			number =number/10;
		}
		System.out.println("the counting even number is: "+even_count );
		System.out.println("the counting odd number is: " +odd_count);
	}

}
