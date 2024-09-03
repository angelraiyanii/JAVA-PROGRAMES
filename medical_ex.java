//WAP in java using the consept of method overloding and using scanner with class
// name is mediacal datamember are medicalName,medicalISN_number
//m_city,m_onear,m_mobileno,m_emailid,date ,stock,contity
//price.

import java.io.*;
import java.util.*;


class medical
{
     String medicalName,medicalIsnNumber,mCity,mOnear,mMobileno,mEmailId,date;
     int stock,quantity;
     double price;

	void getdata()
	{
	  Scanner sc = new Scanner(System.in);

	System.out.println("Enter A Medical Name");
         medicalName = sc.nextLine();

	System.out.println("Enter A Medical medicalIsnNumber;");
         medicalIsnNumber = sc.nextLine();
	
	System.out.println("Enter A Medical City");
         mCity = sc.nextLine();

	System.out.println("Enter A Medical onear");
         mOnear = sc.nextLine();

	System.out.println("Enter A Medical Mobile");
         mMobileno = sc.nextLine();

	System.out.println("Enter A Medical Email Id");
         mEmailId = sc.nextLine();
	
	System.out.println("Enter A Date");
         date = sc.nextLine();

	System.out.println("Enter A Medical Stock");
         stock = sc.nextInt();

	System.out.println("Enter A Medical quantity");
         quantity = sc.nextInt();

	System.out.println("Enter A medicine Price");
         price = sc.nextDouble();

	
        }

   
	void display()
	{
		System.out.println("Medical Name: "+medicalName );
		System.out.println("Medical ISA Number: "+ medicalIsnNumber );
		System.out.println("Medical City: "+mCity);
		System.out.println("Medical Onear: "+mOnear);
		System.out.println("Medical Mobile Number: "+mMobileno);
		System.out.println("Medical Email Id: "+mEmailId );
		System.out.println("A Date: "+date);
		System.out.println("A Stock: "+stock);
		System.out.println("A Quantity: "+quantity);
		System.out.println("Medicine Price: "+price);
	}
}

class medical_ex
{
	public static void main(String[] As)
	{
	medical m = new medical();
	m.getdata();
	m.display();
	}
}