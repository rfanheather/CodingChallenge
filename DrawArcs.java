package Part1;

import javax.swing.JFrame;  
import javax.swing.JPanel;  
import java.awt.Color;  
import java.awt.Graphics;  
 
@SuppressWarnings("serial")
public class DrawArcs extends JFrame {  
  public DrawArcs() {  
    setTitle("画弧形");  
    getContentPane().add(new ArcsPanel());  
  }  
 
  /** 主方法 */ 
  public static void main(String[] args) {  
    DrawArcs frame = new DrawArcs();  
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    frame.setSize(250, 300);  
    frame.setLocationRelativeTo(null);  
    frame.setVisible(true);  
  }  
}  
 
// 在面板上画弧形的类  
class ArcsPanel extends JPanel {  
  protected void paintComponent(Graphics g) {  
    super.paintComponent(g);  
    g.setColor(Color.BLUE); //设置弧形的颜色为蓝色  
 
    int i=0;  
    int xCenter = getWidth() / 2;  
    int yCenter = getHeight() / 2;  
    int radius = (int)(Math.min(getWidth(), getHeight()) * 0.4);  
 
    int x = xCenter - radius;  
    int y = yCenter - radius;  
 
    //使用while循环画弧形  
    while(i<360){  
        g.fillArc(x, y, 2 * radius, 2 * radius, i, 30);  
        i+=90;  
    }  
  }  
}  