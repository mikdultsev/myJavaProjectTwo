package school.lesson2;

import java.util.Arrays;

public class ChangeMassiv {
    public static void main(String[] args) {

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int i = 0;
        while(i < arr.length){
            if (arr[i] > 0){
                arr[i]=0;
            }
            else {arr[i]=1;
            }
            System.out.print(arr[i] + " ");
            i++;
        }


    }
}
