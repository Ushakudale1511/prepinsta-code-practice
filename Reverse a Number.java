class A {
    public static void main(String[] args) {
        int num = 1234, reverse = 0, remb;
        while (num != 0) {
            remb = num % 10;           // Get the last digit
            reverse = reverse * 10 + remb; // Add the last digit to the reversed number
            num /= 10;                 // Remove the last digit from num
        }
        System.out.println("Reversed number: " + reverse);
    }
}
