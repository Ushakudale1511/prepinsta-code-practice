package javaprogramming;

public class StringPalidrone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String str="ABCDE";
   String  revv =" ";
   
   int n=str.length();
   for (int i =n-1; i>=0; i--) {
	   revv=revv+str.charAt(i);
	   
	   
   }
   if(str.equals(revv)) {
	   System.out.println("String is palindrome");
   }
   else {
	   System.out.println(" string is not palindrome");
   }
   
	}

}
