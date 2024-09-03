import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="Layout.java" width=600 height=400>
</applet>*/
public class Layout extends Applet
{
	Button b1,b2,b3,b4,b5;
	public void init()
	{
		setLayout(new BorderLayout());
		b1=new Button("Angel");
		b2=new Button("Rensi");
		b3=new Button("Priyesha");
		b4=new Button("Vinayak");
		b5=new Button("Dhyani");

		add(b1,BorderLayout.EAST);
		add(b2,BorderLayout.WEST);
		add(b3,BorderLayout.SOUTH);
		add(b4,BorderLayout.NORTH);
		add(b5,BorderLayout.CENTER);
	}
}