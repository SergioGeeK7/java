package testdotunlimit;

import javax.swing.JTextArea;

public class JTextAreaMio extends JTextArea{

    public JTextAreaMio(int rows, int columns) {
        super(rows, columns);
    }

    
    
    
    
    
    public JTextAreaMio appendV2(String str) {
        super.append(str); //To change body of generated methods, choose Tools | Templates.
        return this; // retorno mi propio objeto TextAreamio
    }
    
    
    
    
    
}
