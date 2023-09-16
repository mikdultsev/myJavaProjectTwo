package school.lesson4;

public class Attrakcion {
     InfoAttrakcions [] att = new InfoAttrakcions[1];


    public static void main(String[] args) {
        Attrakcion attrakcion = new Attrakcion();
        attrakcion.createAttrakcion("колесо обозрения", 20, 8.00, 18.00);
        attrakcion.infoAttrakcion();
    }

    public void createAttrakcion(String name, int price, double beginT, double closeT) {
        InfoAttrakcions infoAttrakcions = new InfoAttrakcions(name, price, beginT, closeT);
        att[0] = infoAttrakcions;


    }
    public void infoAttrakcion(){
        System.out.println(att[0].getNameAttr() + " " + att[0].getPriceAttr() + " " + att[0].getBeginTimeAttr() +
                " " + att[0].getClosetimeAttr());
    }





    public class InfoAttrakcions {
        String nameAttr;
        int priceAttr;
        double beginTimeAttr;
        double closetimeAttr;

        public InfoAttrakcions(String nameAttr, int priceAttr, double beginTimeAttr, double closetimeAttr){
            this.nameAttr = nameAttr;
            this.priceAttr = priceAttr;
            this.beginTimeAttr = beginTimeAttr;
            this.closetimeAttr = closetimeAttr;
        }

        public String getNameAttr() {
            return nameAttr;
        }

        public int getPriceAttr() {
            return priceAttr;
        }

        public double getBeginTimeAttr() {
            return beginTimeAttr;
        }

        public double getClosetimeAttr() {
            return closetimeAttr;
        }
    }

}
