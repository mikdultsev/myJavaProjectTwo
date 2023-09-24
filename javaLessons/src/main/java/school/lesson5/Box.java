package school.lesson5;

import java.util.ArrayList;
import java.util.List;

public class Box  <T extends Fruit> {

    List<T> list;

    public Box(List<T> lists) {
        this.list = lists;
    }

   /* public void addFruits(T fruit){
        list.add(fruit);
    } */

  public void addFruit (T fruit){
      list.add(fruit);
  }

 /* public void peresypaniye(Box boxWithFruit) {
       this.list.add(boxWithFruit);
  }
 */



    public float getWeight() {

        float f = 0.0f;
        for (int i = 0; i < list.size(); i++) {
            f = f + list.get(i).getWeightFruit();
        }
            return f;
    }

    public boolean compare(Box<?> another){
        return Math.abs(this.getWeight() - another.getWeight()) < 0.0001;
    }


}
