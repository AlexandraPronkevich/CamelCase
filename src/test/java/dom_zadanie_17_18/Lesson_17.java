package dom_zadanie_17_18;

public class Lesson_17 {

    public static void main(String args[]) {

        double a = 17;
        double b = 3;

        sum(a, b);
        diff(a, b);
        mul(a, b);
        div(a, b);
    }

    static void sum(double x, double y) {

        double z = x + y;
        System.out.println(z);
    }

    static void diff(double x, double y) {

        double z = x - y;
        System.out.println(z);
    }

    static void mul(double x, double y) {

        double z = x * y;
        System.out.println(z);
    }

    static void div(double x, double y) {

        double z = x / y;
        System.out.println(z);
    }
}


