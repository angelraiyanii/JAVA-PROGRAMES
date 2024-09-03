import java.io.*;
import java.util.*;
import static java.lang.Math.*;

public class ReverseString {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Enter a st
		ring: ");
        String input = scanner.nextLine();
        
     
        String reversedString = new StringBuilder(input).reverse().toString();
        
    
        System.out.println("Reversed string: " + reversedString);
        
    }
}
