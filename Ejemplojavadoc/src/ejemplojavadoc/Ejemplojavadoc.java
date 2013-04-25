
/*
 * ejemplojavadoc.java
 *
 * Created on July 5, 2003, 4:24 AM
 */

/**
 * Clase que comienza la estructura de escepciones
 * @author  Roberto Canales
 * @since  1.0
 * @see Visitar www.adictosaltrabajo.com
 */
class RCException extends Exception
{
    void depura(String psError)
    {
        System.out.println("Error: " + psError);
    }


    RCException(String psError)
    {
        super(psError);
        depura(psError);
    }
}

/**
 *
 * @author  Roberto Canales
 * @since  1.0
 * @see Visitar www.adictosaltrabajo.com
 */
public class Ejemplojavadoc {

    /** Constantes publicas de gestion errores*/
    public static final int ERROR   = 0;
    public static final int LOG     = 1;
    public static final int INFO    = 2;

    /** Constructor por defecto */
    public Ejemplojavadoc() {
    }

    void depura(String sError)
    {
        System.out.println("ejemplojavadoc: " + sError);
    }


    /**
     * @param args Array de argumentos
     */
    public static void main(String[] args) {
        /** Construimos un objeto no estático */
        Ejemplojavadoc objetoAuxiliar = new Ejemplojavadoc();

        try
        {
                objetoAuxiliar.ejecuta();
        }
        catch(RCException e)
        {
            objetoAuxiliar.depura("Excepcion = " + e.getMessage());
        }
    }

    /**
     *  Punto de entrada a la aplicación
     *  @exception RCException Se genera una excepción genérica.
     *  @return true
     */
    public boolean ejecuta() throws RCException
    {
        /** Retornamos true por defecto */
        int error = 0;

        if(error == 0)
        {
            throw new RCException("Invocamos excepciones");
        }

        return true;
    }
}
    