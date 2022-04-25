package urok15_16;

public class Lesson_Exceptions {

    public static void main(String[] args) {

        checkAge(20);

////        int [] myNumbers = {1, 2, 3};
////        System.out.println(myNumbers[10]);//error
//
//        try {
//            // Блок кода который мы тестируем
//            int[] myNumbers = {1, 2, 3};
//            System.out.println(myNumbers[10]);//error
//        } catch (Exception e) {
//            System.out.println("Мы вышли из границ массива");
//
//            //Блок кода для обработки исключения
//        }finally {
//            System.out.println("Работает всегда");

    }

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Меньше 18 лет - доступ закрыт");
        } else {
            System.out.println("Старше 18 лет - доступ открыт");
        }

    }
}
