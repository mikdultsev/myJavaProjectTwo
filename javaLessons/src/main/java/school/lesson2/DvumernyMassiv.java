package school.lesson2;

public class DvumernyMassiv {
    public static void main(String[] args) {

        int counter = 1;
        int[][] table = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                table[i][j] = counter;
                if (i == j){
                    table[i][j] = 1;
                }
                System.out.print(table[i][j] + " ");
                counter++;
            }
            System.out.println();
        }

    }

}
