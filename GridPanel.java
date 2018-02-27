package Part1;
import javax.swing.JPanel;  
import java.awt.Color;  
import java.awt.Graphics;  

// Set the background points  
@SuppressWarnings("serial")
public class GridPanel extends JPanel {  
    protected void paintComponent(Graphics g) {  
	    super.paintComponent(g);  
	    g.setColor(Color.GRAY); // set default points to gray
	
	    for (int i = 1; i < 21; i++) {
	    	    for (int j = 1; j < 21; j++) {
	    	    	    g.fillRect(i * 20, j * 20, 3, 3);
	    	    }
	    }
    }  
}  