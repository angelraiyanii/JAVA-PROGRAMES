import java.io.*;
import java.util.*;
import static java.lang.Math.*;

public class math_fun_LoverCase {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        
        String uppercaseString = input.toLowerCase();

        
        System.out.println("Uppercase: " + uppercaseString);
    }
}
