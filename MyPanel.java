import javax.swing.JPanel;
import java.awt.*;

public class MyPanel extends JPanel {

    MyPanel(){
        this.setPreferredSize(new Dimension(500, 500));
    }

    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;

        //background
        g2D.setColor(Color.BLACK);
        g2D.fillRect(0,0,500,500);

        //Rat body
        g2D.setColor(Color.white);
        g2D.fillRect(200,200,200,200);

        //Rat head + ears
        g2D.fillRect(100,100,100,100);
        g2D.fillRect(100,80,25,25);
        g2D.fillRect(175,80,25,25);
        g2D.setColor(Color.pink);
        g2D.fillRect(100,80,15,15);
        g2D.fillRect(175,80,15,15);

        //eyes+nose
        g2D.fillRect(140,140,15,15);
        g2D.setColor(Color.black);
        g2D.fillRect(100,120,15,15);
        g2D.fillRect(170,120,15,15);
        g2D.setColor(Color.white);
        g2D.fillRect(172,122,5,5);
        g2D.fillRect(102,122,5,5);

        //Feet + Tail
        g2D.setColor(Color.pink);
        g2D.fillRect(400,380,70,20);
        g2D.fillRect(450,320,20,70);
        g2D.fillRect(180,380,40,20);

        //My star
        g2D.setColor(Color.white);
        g2D.fillRect(450,50,15,35);
        g2D.fillRect(455,40,5,55);
        g2D.fillRect(440,60,35,15);
        g2D.fillRect(430,65,55,5);
    }
}