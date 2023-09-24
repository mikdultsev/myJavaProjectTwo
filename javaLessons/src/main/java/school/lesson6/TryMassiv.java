package school.lesson6;

public class TryMassiv {
    public static void main(String[] args) {
        String[][] s = new String[2][2];
        s[0][0] = "1";
        s[0][1] = "2";
        s[1][0] = "1";
        s[1][1] = "2";


        try {
            vyvodMassiv(s);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException t) {
            t.printStackTrace();
        }
    }

    public static void vyvodMassiv(String[][] str) throws MyArraySizeException, MyArrayDataException {

        if (str.length != 2 || str[0].length != 2) {
            throw new MyArraySizeException("массив не подходит");

        }
        int s = 0;
        int[][] d = new int[str.length][str[0].length];
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {


                try {
                    d[i][j] = Integer.parseInt(str[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("неверное значение в ячейке  [" + i + "][" + j + "]");
                }
                s = s + d[i][j];

            }

        }
        System.out.println(s);
    }
}
