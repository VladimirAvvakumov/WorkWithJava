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
        StringBuilder result = new StringBuilder();// метод стрингбилдер
        int k = n * 2;
        for (int i = 0; i < k; i++) {
            result.append(c1);//аппенд работает как и в питоне добовляет в переменную значение в скобках
            result.append(c2);//
        }
        System.out.println(result);
    }
}
// // Напишите метод, который вернет содержимое текущей папки в виде массива строк.
// // Напишите метод, который запишет массив, возвращенный предыдущим методом в
// // файл.
// // Обработайте ошибки с помощью try-catch конструкции. В случае возникновения
// // исключения,
// // оно должно записаться в лог-файл.
// //
// //
// //
// public static List<String> readDir(String path) {
//     File folder = new File(path);

//     if (!folder.isDirectory()) {
//         throw new RuntimeException("File is not directory");
//     }

//     File[] files = folder.listFiles();
//     List<String> result = new ArrayList<>();

//     for (File file : files) {
//         String name = file.getName();
//         result.add(name);
//         if (isThrow()) {
//             LOGGER.log(Level.INFO, "Error reading directory: " + folder.getAbsolutePath());
//         }
//     }

//     return result;
// }

// public static void writeToFile(String pathIn, String pathOut) {
//     List<String> list = readDir(pathOut);

//     try (FileWriter fw = new FileWriter(pathIn)) {
//         for (String s : list) {
//             fw.write(s + "\n");
//             fw.flush();
//             if (isThrow()) {
//                 LOGGER.log(Level.INFO, "Error writing directory: " + s);
//             }
//         }
//     } catch (Exception e) {
//         e.printStackTrace();
//     }
// }

// /**
//  * str = select * from students where name=Ivanov ";
//  * StrBuild sb = new StrBuild(str);
//  *
//  * strs = "name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"
//  * strs = strs.replace("{", "").replace("}", "").replace("\"", ")
//  * String[] arr = strs.split(",") -> [name:Ivanov, country:Russia]
//  * String[] arrName = arr[0].split(":") -> [name, Ivanov]
//  * sb.append(" ").append(arrName[0]).append("=").append(arrName[1])
//  *
//  * if(!arrName[1].equals("null")
//  */

//    private static boolean isThrow() {
//        String str = "";
//
//        int a = 0;
//        int b = 2;
//        int digit = a + (int) (Math.random() * b);
//        // System.out.println(digit);
//        return digit > 0;
//    }


