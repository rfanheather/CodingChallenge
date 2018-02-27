package Part1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class DragCircle extends JPanel {

    private final class MouseDrag extends MouseAdapter {
        private boolean dragging = false;
        private Point last;

        @Override
        public void mousePressed(MouseEvent e) {
            last = e.getPoint();
            dragging = isOnCircle(last);
            repaint();
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            last = null;
            dragging = false;
            repaint();
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            if (dragging) {
            	    radius = (int) Math.sqrt(Math.pow(e.getX() - p.x, 2) + Math.pow(e.getY() - p.y, 2));
            }
            last = e.getPoint();
            repaint();
        }
    }


    private Point p;
    private int radius;

    private MouseDrag mouseDrag;

    public DragCircle(Point pt) {
    	    p = pt;
    	    radius = 100;
        mouseDrag = new MouseDrag();
        addMouseListener(mouseDrag);
        addMouseMotionListener(mouseDrag);
    }

    public boolean isOnCircle(Point last) {
    	    double l = Math.pow(last.x - p.x, 2) + Math.pow(last.y - p.y, 2);
        return l < (Math.pow(radius, 2) + 10) && l > (Math.pow(radius, 2) - 10);
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
        g.drawOval(p.x - radius / 2, p.y - radius / 2, radius, radius);
      }  

}