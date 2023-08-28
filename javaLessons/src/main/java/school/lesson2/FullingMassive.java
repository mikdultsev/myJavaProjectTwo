package school.lesson2;

public class FullingMassive {
    public static void main(String[] args) {
        int [] array = new int[100];

        for ( int i = 0; i < array.length; i++){
           array[i] = i + 1;
            System.out.print(array[i] + " ");
        }
    }
}
