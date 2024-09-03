import java.io.*;
class inches_centi1{
	void Display(){
	int inches =40;
	double centi;

	centi = 2.54*inches;
	System.out.println(inches +" :Inches To Centimeters: "+centi);
	
	}
}
class inches_centi{
	public static void main(String[] a)
	{
	inches_centi1 i1 = new inches_centi1();
	i1.Display();
	}

}