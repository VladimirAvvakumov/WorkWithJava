package sem2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



public class task1 {
    public static void main(String[] args) {


//    static final Logger LOGGER = Log.getLogger(sem2.class.getName());
//
//    public static void main(String[] args) {
//
//        writeToFile("lesson2.txt", "E:\\code\\work\\gb\\JavaAPI\\1 and 2 groups\\2");
//
//        // [4,5,2,0,7]
//
//    }

        private static void foo () {
            String str = "Hello World";

            File f = new File("hello.txt");
            FileWriter fw = null;

            try {
                fw = new FileWriter(f);
                fw.write(str);
                fw.flush();
            } catch (Exception e) {
                System.out.println("Error: " + e);
            } catch (Throwable e) {
                e.printStackTrace();
            } finally {
                try {
                    fw.close();
                } catch (Exception e) {
                    System.out.println("Error: Stream can not closed");
                }
            }
        }
    }
}
