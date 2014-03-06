package gestiondeusuarios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.Writer;

public class GestionDeUsuarios {

   
    public static void main(String[] args) {
       
    }
    private Object FileReaderfr;
    private Object BufferedReaderbr;
    private FileReader fr;
    private BufferedReader br;
    private Object FileWriterfw;
    private Writer fw;
    
    public void cargarUsuarios() {
    File archivo = null;
    FileReaderfr = null;
    BufferedReaderbr = null;

try {
    archivo = new File("Data/usuarios.txt");
    fr = new FileReader(archivo);
    br = new BufferedReader(fr);

    int pos;
    String aux;
    String linea;

    String idUsuario;
    String nombres;
    String apellidos;
    String clave;
    int perfil;

    while ((linea = br.readLine()) != null) {
        // Extraemos ID Usuario
        pos = linea.indexOf('|');
        aux = linea.substring(0, pos);
        idUsuario = aux;
        linea = linea.substring(pos + 1);

        // Extraemos Nombres
        pos = linea.indexOf('|');
        aux = linea.substring(0, pos);
        nombres = aux;
        linea = linea.substring(pos + 1);

        // Extraemos Apellidos
        pos = linea.indexOf('|');
        aux = linea.substring(0, pos);
        apellidos = aux;
        linea = linea.substring(pos + 1);

        // Extraemos Clave y perfil
        pos = linea.indexOf('|');
        aux = linea.substring(0, pos);
        clave = aux;
        linea = linea.substring(pos + 1);
        perfil = new Integer(linea);

//Usuario miUsuario = new Usuario(idUsuario,nombres,apellidos,clave,perfil);
//misUsuarios[conUsu] = miUsuario;
//conUsu++;
            }
        } catch (Exception e1) {
            e1.printStackTrace();
        } finally {
        try {
        if (fr != null) {
        fr.close();
                        }
                    } catch (Exception e2) {
                    e2.printStackTrace();
            }
        }
    }
    
    
    public void grabarUsuarios() {
        
    FileWriterfw = null;
    PrintWriter pw = null;
    try {
        fw = new FileWriter("Data/usuarios.txt");
        pw = new PrintWriter(fw);

    //for (int i = 0; i<conUsu; i++) {
    //pw.println(misUsuarios[i].toString());
            //}
        } catch (Exception e1) {
            e1.printStackTrace();
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }


    
    
    
}
