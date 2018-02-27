package Part1;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;



public class mouseEvents {
	
	public void catchMouseClick(DrawCircles frame) {
        frame.addMouseListener(new MouseListener() {     //为窗口添加鼠标事件监听器 
            @SuppressWarnings("static-access")
			@Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
             	if(e.getButton()==e.BUTTON1){       //  判断获取的按钮是否为鼠标的右击         
                    Point c = e.getPoint();
                    frame.getContentPane().add(new CirclesPanel(c));
                    frame.setVisible(true); 
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

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
        });
	}
}