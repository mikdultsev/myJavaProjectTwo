package school.lesson4;

public class Main {

    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.createItems("lemon", 12);
        payment.createItems("lemonad", 15);
        payment.createItems("lemonella", 20);
        payment.raschetPokupok();


    }

}
