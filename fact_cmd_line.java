import java.io.*;
import java.util.*;

class fact_cmd_line
{
	public static void main(String a[])
	{
	System.out.println("Enter A number:");
	int num=Integer.parseInt(a[0]);
	int fact =1;
		for(int i=1; i<=num;i++)
		{
			fact*=i;
			
		}
		System.out.println("Factorial:"+fact);
	}
}