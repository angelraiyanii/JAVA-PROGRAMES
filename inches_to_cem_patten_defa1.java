class inches_to_cem_patten_defa
{
	inches_to_cem_patten_defa()
	{
		this(5);
		System.out.println("This is Default Constrator...");
	}
	inches_to_cem_patten_defa(int p)
	{
		this(67,76);
		for(int i=0;i<=p;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.println(i);
			}
			System.out.println();
		}
	}
	inches_to_cem_patten_defa(int x,int y)
	{
		
		System.out.println("convertinches_centi:"+(2.45/x));
		System.out.println("convert centi_inches:"+(2.45*y));
	}
}
class inches_to_cem_patten_defa1{
public static void main(String[] g){
	inches_to_cem_patten_defa as = new inches_to_cem_patten_defa();
}
}