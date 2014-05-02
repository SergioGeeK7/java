
package htmlwithswing_3;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class HTMLWithSwing_3 {

    
    public static void main(String[] args) {

        UIManager.put("OptionPane.background", Color.yellow);
        UIManager.put("OptionPane.messagebackground", Color.yellow);
        UIManager.put("Panel.background", Color.black);

        String message = "<html><body>"
                + "<div width='400px' height='100px' align='center' color='white'>am&eacute;ricana</div></body></html>";
        
        
        JLabel messageLabel = new JLabel(message);
        JOptionPane.showMessageDialog(null, message, "dónde estudió alirio?", JOptionPane.PLAIN_MESSAGE);
    }
}
