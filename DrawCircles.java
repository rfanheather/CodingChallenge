package Part1;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
 

@SuppressWarnings("serial")
public class DrawCircles extends JFrame implements MouseListener{  
	
	public CirclesPanel circle;
	public Point pt;
	boolean circlePainted = false;
	
	public DrawCircles() {  
        setTitle("Part1"); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(430, 500); 
        setVisible(true);
	    setLocationRelativeTo(null);  
	    
        // set background grid
	    GridPanel grid = new GridPanel();
	    grid.addMouseListener(this);
	    getContentPane().add(grid);  
    }  
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getButton() == MouseEvent.BUTTON1){       // check if a right-click is caught
             Point pt = e.getPoint();
             circle = new CirclesPanel(pt);
             getContentPane().add(circle);
             setVisible(true);
      	}
	}
	
	
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		  
	 
	    
  /** main method */ 
    public static void main(String[] args) {  
        	DrawCircles frame = new DrawCircles();  
	    frame.setVisible(true); 
	}

@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}


}
