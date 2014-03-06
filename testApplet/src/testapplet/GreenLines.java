
package testapplet;

import java.applet.*;
import java.awt.*;
public class GreenLines extends Applet {
    
    int m_height, m_width;
    
    public void paint(Graphics m) {
    m.setColor(Color.black);
    for (int i = 0; i < 10; ++i) 
    m.drawLine(m_width, m_height, i * m_width / 10, 0);
    }
    
    
    public void init() {
    m_width = getSize().width;
    m_height = getSize().height;
    setBackground(Color.green);
    }


    
    
}
