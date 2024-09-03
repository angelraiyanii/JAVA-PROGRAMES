import java.io.*;
class simple_inters1{
	void Display()
	{
	int p=200;
	float r=56.7f;
	int n=8700;
	System.out.println("Simple Inters:"+(p*r*n)/100);
	}
}
class simple_inters{
	static public void main(String[] a)
	{
		simple_inters1 s1=new simple_inters1();
		s1.Display();
	}
	}