/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package applet_resultado;

import java.awt.*;
import java.applet.*;

// <applet width="200" height="200" code="Pru"></applet>

public class Applet_Resultado extends Applet{
public void paint(Graphics g) {
int x;
x = 2 / 3;
g.drawString("2 / 3 = "+x, 100, 100);
}
}