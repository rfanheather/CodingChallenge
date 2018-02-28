package Part2;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


@SuppressWarnings("serial")
public class FrameTwo extends JFrame {
	
	public boolean generate = false;
	public PartTwo p = new PartTwo();
	
	public FrameTwo() {
		setTitle("Part2");
        setSize(1000, 1000);
        
        JPanel buttonPanel = new JPanel();
        JButton button = new JButton("generate");
        button.addActionListener(new ButtonListener());
        buttonPanel.setPreferredSize(new Dimension(800, 60));
        	buttonPanel.add(button);
        	
        	setLayout(new FlowLayout());
        add(p);
        add(buttonPanel);
        setVisible(true);
        setLocationRelativeTo(null);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private final class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			generate = true;
			p.paintCircle(true);
		}
		
	}
	
	/** main method */ 
    public static void main(String[] args) {  
        	FrameTwo frame = new FrameTwo();  
	    frame.setVisible(true); 
	}
}