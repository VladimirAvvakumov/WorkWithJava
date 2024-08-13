import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * seminar
 */
public class seminar {

    public static void main(String[] args) {
        List<Integer> ints = List.of(1, -2, 300, 24, 5, 6, 17, 8, 93, 10);// создание массива метод(список неизменяемый)

        List<Integer> i = new ArrayList<>();// меняем массив с неизменяемого на изменяемый
        i.addAll(ints);// метод для добовления в массив данных из неизменяемого.(работает с любыми переменными)
        System.out.println(i);

        Collections.sort(i);// метод для сортировки массива от меньшего к большему

        System.out.println(i);
    }
}