import java.awt.*;
import javax.swing.*;
import java.io.*;
class framedemo
{
    public static void main(String a[])
    {
        JFrame f=new JFrame("BCA");
        JLabel l1=new JLabel("RollNo");
        JTextField t1=new JTextField("   ");
               JLabel l2=new JLabel("Name");
            JTextField t=new JTextField("        ");
        JLabel l3=new JLabel("Gender");
            f.setLayout(new FlowLayout());
        JButton b1=new JButton("Click Here");
	 JButton b2=new JButton("HELLO");
	 JButton b3=new JButton("JAVA PRO");
        JRadioButton r=new JRadioButton(" Male");
        JRadioButton r1=new JRadioButton(" Female");
        JCheckBox c=new JCheckBox("C++");
          c.setBounds(100, 100,  50, 50);    
        JCheckBox c1=new JCheckBox("Java");
        JCheckBox c2=new JCheckBox("C#");
        JCheckBox c3=new JCheckBox("HTML");
        f.getContentPane().setBackground(Color.PINK);
        l2.setForeground(new Color(1,44,255));
         l2.setFont(new Font("Verdana", Font.PLAIN, 18));
        l1.setForeground(new Color(201,97,205));
         l3.setForeground(new Color(255,255,102));

        Choice k=new Choice();
        k.add("Rajkot");
        k.add("Baroda");
        k.add("Ahmedabad");
        k.add("Jamnagar");
        

            f.add(l1);
        f.add(t1);
            f.add(l2);
            f.add(t); f.add(l3);
        f.add(r); f.add(r1);
        f.add(c);    f.add(c1);    f.add(c2);    f.add(c3);    
        f.add(k);    
        f.add(b1);
	f.add(b2);
	f.add(b3);
            f.setSize(400,400);
            f.setVisible(true);
    }
}