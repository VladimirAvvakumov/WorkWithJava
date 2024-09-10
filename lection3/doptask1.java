package lection3;

public class doptask1 {
    static int[] AddItemInArray(int[] array, int item) {
        int length = array.length;

        int[] temp = new int[length + 1];
        System.arraycopy(array, 0, temp, 0, length);
        temp[length] = item;
        return temp;
    }
    public static void main(String[] args) {
        int[] a = new int[] { 0, 9 };
        for (int i : a) { System.out.printf("%d ", i); }
        a = AddItemInArray(a, 11);// метод для добовления элементов ы массив
        a = AddItemInArray(a, 111);
        a = AddItemInArray(a, 1111);
        System.out.println();
        for (int j : a) { System.out.printf("%d ", j); }
        System.out.println();
    }
}
