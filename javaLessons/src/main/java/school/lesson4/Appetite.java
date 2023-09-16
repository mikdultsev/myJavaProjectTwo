package school.lesson4;

public class Appetite {
    public static void main(String[] args) {

        Cat2 [] cats = new Cat2[5];
        cats[0] = new Cat2("Cot", 10 );
        cats[1] = new Cat2("Cotton", 20 );
        cats[2] = new Cat2("Cotofey", 9 );
        cats[3] = new Cat2("Cotik", 12 );
        cats[4] = new Cat2("Cotvsapogah", 12 );
        Plate plate = new Plate(36);
        for (Cat2 c: cats){
            c.eat(plate);
            if (c.isSatiety() == false){
             plate.addFood(16);
             c.eat(plate);
            }
            System.out.println(c.getName() +" " + "сыт?" + " " + c.isSatiety());
        }

       // Cat2 cat = new Cat2("Barsik", 15);



         //   cat.eat(plate);


       // System.out.println(cat.isSatiety());
        plate.info();

    }
}
