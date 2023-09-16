package school.lesson4;

public class Plate {
    private int food;
    private int dobavka;
    public Plate(int food) {
        this.food = food;
        //this.dobavka = dobavka;
    }
    public void decreaseFood(int n) {
        food -= n;
    }

    public int getFood() {
        return food;
    }
    public int getDobavka(){
        return dobavka;
    }
    public void addFood (int f) {
    food += f;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

}
