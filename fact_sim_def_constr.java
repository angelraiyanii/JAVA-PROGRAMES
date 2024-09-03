class fact_sim_def_constr
{
	fact_sim_def_constr()
	{
		this(3);
		System.out.println("This is Default Constrator..");
	}
	fact_sim_def_constr(int f)
	{
		this(200,45.5f,65000);
		int f=1;
		for(int i=1;i<=3;i++)
		{	
		f*=i;
		}
		System.out.println("Factorial:"+f);
	}
	fact_sim_def_constr(int p, float r, int n)
	{
		System.out.println("Simple Instrest:"+(p*r*n)/100);
	}
		
}
class fact_sim_def_constr1
{
	public static void main(String[] t)
	{
	fact_sim_def_constr fa= new fact_sim_def_constr();
	}
}