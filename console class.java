import java.util.*;
class Usha {
    public static void main(String[] args) {
        String str;
        char[] ch;
        
        // Get the console object
        Console obj = System.console();
        if (obj == null) {
            System.out.println("No console available");
            return;
        }
        
        System.out.println("Enter a username:");
        str = obj.readLine();
        
        System.out.println("Enter a password:");
        ch = obj.readPassword();
        
        System.out.println("Username: " + str);
        System.out.println("Password: " + String.valueOf(ch));
        
        // To clear the password array after use (security best practice)
        Arrays.fill(ch, ' ');
    }
}
