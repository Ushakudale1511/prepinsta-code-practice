public class Factorial_of_a_number {
public static void main(String[] args) {
int num = 6;
int factorial = 1;
for (int i = 1; i <= num; i++) {
factorial *= i;
if (i == num) {
System.out.println(factorial);
}
}
}
