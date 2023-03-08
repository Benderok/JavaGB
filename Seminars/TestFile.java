package Seminars;
import java.util.Scanner;
import java.util.Arrays;

public class TestFile {
    public static void mainNew(String[] args) {
        int[] arr1 = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 1){
                arr1[i] = 0;
            }else{
                arr1[i] = 1;
            }
     }
     System.out.println(Arrays.toString(arr1));
    }
}
