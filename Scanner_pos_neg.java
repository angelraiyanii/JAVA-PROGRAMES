import java.util.*;
class pos_neg1
{
	void Display(int x1){
	if(x1>0)
	{
		System.out.println("Number is Positive:");
	}
	else
	{
		System.out.println("Number is Negative:");
	}
	}

}
class Scanner_pos_neg
{
	public static void main(String[] a)
	{
		pos_neg1 e1= new pos_neg1();
		Scanner cs = new Scanner(System.in);
		System.out.println("Enter a Numbre:");
		int x;
		x= cs.nextInt();
		e1.Display(x);
	}
}
