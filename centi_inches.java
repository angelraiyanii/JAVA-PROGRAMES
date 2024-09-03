import java.io.*;
class centi_inches1{
	void Display(){
	double inches;
	double centi=40.5;

	inches= 2.54/centi;
	System.out.println(centi +" : Centimeters To Inches : "+inches);
	
	}
}
class centi_inches{
	public static void main(String[] a)
	{
	centi_inches1 i1 = new centi_inches1();
	i1.Display();
	}

}