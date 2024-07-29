package lection1;

public class task20 {
    public static void main(String[] args) {
        int value = 321;
        int count = 0;

        while (value != 0) {
            value /= 10;
            count++;
        }
        System.out.println(count);
// цикл ду вайл с постусловием (то же самое только пишем по разному)
        do{
            value /= 10;
            count++;
        } while(value != 0);
        System.out.println(count);

    }
}
