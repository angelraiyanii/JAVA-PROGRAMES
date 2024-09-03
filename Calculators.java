class Calculatro1{
	void Display()
	{
		int a=12;
		int b=23;
		System.out.println("Addtion:"+(a+b));
		System.out.println("Substation:"+(a-b));
		System.out.println("Multiplication:"+(a*b));
		System.out.println("Divisions:"+(a/b));
		System.out.println("Modulo:"+(a%b));
	}
}
class Calculators{
	public static void main(String[] a)
	{
	Calculatro1 c1 = new Calculatro1();
	c1.Display();
	}
}