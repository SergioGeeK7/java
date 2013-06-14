/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionfactorial;
 import java.io.*;  public class AplicacionFactorial {  private static BufferedReader ent = new BufferedReader(    new InputStreamReader(System.in));  private static PrintWriter sal = new PrintWriter(System.out,true);  private static PrintWriter salErr = new PrintWriter(System.err,true);    private static int x (int n) {   if (n <=0) {    return 1;   }   else {    return n + x (n-2);   }  }    public static void main(String[] args) throws IOException {   int numero = 4;      sal.println("Recursion de " + numero + " = " + x(4));  } } 