/**
 *
 * @author Jesus Ivan
 */
public class Main{
    public static void main(String args[]) {
       java.awt.EventQueue.invokeLater( new Runnable(){      
           public void run() {
                new QuicksortGUI().setVisible(true);
                new QuicksortGUI().setLocationRelativeTo(null);
            }
      });
    }
}