package lection1;

public class task21 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0)// если делаем не равенство то выйдут четные !=
                continue;// означает что вернис в цикл фор
            // break; если поставить брейк то программа остановиться после первого
            // найденного числа в условии
            System.out.println(i);
        }
        int s = 0;
        for (int i = 0; i < 10; i++) {
            s+= i;// 0+1=1 , 1+2+3 3+4=7 7+8=15 15+9=24 24+10=34 34+11=45 bingo
        }
        System.out.println(s);
        // вложенные циклы то есть цикл внутри тела другого цикла
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {// вторым циклом фор мы повторяем вывод звезд 5 раз как и указано в условии
                System.out.print("* ");
            }
            System.out.println();
        }
        // форич цикл для перебора переменных массива
        int[] arg = new int[] {1,2,3,5,7,8}; 
        for (int i = 0; i < arg.length; i++) {
            arg[i] = 10;// обращаемся к индексам массива меняем их все на 10.
        }
        for (int i : arg) {// вместо инт можно писать стринг дабл и тд. в зависимости от типа переменной
            System.out.println(i);
        }
    }
}
