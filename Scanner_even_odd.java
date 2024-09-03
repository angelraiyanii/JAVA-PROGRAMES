import java.util.*;
class even_odd1
{
	void Display(int x1){
	if(x1%2==0)
	{
		System.out.println("Number is even:");
	}
	else
	{
		System.out.println("Number is odd:");
	}
	}

}
class Scanner_even_odd
{
	public static void main(String[] a)
	{
		even_odd1 e1= new even_odd1();
		Scanner cs = new Scanner(System.in);
		System.out.println("Enter a number:");
		int x;
		x =cs.nextInt();
		e1.Display(x);
	}
}
