package Part2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


@SuppressWarnings("serial")
class PartTwo extends JPanel {

    private final class MouseDrag extends MouseAdapter {        
        
        @Override
    	    public void mouseClicked(MouseEvent m) {
    		// TODO Auto-generated method stub
    		    if(m.getButton() == MouseEvent.BUTTON1){  // check if a left-click is caught
    		    	    last = m.getPoint();
    		    	    System.out.println(last.x);
    		    	    System.out.println(last.y);
    		    	    x = last.x;
    		    	    y = last.y;
    		    	    d = 100;
    		    	    if (isOnDot(last)) {
                	    repaint();
     		    	}
          	}
    	    }
    }

    private int x = Integer.MAX_VALUE;  // X-Coordinate of the position of circle
    private int y = Integer.MAX_VALUE;  // Y-Coordinate of the position of circle
    private int d = 200;
    private Point last;
    private int dotSize = 10;
    
    private boolean[][] gridColor = new boolean[20][20];
    private boolean generate = false;

    private MouseDrag mouseDrag;

    PartTwo() {
    	    setPreferredSize(new Dimension(650, 650));
        setBackground(Color.WHITE);
        mouseDrag = new MouseDrag();
        addMouseListener(mouseDrag);
        addMouseMotionListener(mouseDrag);
    }

    public void paintCircle(boolean buttonClicked) {
    	    generate = buttonClicked;
    	 // TODO
    	    repaint();
    }
    
    public boolean isOnDot(Point pt) {
    	    if (pt.x < 30 || pt.x > 610 || pt.y < 30 || pt.y > 610) {
    	    	    return false;
    	    }
    	    	
    	    for (int i = 1; i < 21; i++) {
    	    	    for (int j = 1; j < 21; j++) {
    	    	    	    if (pt.x >= 30 * i && pt.x <= 30 * i + 10 && pt.y >= 30 * j && pt.y <= 30 * j + 10 ) {
    	    	    	    	    gridColor[i-1][j-1] = !gridColor[i-1][j-1];
    	    	    	    	    return true;
    	    	    	    }
    	    	    }
    	    }
    	    return false;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 1; i < 21; i++) {
        	    for (int j = 1; j < 21; j++) {
        	    	    if (gridColor[i - 1][j - 1] == false) {
        	    	    	    g.setColor(Color.GRAY);  // set default points to gray
        	    	    } else {
        	    	    	    g.setColor(Color.BLUE);
        	    	    }
        	    	    g.fillRect(i * 30, j * 30, dotSize, dotSize);
        	    }
        }
        
        if (generate) {
        	    g.setColor(Color.RED); // set bound of the circle to blue
            g.drawOval(x - d/2, y - d/2, d, d);
            generate = false;
        }
    }

    
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("Part2");
        jFrame.setSize(600, 500);
        
        JPanel buttonPanel = new JPanel();
        JButton button = new JButton("generate");
        buttonPanel.setPreferredSize(new Dimension(420, 60));
        	buttonPanel.add(button);
        	
        	jFrame.setLayout(new FlowLayout());
        jFrame.add(new PartTwo());
        jFrame.add(buttonPanel);
        jFrame.setVisible(true);
        jFrame.setLocationRelativeTo(null);  
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}