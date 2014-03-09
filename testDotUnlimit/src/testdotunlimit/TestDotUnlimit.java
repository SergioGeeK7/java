
package testdotunlimit;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class TestDotUnlimit extends JFrame implements ActionListener{

    JTextAreaMio jj= new JTextAreaMio(10,12);
    JButton btn1 = new JButton("Anade");

    public TestDotUnlimit(){
        
        super("test");
        setLayout(new FlowLayout());
        add(jj);
        add(btn1);
        btn1.addActionListener(this);
        pack();
        setSize(140,150);
        
        
        
    }
    
    
    
    public static void main(String[] args) {
    
        new TestDotUnlimit().setVisible(true);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource()==btn1) {
            jj.appendV2("\nhellow").appendV2("\nhellow2").appendV2("\nhellow3").
                                                    appendV2("\nhellow4").appendV2("\nCADENA !!!");
        }
        
        
    }
    
}
