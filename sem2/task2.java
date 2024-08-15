package sem2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

//Дано четное число N (>0) и строки c1 и c2, которые следует учитывать как 1 символ.
//Написать метод, который вернет строку длины N*2,
// которая состоит из чередующихся последовательностей c1 и c2, начиная с c1.
//
public class task2 {
    public static void main(String[] args) {
        task1(10);
    }

    public static void task1(int n) {
        String c1 = "c1";
        String c2 = "c2";
        StringBuilder result = new StringBuilder();// метод стрингбилдер построитель строк
        int k = n * 2;
        for (int i = 0; i < k; i++) {
            result.append(c1);//аппенд работает как и в питоне добовляет в переменную значение в скобках
            result.append(c2);//
        }
        System.out.println(result);
    }
}
