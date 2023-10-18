package school.lesson8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneSpravka {

    Map<String, List<String>> phonedata = new HashMap<>();

    public void add(String surname, String phonenumber) {
        List<String> numbers = phonedata.getOrDefault(surname, new ArrayList<>());
        numbers.add(phonenumber);
        phonedata.put(surname, numbers);
    }

    public List<String> get(String surname) {
        return phonedata.getOrDefault(surname, new ArrayList<>());  //
    }

    public static void main(String[] args) {

        PhoneSpravka phoneSpravka = new PhoneSpravka();
        phoneSpravka.add("Strelcov","5657383");
        phoneSpravka.add("Udalcov", "3748490");
        phoneSpravka.add("Strelcov","7657293");


     List<String> num = phoneSpravka.get("Udalcov");
             System.out.println(num);

    }
}
