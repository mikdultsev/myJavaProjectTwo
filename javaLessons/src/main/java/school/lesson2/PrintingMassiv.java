package school.lesson2;

import java.util.Arrays;

public class PrintingMassiv {
    public static void main(String[] args) {

      int [] num = returnMassiv(5, 3);
        System.out.println(Arrays.toString(num));

    }
    public static int [] returnMassiv(int len, int initialValue){
        int [] arr = new int [len];
        for (int i = 0; i < len; i++){
            arr[i] = initialValue;

        }

        return arr;
    }
}
