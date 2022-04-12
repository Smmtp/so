package com.company;

import java.util.Arrays;

public class SortArray {
    public static void rightSort() {
        char[] array = {'b', 'f', 'a', 'w', 'r', 'u'};
        for (int left = 0; left < array.length; left++) {
            char value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
        System.out.println(Arrays.toString(array));

    }

    public static void reversSort() {
        char[] array = {'b', 'f', 'a', 'w', 'r', 'u'};
        for (int left = 0; left < array.length; left++) {
            char value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value > array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
        System.out.println(Arrays.toString(array));

    }
}
