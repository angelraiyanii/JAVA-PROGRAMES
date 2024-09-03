import java.util.*;
class Num_prime_scanner{

	static public void main(String[] aa)
	{
		Scanner cs = new Scanner(System.in);
		System.out.println("Enter a Value:");
		int a = cs.nextInt();
		int count=0;
		for(int i=0;i<=a;i++)
		{
			if(i%2==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("Number is Prime");
		}
		else
		{
			System.out.println("Number is Not Prime");
		}
	}
}