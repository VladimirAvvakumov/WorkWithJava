package lection1;
import java .util.Scanner;

import javax.xml.validation.Validator;
//новый оператор метод 
public class task18 {
    public static void main(String[] args) {
        int mounth = 2;
        String text = "";
        switch (mounth) {
            case 1:
                text = "Autumn";
                break;
        
            default:
            text = "mistake";
                break;
        }
        System.out.println(text);
        // iScanner.close();
    }
}
