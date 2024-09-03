import java.util.*;
class Armstrong_scanner{
	public static void main(String[] as)
	{
		Scanner cs=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = cs.nextInt();
		
		int no,temp=0,r=0;
		no=temp;
		while(num>0){
		r= num%10;
		temp =(num*num*num)+r;
		num = num/10;
}
		if(temp==no)
		{
			System.out.println("Number is Armstrong.");
		}
		else
		{
			System.out.println("Number is Not Armstrong.");
		}
		

	}	
}