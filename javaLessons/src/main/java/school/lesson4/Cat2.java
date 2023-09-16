package school.lesson4;

public class Cat2 {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat2(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
       // this.satiety = satiety;

    }


    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void eat(Plate p) {
        if (appetite <= p.getFood()) {
            p.decreaseFood(appetite);
            satiety = true;
            System.out.println(name + " " + "поел" );

        }

        else {

           System.out.println(name + " " + "не может поесть");

        }

    }

   public boolean isSatiety() {
       return satiety;
    }
}


