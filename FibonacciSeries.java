package javaprogramming;

public class fibanociseries {

	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		System.out.println(+ n1 + " " +n2); //printing  first  two value of n1 and n2
		for(int i = 2; i< 30 ; i++) //loop iterate until i<30
		{
			int sum = n1+n2;// in the FibonacciSeries  n1+ n2 logic exits
			n1 = n2;    
			n2= sum;   
			System.out.println(sum);
		}

	}

}

