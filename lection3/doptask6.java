package lection3;

import java.util.List;

public class doptask6 {
    public static void main(String[] args) {
        Character value = null;// создали переменную из обертки символьного типа
        List<Character> list1 = List.of('S', 'e', 'r', 'g', 'e', 'y');//
        System.out.println(list1);
       // list1.remove(1); // java.lang.UnsupportedOperationException
        List<Character> list2 = List.copyOf(list1);
    }
}