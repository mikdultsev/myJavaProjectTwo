package school.lesson2;

public class ReturnNumber {
    public static void main(String[] args) {
        System.out.println(definiteNumber(4));
    }
    public static boolean definiteNumber(int x){

        if (x >= 0) return false;
       return true;
    }
}
