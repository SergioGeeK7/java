
package datos;



import javax.swing.JOptionPane;


public class Datos {
  
   public static boolean R=false;
   public static int contador=0;
   public static int acum=0;
   public static int cont=0;
    public static void main(String[] args) {
        
        byte opcion = 1;
        
       
        while (opcion !=4 ){
             opcion = Byte.parseByte(JOptionPane.showInputDialog("BIENVENIDO AL MENÚ PRINCIPAL"
                    + "\n 1. Registrarse "
                    + "\n 2. Consultar promedio matricula"
                    + "\n 3. Consultar total estudiantes menores de edad"
                    + "\n 4. Salir"));
              switch (opcion) {
                case 1:
                    Registrar();
                    break;
                case 2:
                    consultarProm();
                     break;
                case 3:
                    consultarEst();
              }//Fin Switch
        }//Fin Mientras
    }// Fin Main

   

    public static void Registrar() {
        String nombre;
        byte edad;
        int matricula;
        
        
        
        nombre= JOptionPane.showInputDialog("Digite su nombre");
        edad = Byte.parseByte(JOptionPane.showInputDialog("Ingrese su edad"));
        while (edad < 0 || edad > 127){
            JOptionPane.showMessageDialog(null, "Ingrese una edad valida");
          edad = Byte.parseByte(JOptionPane.showInputDialog("Ingrese su edad"));
        }// FIn mientras
        if (edad<18){
            contador= contador + 1;
        }//fin si
        matricula= Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de su matricula"));
        acum=(acum + matricula);
        cont++;
        R= true;
       JOptionPane.showMessageDialog(null, "USTED HA SIDO REGISTRADO CORRECTAMENTE");
    }//Fin Método Registrar
    
     public static void consultarProm() {
         double prom;
       if (R==false){
           JOptionPane.showMessageDialog(null, "No se ha registrado ningún estudiante");
       } else {
          prom=acum/cont;
          JOptionPane.showMessageDialog(null, "El promedio de matricula de los estudiantes es: "+prom);
       }//Fin else
    }//Fin Método consultaProm

    public static void consultarEst() {
        if (R==false){
           JOptionPane.showMessageDialog(null, "No se ha registrado ningún estudiante");
       } else {
            if (contador>0){
            JOptionPane.showMessageDialog(null, "Total estudiantes menores de edad: " +contador);
        } else {
                JOptionPane.showMessageDialog(null, "Todos los estudiantes registrados son mayores de edad" );
            }//Fin Else
    }//Fin else
    
    }//Fin Método ConsultarEst
}// Fin Clase
