// Дан массив nums = [3,2,2,3] и число val = 3. 
// Если в массиве есть числа, равные заданному, нужно перенести эти 
// элементы в конец массива. Таким образом, первые несколько (или все) 
// элементов массива должны быть отличны от заданного, а остальные - равны ему.

import java.util.Scanner;

/**
 * Напишите функцию printPrimeNums, которая выведет на экран все простые числа
 * в промежутке от 1 до 1000, каждое на новой строке.
 * <p>
 * Напишите свой код в методе printPrimeNums класса Answer.
 * <p>
 * Пример
 * <p>
 * 2
 * 3
 * 5
 * 7
 * 11
 * ...
 * seminar2
 */
public class seminar2 {

    private static void printPrimeNums(int n ) {

        boolean b = true;
        for (int p = 2; p < n; p++) {
            for (int i = 2; i < p; i++) {
                if (p % i == 0) {
                    b = false;
                    break;
                }

            }
            if (b) {
                System.out.println(p);
            } else {
                b = true;
            }

        }
    }

    public static void main(String[] args) {

        printPrimeNums(1000);
    }
}
