package lection1;

public class task10 {
    public static void main(String[] args) {
        int[][] arr = new int[3][5];

        for(int i = 0 ; i < arr.length; i++){
            for (int j =0; j< arr[i].length; j++ ) {
                System.out.println( arr[i][j]);// "%d" не выходит выдает ошибку
            }
            System.out.println();
        }
    }
}
