import java.util.Stack;
import java.util.EmptyStackException;

public class Pila {
    static void hacePush( Stack st,int a ) {
        st.push( new Integer( a ) );
        System.out.println( "push( "+a+" )" );
        System.out.println( "pila: "+st );
        }

    static void hacePop( Stack st ) {
        System.out.print( "pop -> " );
        Integer a = (Integer)st.pop();
        System.out.println( a );
        System.out.println( "pila: "+st );
        }

    public static void main( String args[] ) {
        Stack st = new Stack();
        System.out.println( "pila: "+st );
        hacePush( st,15 );
        hacePush( st,45 );
        hacePush( st,69 );
        hacePop( st );
        hacePop( st );
        hacePop( st );

        try {
            hacePop( st );
        } catch( EmptyStackException e ) {
            System.out.println( "pila vacia" );
        }
    }
}
