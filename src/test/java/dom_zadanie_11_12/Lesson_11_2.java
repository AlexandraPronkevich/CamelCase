package dom_zadanie_11_12;

public class Lesson_11_2 {
    public static void main(String[] args) {

        int x = 56;

        if (x > 10) {
            System.out.println("Больше 10");
        }
        if (x < 100) {
            System.out.println("Меньше 100");
        }

        int z = x / 2;
        if (z > 20) {
            System.out.println("Результат деления на 2 больше 20");
        }

        if (x >= 5 && x <= 40) {
            System.out.println("Значение переменной между 5 и 40 включительно");
        } else {
            System.out.println("Значение переменной < 5 или > 40 ");
        }

    }
}


