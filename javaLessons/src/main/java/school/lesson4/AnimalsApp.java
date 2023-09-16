package school.lesson4;

public class AnimalsApp {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.run(250);
        cat.swim(50);
        dog.run(540);
        dog.swim(70);
    }
}
