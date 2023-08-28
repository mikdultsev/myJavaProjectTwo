package school.lesson2;

public class SecondApp {

    public static void main(String[] args) {


        System.out.println(checkSum(4,5));
    }
      public static boolean checkSum(int x, int y){
        int c;
        c = x + y;
        if (c >= 10 && c <= 20) return true;
        return false;
      }


    }

