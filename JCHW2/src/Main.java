public class Main {

    public static void main(String[] args) {
        System.out.println(countEvens(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
        System.out.println(findDifMaxMin(new int[]{2, 6, 1, 12, 5, 3}));
        System.out.println(checkForNeighboringZeroes(new int[]{1, 2, 3, 0, 5, 6, 7, 8, 23, 0}));
    }

    // Написать метод, возвращающий количество чётных элементов массива.
    public static int countEvens(int[] array) {
        if (array.length == 0) {
            throw new RuntimeException("Array is empty");
        }
        int counter = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }
    // Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами
    // переданного не пустого массива.

    public static int findDifMaxMin(int[] array) {
        if (array.length == 0) {
            throw new RuntimeException("Array is empty");
        }
        int max = array[0];
        int min = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    //Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.

    public static boolean checkForNeighboringZeroes(int[] array) {
        if (array.length == 0) {
            throw new RuntimeException("Array is empty");
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 0 && array[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }
}