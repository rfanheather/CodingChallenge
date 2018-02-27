package Part1;
import javax.swing.JFrame;
 

@SuppressWarnings("serial")
public class PartOne extends JFrame {  
    public PartOne() {  
        setTitle("Part1"); 
        // set grid
        getContentPane().add(new GridPanel());  
    }  
 
    
  /** main method */ 
    public static void main(String[] args) {  
        	PartOne frame = new PartOne();  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	    frame.setSize(430, 500);  
	    frame.setLocationRelativeTo(null);  
	    frame.setVisible(true); 
	    // catch mouse movements
	    //mouseEvents e = new mouseEvents();
	   // e.catchMouseClick(frame);
	    //frame.getContentPane().add(new CirclesPanel());
	    //g.drawOval(10,10,100,100); // 画椭圆
	}  
}
