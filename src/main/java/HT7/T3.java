package HT7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class T3 {


    public static void main(String[] args) {

        //Print all unique names from the list for adults. Result should be in upper case and without any special character (e.g., whitespace).

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Peter", "Patterson", 21));
        personList.add(new Person("Paul", "Walker", 31));
        personList.add(new Person("Steve", "Runner", 17));
        personList.add(new Person("Arnold%", "", -1));
        personList.add(new Person(" 5%", "Stevenson", 19));
        personList.add(new Person("  6^ ", "Stevenson", 19));
        personList.add(new Person("      ", "Stevenson", 19));
        personList.add(new Person(" 7&Arnold", "Stevenson", 19));
        personList.add(null);
        personList.add(new Person("Aaron)*(_", "Bortnicker", 18));


        Set<String> names = new HashSet<>();
        for (Person person : personList) {
            if (person != null && person.getAge() >= 18) {
                names.add(person.getFirstName().toUpperCase().replaceAll("[^a-zA-Z]", ""));
            }
        }
        names.remove("");
        System.out.println(names);
    }
}

