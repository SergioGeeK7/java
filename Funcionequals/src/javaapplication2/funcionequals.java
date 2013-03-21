/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author MCARDONF
 */import java.util.*;
public class funcionequals {

    
    public static Scanner meta=new Scanner (System.in);
    
    
    public static void main(String[] args) {
       
        System.out.println("ingrese edad");
        int a=meta.nextInt(),b=meta.nextInt();
        String f="falso",v="verdadero",bol="";
        
        boolean resultado = false;
        
        
        //resultado=true;
        
        
        
        // NO ENTRA SI ES IGUAL A LO QUE LE DIJE !=
        
        // ! si no es eso entra. SI ES ENTRA.
        
        
       if (a>=19 && v.equals ("verdadero") && a!=20  ){
            
            System.out.println("eres seryo");
            bol=v;  
            
        }else {
            
            System.out.println("no eres seryo");
            
        }
        
        
        
       // if (bol.equals(v)) {
            
       if (bol.equals("verdadero")) {     
       
            System.out.println("soy igual a verdadero jo!jo!jo!");
            
        } 
        
       
       // preguntara no es resultado verdadero , si no es verdadero entrara
       // if (!resultado){
       //-------------------------------------------   
       // preguntara con el if si resultado es true
       if (resultado) {
            
       
        System.out.println("entro la booleana");
        
        }
    }
        
        
        
        
        
        
        
        
        
        
        
    }

