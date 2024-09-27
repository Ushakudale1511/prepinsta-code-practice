class HelloWorld {
    public static void main(String[] args) {
        int arr[] = {4, 6, 8, 9, 23, 45, 67};
        int n = arr.length;
        
        System.out.print("Reversed array is: ");
        for (int i = n - 1; i >= 0; i--) {
            // Print the array elements with a space
            System.out.print(arr[i] + " ");
        }
    }
}
