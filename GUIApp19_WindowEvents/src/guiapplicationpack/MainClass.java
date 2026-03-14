
package guiapplicationpack;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MainPanel extends JPanel implements WindowListener, WindowStateListener
{

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("WindowOpenned");
    }

    @Override
    public void windowClosing(WindowEvent e) {
      System.out.println("WindowClosing");   
    }

    @Override
    public void windowClosed(WindowEvent e) {
         System.out.println("WindowClosed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
         System.out.println("WindowIconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
         System.out.println("WindowDeiconified");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("WindowActivated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("WindowDeactivated");
    }

    @Override
    public void windowStateChanged(WindowEvent e) {
        System.out.println("WindowStateChanged"); // invokes when maximizes or minimizes 
    }
    
}
class MainFrame extends JFrame
{
    private MainPanel panel;
    public MainFrame()
    {
        panel = new MainPanel();
        panel.setBackground(new Color(225,250,160));
        panel.setLayout(new BorderLayout());
        addWindowListener(panel);
        addWindowStateListener(panel);
        super.add(panel);
    }
}
public class MainClass
{
    public static void main(String[] args)
    {
        MainFrame frame = new MainFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(510, 200);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Window Event");
        
    }
}

