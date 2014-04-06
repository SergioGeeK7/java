package defaultparams;

public class DefaultParams {

    public static void main(String[] args) {

        int a = 4;

        Integer b = 4;
        Double d = 4.4;
        int c = b;

        foo("a");
        foo("a", 1, 2);

    }

    public static void test(String lala, String optional) {
        
    }

    public static void lala(String... lol) {

    }

    static void foo(String a, Integer... b) {
        Integer b1 = b.length > 0 ? b[0] : 0;
        Integer b2 = b.length > 1 ? b[1] : 0;
        
       
        
    //...
    }

    static void varArgsArray(char[]  
        ... letras) {
        for (int i = 0; i < letras.length; i++) {
            System.out.println("Arreglo: " + i);
            for (int j = 0; j < letras[i].length; j++) {
                System.out.println(letras[i][j]);
            }
        }
    }

}
