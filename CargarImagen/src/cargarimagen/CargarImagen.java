/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cargarimagen;

import java.awt.*; import java.applet.*;
public class CargarImagen extends Applet{

    Image miImagen; 
    public void init() { 
        miImagen = getImage(getDocumentBase(), "kratos2.gif"); 
    } 
    public void paint(Graphics g){ 
        g.drawImage(miImagen, 0, 0, getWidth(), getHeight(), this);
    } 
}

