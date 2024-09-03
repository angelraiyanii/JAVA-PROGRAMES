import java.io.*;
class even_odd1
{
	void Display(){
	if(12%2==0)
	{
		System.out.println("Number is even:");
	}
	else
	{
		System.out.println("Number is odd:");
	}
	}

}
class even_odd
{
	public static void main(String[] a)
	{
		even_odd1 e1= new even_odd1();
		e1.Display();
	}
}