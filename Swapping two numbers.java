class Reverse {
    public static void main(String[] args) {
        int a =10;
        int b=20;
        System.out.println("Number before the swapping:" +a+ " " +b);
        
        // // Logic 1: using third vairable
        
        
        // int c = a;
        //  a = b;
        //  b= a;
        
        // Logic 2: using - & + ( without using third vairable)
        
        //  a = a+b;
        //  b = a-b;
        //  a = a-b;
        
        // Logic 3 : using * / operator
        
        // a=a*b;
        // b=a/b;
        // a=a/b;
        
        //logic 4 : using bitwise operator :
        
        a= a^b;
        b= a^b;
        a=a^b;
           System.out.println("Number After the swapping:" +a+ " " +b);
    }
} 
