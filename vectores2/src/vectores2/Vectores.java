
package javaapplication8;



import java.io.*;
import java.lang.*;

public class Vectores {
    
    
public static void main(String[] args) throws IOException 
{

int numeros[];
int indice=0;
int valor=0;
int menor = 999;
double suma=0;
int mayor=0;
boolean Sw;
DataInputStream oCadena;

numeros = new int [10];
oCadena = new DataInputStream(System.in);

//Llenado de un arreglo

System.out.println("Ingrese 10 valores");

for ( indice=0; indice < 10; indice++){

do{
Sw = true;
try{
valor = Integer.parseInt(oCadena.readLine());
}
catch (Exception e){
System.out.println("Error.., Ingreso dato incorrecto");
Sw = false;
}

}while (Sw == false);

numeros[indice] = valor;
}

//Recorrido
for (indice=0; indice < 10; indice++){
suma = suma + numeros[indice];
//es para encontrar el numero mayor dentro del arreglo
if (numeros[indice] > mayor){
mayor = numeros[indice];

}
}

//numero menor
for(int i = 0;i<10;i++){
if(numeros[i] < menor){
menor = numeros[i];
}
}

//para sacar el promedio y mostrar resultados finales
suma = suma / 10;
System.out.println("el promedio numeros del arreglos es: "+suma);
System.out.println("el numero mayor del arreglo......: "+mayor);
System.out.println("el numero menor del arreglo es.....:"+menor);
}

}