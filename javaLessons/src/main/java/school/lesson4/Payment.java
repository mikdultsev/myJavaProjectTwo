package school.lesson4;

public class Payment {
    Item [] items = new Item[3];
     int itemCount = 0;
     int sum = 0;

    public void createItems(String name, int price) {

            Item item = new Item(name, price);
            items[itemCount] = item;
            itemCount++;
        }


    public void raschetPokupok() {
        for (int j = 0; j < items.length; j++) {
            sum = sum + items[j].getPrice();
        }
        System.out.println(sum);
    }


    public class Item {

        private String name;
        private int price;

        public Item(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }
    }
   }





