package Algoritms.HomeWork.HW2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {8,3,9,4,0,1,2};
        HeapSort.sort(array); // Используем статический способ доступа
        System.out.println(Arrays.toString(array));
     }
  }
