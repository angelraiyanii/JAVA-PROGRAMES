import java.io.*;
class fibonacii_series1{
	void Display(){
		int a=0,b=1,c;
		for(int i=0;i<=11;i++)
		{
		System.out.println(a);
		c=a+b;
		a=b;
		b=c;
		}
		
	}
}
class fibonacii_series
{
	static public void main(String[] a)
{
		fibonacii_series1 f1 = new fibonacii_series1();
		f1.Display();
	}
}