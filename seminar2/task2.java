package seminar2;
import java.io.File;
import java.io.FileReader;
import java.util.List;

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
        StringBuilder result = new StringBuilder();
        int k = n * 2;
        for (int i = 0; i < k; i++) {
            result.append(c1);
            result.append(c2);
        }
        System.out.println(result);
    }
//    Напишите метод, который вернет содержимое текущей папки в виде массива строк.
//Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
//Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения,
// оно должно записаться в лог-файл.
//
//
//
    public static List<String> readDir(String path){
        File folder = new  File(path);

    }


}
