package sem2;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import static sem2.task1.LOGGER;
import static sem2.task1.readDir;

public class task4 {
     public static void writeToFile(String pathIn, String pathOut) {
         List<String> list = readDir(pathOut);

         try (FileWriter fw = new FileWriter(pathIn)) {
             for (String s : list) {
                 fw.write(s + "\n");
                 fw.flush();
                 if (isThrow()) {
                     LOGGER.log(Level.INFO, "Error writing directory: " + s);
                 }
             }
         } catch (Exception e) {
             e.printStackTrace();
         }
     }
}
