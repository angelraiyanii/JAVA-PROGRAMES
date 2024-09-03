import java.util.*;
class Scaaner_Cube{
	void Display(int x1)
	{
		
		System.out.println(x1*x1*x1);
	}
}
class Scaaner_Cube1 {
	public static void main(String[] a)
	{
	Scaaner_Cube s1 = new Scaaner_Cube();
	Scanner cs = new Scanner(System.in);
	System.out.println("Enter is Number:");
	int x;
	x=cs.nextInt();
	s1.Display(x);
	}

}
