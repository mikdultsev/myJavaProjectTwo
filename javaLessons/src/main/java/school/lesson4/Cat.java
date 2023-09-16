package school.lesson4;

public class Cat extends Animal {



   public Cat() {

        this.dest = 200;
        this.line = 0;
    }

    @Override
    public void run(int d) {
        if(d <= dest) {
            System.out.println("кот пробежал" + " " + d);
        } else {
            System.out.println("кот столько не пробежит");
        }

    }

    @Override
    public void swim(int s) {
        System.out.println("кот не умеет плавать");

    }
}
