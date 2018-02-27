package Part1;
import javax.swing.JPanel;  
import java.awt.Color;  
import java.awt.Graphics;
import java.awt.Point;  

// draw circles  
@SuppressWarnings("serial")
public class CirclesPanel extends JPanel { 
	Point c;
	
	CirclesPanel(Point c) {
		this.c = c;
	}
	
  protected void paintComponent(Graphics g) {  
    super.paintComponent(g);  
    
    g.setColor(Color.GRAY); // set default points to gray

    for (int i = 1; i < 21; i++) {
    	    for (int j = 1; j < 21; j++) {
    	    	    g.fillRect(i * 20, j * 20, 3, 3);
    	    }
    }
    
    g.setColor(Color.BLUE); //设置弧形的颜色为蓝色  
    g.drawOval(c.x - 50, c.y - 50, 100, 100);
  }  
}  