//public class sem32 {
//    public void printPrimeNums() {
//        // Проходим по всем числам от 2 до 1000
//        for (int num = 2; num <= 1000; num++) {
//            // Проверяем, является ли число простым
//            if (isPrime(num)) {
//                // Если да, выводим его на экран
//                System.out.println(num);
//            }
//        }
//    }
//
//    // Метод для проверки, простое число или нет
//    private boolean isPrime(int number) {
//        // Проверка делимости на все числа от 2 до корня number
//        for (int i = 2; i <= Math.sqrt(number); i++) {
//            // Если найдется делитель, значит число не простое
//            if (number % i == 0) {
//                return false;
//            }
//        }
//        // Если делителей не найдено, число простое
//        return true;
//    }
//
//    public static void main(String[] args) {
//        // Создаем объект класса Answer и вызываем метод
//        Answer answer = new Answer();
//        answer.printPrimeNums();
//    }
//}
