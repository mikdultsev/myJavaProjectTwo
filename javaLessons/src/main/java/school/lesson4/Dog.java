package school.lesson4;

public class Dog extends Animal {
   // int dest;
    // int line;

    /* public Dog(int dest, int line){
        this.dest = dest;
        this.line = line;
    } */

    @Override
    public void run(int t) {
        if(t <= 500) {
            System.out.println("собака пробежала" + " " + t);
        } else {
            System.out.println("собака столько не пробежит");
        }


    }

    @Override
    public void swim(int l) {
        if(l <= 10) {
            System.out.println("собака проплыла" + " " + l);
        } else {
            System.out.println("собака столько не пробежит");
        }
    }
}
