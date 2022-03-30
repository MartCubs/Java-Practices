import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class frameCreate {

	public static void main(String[] args) {
		
		JFrame nFrame = new JFrame("Test Frame");
		nFrame.setSize(400,300);
		nFrame.setVisible(true);
		nFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//  Color on Frame does not work. Should create Panel and add to Frame 
//		nFrame.setForeground(Color.BLUE);
//		nFrame.setBackground(Color.BLUE);



		JPanel nPanel = new JPanel();
		nPanel.setBackground(Color.ORANGE);
		
		nFrame.add(nPanel);
		
		
	}
	
}