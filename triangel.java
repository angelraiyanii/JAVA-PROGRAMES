import java.io.*;

class patten_2{

    public static void main(String[] a)
        {
            int count=1;
            for(int i=1;i<=5;i++)
            {
                for(int j=i;j<=5;j++)
                {
                  System.out.print(" ");  
                }
                   for(int j=1;j<=i;j++)
                {
                
                  System.out.print(count+" ");
                    count++;  
                
                }
                System.out.println(" ");
            
            }    
        }
}