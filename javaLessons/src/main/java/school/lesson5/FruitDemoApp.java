package school.lesson5;

import java.util.ArrayList;
import java.util.List;

public class FruitDemoApp {
    public static void main(String[] args) {

        List <Fruit> apple = new ArrayList<>();
        apple.add(new Apple());
        apple.add(new Apple());
        apple.add(new Apple());
        Box appleBox = new Box(apple);
        System.out.println(appleBox.getWeight());

        List<Fruit> orange = new ArrayList<>();
        orange.add(new Orange());
        orange.add(new Orange());
        Box orangeBox = new Box(orange);
        System.out.println(orangeBox.getWeight());

        if (appleBox.compare(orangeBox)) {
            System.out.println(true);
        }
           else System.out.println(false);

       // appleBox.peresypaniye(orangeBox);


      /*  List<Float> boxWithOranges = new ArrayList<>();
        boxWithOranges.add(1.0f);
        boxWithOranges.add(2.0f);
        boxWithOranges.add(3.0f);
        boxWithOranges.add(4.0f); */

    }
}
