package HT7;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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

        //v2 --------------------------------
        Predicate<Person> realAdult = (x) -> x != null && x.getAge() >= 18 && x.getFirstName().replaceAll("[^a-zA-Z]", "") != "";
        Function<Person, String> getPersonName = (x) -> x.getFirstName().toUpperCase().replaceAll("[^a-zA-Z]", "");
        Set<String> names = personList.stream().filter(realAdult).map(getPersonName).collect(Collectors.toSet());
        names.remove("");
        System.out.println(names);
    }
}

