package school.lesson2;

public class PosOrNegNumber {
    public static void main(String[] args) {
        positiveOrNegativeNumber(4);
    }
    public static void positiveOrNegativeNumber(int x){
        if(x >= 0){
            System.out.println("Положительное");
        }
        else
            System.out.println("Отрицательное");
    }
}
