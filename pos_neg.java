import java.io.*;
class pos_neg1
{
	void Display(){
	if(-12>0)
	{
		System.out.println("Number is Positive:");
	}
	else
	{
		System.out.println("Number is Negative:");
	}
	}

}
class pos_neg
{
	public static void main(String[] a)
	{
		pos_neg1 e1= new pos_neg1();
		e1.Display();
	}
}