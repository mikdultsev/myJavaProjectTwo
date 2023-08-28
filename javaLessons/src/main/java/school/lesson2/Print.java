package school.lesson2;

public class Print {
    public static void main(String[] args) {

         printWords("Авто",7);
    }

    public static void printWords(String x, int y){
        for(int i = 0; i < y; i++){
            System.out.println(x);
        }
    }

}
