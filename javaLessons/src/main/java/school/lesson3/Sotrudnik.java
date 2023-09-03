package school.lesson3;

public class Sotrudnik {
    private String name;
    private String email;
    private String position;
   private long phone;
   private int salary;
   private int age;

    public Sotrudnik(String name, String position, String email, long phone, int salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
       this.salary = salary;
        this.age = age;
    }
    public void vyvodSotrudnika(){
        if(age > 40) {
        System.out.println(name + " "+ position + " " + email + " " + phone + " " + salary + " " + age);
        }
    }

    public static void main(String[] args) {
        Sotrudnik[] persArray = new Sotrudnik[5];
        persArray[0] = new Sotrudnik("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", 457564455, 30000, 30);
        persArray[1] = new Sotrudnik("Ivankin Iven", "EngineerQA", "ivivan@mail564box.com", 457565655, 90000, 40);
        persArray[2] = new Sotrudnik("Ivanova Ianna", "EngineerAuto", "ivi5674@mailbox.com", 427544455, 100000, 41);
        persArray[3] = new Sotrudnik("Ivanidze Ivanovo", "EngineerRazrab", "iviv7233an@mailbox.com", 450264455, 130000, 55);
        persArray[4] = new Sotrudnik("Ivankina Ivano", "EngineerPM", "ivi678van@mailbox.com", 457564955, 150000, 42);
       // Sotrudnik pers = new Sotrudnik("Nikolay", "QA", "test@mail.ru", 5500055, 85000, 35  );
        for (int i = 0; i < persArray.length; i++ ){
            persArray[i].vyvodSotrudnika();
        }

            }


}
