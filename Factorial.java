import java.util.*;
class Factorial1{
	int fact=1;
	void display(int ans)
	{
	for(int i=1;i<=ans;i++)
	{
	for(int j=1;j<=i;j++)
	{
		System.out.print(j+"*");
	}
		System.out.println(" ");
	}
	for(int i=1;i<=ans;i++)
	{
		fact*=i;
	}
	System.out.print("Factorial:"+fact);
	}
}
class Factorial{
	static public void main(String[] a)
	{
		Factorial1 f = new Factorial1();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Value");
		int ans1;
		ans1= sc.nextInt();
		//System.out.println(ans1);
		f.display(ans1);
		
		
		
	}
}