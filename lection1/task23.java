package lection1;

import java.io.FileReader;
import java.io.*;
// чтение файла построчно с красивыми равняшками.
public class task23 {
    public static void main(String[] args) throws Exception {// throws Exeptions означает что мы ожидаем что может быть ошибка.
        FileReader fr = new FileReader("file.txt");
        int c;
        while ((c = fr.read()) != -1) {
            char ch = (char) c ;
            if (ch =='\n') {
                System.out.print(ch);
            }
            else{
                System.out.print(ch);
            }
        }
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.printf("== %s ==\n", str);
            
        }
        br.close();
    }
}
