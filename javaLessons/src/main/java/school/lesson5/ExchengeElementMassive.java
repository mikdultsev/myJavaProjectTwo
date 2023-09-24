package school.lesson5;

import java.util.Arrays;

public class ExchengeElementMassive {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        changeElements(arr);
        System.out.println(Arrays.toString(arr));
    }


        public static void changeElements(int [] arr) {


            for (int i = 0; i < arr.length - 5; i++) {
              int a = arr [i + 1];
              arr[i + 1] = arr[i];
              arr[i] = a;
             }
        }


    }

