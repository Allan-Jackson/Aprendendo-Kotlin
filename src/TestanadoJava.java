//Tipos primitivos

import java.util.*;
import java.util.function.Consumer;

/*
   byte
   int (integer)
   long
   boolean (logical)
   float (floating number)
   double
   char (character) 'a'
 */
        /*OPERADORES MATEMÁTICOS
        *
         +
         -
         *
         /
         %
         */
        /*OPERADORES LÓGICOS
          && (e)
          || (ou)
          ! (não)
        */
        /*OPERADORES RELACIONAIS
          4 != 10
           > (maior que)
           < (menor que)
           >= (maior que ou igual)
           <= (maior que ou igual)
           == (igual)
           != (diferente)
        */

public class TestanadoJava{

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,9,3,6,6,7);
        Comparator compareInt = new Comparator<Integer>() {
            @Override
            public int compare(Integer n1, Integer n2) {
                if(n1<n2)
                    return 1;
                else if(n1==n2)
                    return 0;
                else
                    return -1;
            }
        };
        list.sort(compareInt);
        list.forEach(item -> {
            System.out.println(item);
        });
    }
}
