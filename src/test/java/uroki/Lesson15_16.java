package uroki;

public class Lesson15_16 {
    public static void main(String[] args) {

//        int[] nums = new int[4];
//        // устанавливакм значения элементов массива
//        nums[0] = 1;
//        nums[1] = 2;
//        nums[2] = 4;
//        nums[3] = 100;

        // получаем значение третьего элемента массива

//        System.out.println(nums[4]);

//        int[] nums = {1,2,3,4,5,8,10};
////        int lengt = nums.length;
//        System.out.println(nums.length);// количество позиций в массиве
//
//        int last = nums[nums.length-1];
//        System.out.println(last); //последнее число в массиве

//        int[] nums = {1,2,3,4,5,8,10};
////        int lengt = nums.length;
//        System.out.println(Arrays.toString(nums)); // вывод самого массива

//        int[] nums = {1,2,3,4,5,8,10};
////        int lengt = nums.length;
//
//        int[] nums2 = nums;
//        nums2[0] = 88; // замена элемента массива
//        System.out.println(nums[0]);
//        System.out.println(nums2[0]); // выводим число из массивов (первое число)


//        int[] nums1 = new int[] { 0, 1, 2, 3, 4, 5 };
//
//        int[][] nums2 = { { 0, 1, 2 },
//                          { 3, 4, 5 } };
//        System.out.println(nums2[0][1]); // вывод из первого массива второго элемента (число минус 1)


//        int[] nums1 = new int[] { 8, 23, 70, 46, 25, 85 };
//        for (int i = 0; i < nums1.length; i++) {
//            System.out.println(nums1[i] + " ");

//            int[] array = new int[] { 1, 2, 3, 4, 5 };
//            for (int i = 0; i < array.length; i++){
//                System.out.println(array[i]);
//            }
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        // необходимо вывести сумму всех значений массива
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
    }


}





