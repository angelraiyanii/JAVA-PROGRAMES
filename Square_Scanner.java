import java.util.*;
class Square_Scanner1{
	void Display(int x1)
	{
		
		System.out.println(x1*x1);
	}
}
class Square_Scanner {
	public static void main(String[] a)
	{
	Square_Scanner1 s1 = new Square_Scanner1();
	Scanner cs = new Scanner(System.in);
	System.out.println("Enter is Number:");
	int x;
	x=cs.nextInt();
	s1.Display(x);
	}

}
