import java.io.*;

class command_line_args
{
	public static void main(String[] A)
	{
		String nm,nm1;
		int n1;
		nm =A[0];
		nm1=A[1];
		n1 =Integer.parseInt(A[2]);
		System.out.println("Name:"+nm);
		System.out.println("Surname:"+nm1);
		System.out.println("Roll No:"+n1);
	}
}