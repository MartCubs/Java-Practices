import java.awt.*; 
import javax.swing.*;

class DFrame extends JFrame {
//  JPanel panel;
  JLabel label;

  // constructor
  DFrame(String title) {
//    super( title );                      // invoke the JFrame constructor
    this.setSize( 150, 100 );
    this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    this.setBackground(Color.YELLOW);
    this.setForeground(Color.YELLOW);
    
    setLayout( new FlowLayout() );       // set the layout manager
    label = new JLabel("Hello Swing!");  // construct a JLabel
    add( label );                        // add the label to the JFrame
  }

} 

public class Myframe
{
  public static void main ( String[] args )
  {
    DFrame frame = new DFrame("Hello"); // construct a MyFrame object
    frame.setVisible( true );             // ask it to become visible
  }
}