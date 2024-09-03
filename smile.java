import java.applet.*;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.*;

/*
<applet code="smile.java" width=500 height=500>
</applet>
*/

public class smile extends Applet
{
    public void paint(Graphics g)
    {
        //g. setColor(Color.black);
        //g.drawArc(200,200,250,250,0,360);

        g. setColor(Color.yellow);
        g.drawArc(200,200,250,250,0,360);
        g.fillArc(200,200,250,250,0,360);

        g.setColor(Color.black);    //for left eye
        g.drawArc(250,270,30,50,0,360);
        g.fillArc(250,270,30,50,0,360);

        g.setColor(Color.black);    //for right eye
        g.drawArc(370,270,30,50,0,360);
        g.fillArc(370,270,30,50,0,360);

        g.setColor(Color.black);
        g.drawArc(260,320,130,80,0,-170);

    }

}