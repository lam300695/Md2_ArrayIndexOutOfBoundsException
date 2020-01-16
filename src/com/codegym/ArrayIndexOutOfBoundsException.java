package com.codegym;

import java.util.Random;

public class ArrayIndexOutOfBoundsException {
    public Integer[] List() {
        Random random = new Random();
        Integer[] list = new Integer[10];
        System.out.println("Danh sách phần tử của mảng: " );
        for (int i = 0; i < 10; i++) {
            list[i] = random.nextInt(100);
            System.out.println(list[i] + " ");
        }
        return list;
    }

    public void Sort(Integer[] list) {
        int temp = list[0];
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[i]) {
                    temp = list[j];
                    list[j] = list[i];
                    list[i] = temp;
                }
            }
        }
    }

    public int Find(Integer[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (key > list[mid]) {
                low = mid + 1;
            } else if (key == list[mid]) {
                return mid;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}