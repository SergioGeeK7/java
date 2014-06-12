/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testlist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andres
 */
public class TestList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList ll = new ArrayList();

        ll.add(1);

        List<String> lala;

        List<TestList> ojo;

        Object a = 1;

        int i = 0;

        while ((a = tyype(i)) != null) {
            System.out.println(i++);
        }

        System.out.println(a);
        
        
        tyype( i==0 ? 4:2 );
        
        i += i==0 ? 2:3;

    }

    public static Object tyype(int i) {

        if (i < 10) return i;
        return null;

    }

}
