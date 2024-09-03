import java.io.*;
import java.util.*;
import static java.lang.Math.*;

class math_fun{
	public static void main(String[] v)
	{
		Scanner s= new Scanner(System.in);
		int a,b;
		System.out.println("Enter a Number1:");
		a= s.nextInt();

		System.out.println("Enter a Number2:");
		b= s.nextInt();	

		System.out.println("Answers : "+pow(a,b));	

	}
}