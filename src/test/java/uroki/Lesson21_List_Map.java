package uroki;

import java.util.ArrayList;

public class Lesson21_List_Map {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        System.out.println(cars.get(0));

        cars.set(0, "Opel");

//        cars.remove(0);

//        cars.clear();
        System.out.println(cars);

        cars.size();
        System.out.println(cars.size()); // Выводит количество злементов
//
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);
        System.out.println(myNumbers);
    }
}






