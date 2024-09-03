import java.io.*;
class min_max1{
	void Display()
	{
		int a=12;
		int b=34;
		int c=1;
		if(a>b)
		{
			if(a>c)
			{
			System.out.println(a+": is maximum:");
			}
			else
			{
			System.out.println(c+" :is Maximum:");
			}
		}
		else
		{
			System.out.println(b+" :is Maximum:");	
		}
	}

}

class min_max{
		static public void main(String[] a)
		{
		min_max1 m1 = new min_max1();
		m1.Display();

}
}