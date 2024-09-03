import java.util.*;
class chaing_cunstrator1
	{
	chaing_cunstrator1()
	{
		this(12);
		System.out.println("This Default Costrator..");	
	}
	chaing_cunstrator1(int i)
	{
		this(3,5);
		System.out.println("integer number:"+i);
	}
	chaing_cunstrator1(int x, int y)
	{
		System.out.println("((3+5)*(3+5)) Ans :"+((x+y)*(x+y)));
	}
}

class chaing_cunstrator{
	public static void main(String[] a){
	chaing_cunstrator1 c = new chaing_cunstrator1();
	
}
}