package ru.geekbrains.homeworks;

import java.lang.reflect.Array;
import java.net.PortUnreachableException;
import java.util.Arrays;

public class Lesson3 {

    public static void main(String[] args) {
        invertArray();
        System.out.println();
        fillArray();
        System.out.println();
        changeArray();
        System.out.println();
        fillDiagonal();
        System.out.println();
        returnArray(5, 12);
        System.out.println(Arrays.toString(returnArray_2(3, 1)));
        System.out.println();
        findMinAndMax();
        System.out.println();
        booleanSum();
    }

    public static void invertArray() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else if (array[i] == 0) {
                array[i] = 1;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void fillArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void changeArray() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6)
                array[i] *= 2;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void fillDiagonal() {
        int[][] array = new int[7][7];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = 1;
                } else if (j == (array[i].length - 1) - i) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
            }
            System.out.println(Arrays.toString(array[i]));
        }

    }

    public static int[] returnArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static int[] returnArray_2(int len, int initialValue) {
        int[] array = new int[len];
        Arrays.fill(array, initialValue);

        return array;
    }

    public static void findMinAndMax() {
        int[] array = {1, 2, 3, 4, 20, 6, -5, 8, 9};
        int maxValue = findMax(array);
        System.out.println("Max value: " + maxValue);
        int minValue = findMin(array);
        System.out.println("Min Value: " + minValue);
    }

    public static int findMin(int[] array) {
        int result = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < result) {
                result = array[i];
            }
        }
        return result;
    }

    public static int findMax(int[] array) {
        int result = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > result) {
                result = array[i];
            }
        }
        return result;
    }

    public static void booleanSum() {
        int[] array = {2, 1, 1, 2};

        System.out.println(findSum(array));
    }

    public static boolean findSum(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int leftSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += array[j];
            }
            int rightSum = 0;
            for (int k = i; k < array.length; k++) {
                rightSum += array[k];
            }
            if (rightSum == leftSum) {
                return true;
            }
        }
        return false;
    }
}