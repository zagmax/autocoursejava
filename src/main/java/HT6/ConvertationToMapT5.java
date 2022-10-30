package HT6;

import java.util.*;

public class ConvertationToMapT5 {
/*
Написати метод, який приймає два масиви/списки елементів типу K, V (Generic) з різною кількість елементів і повертає сортований Map<K, V>.
Варіант 1. Якщо масив K > V - то записати в value null, якщо масив K < V - зайві value не обробляти

Варіант 2. Якщо масив K > V - перехопити помилку і вивести на екран повідомлення "Value is not enough for map",
 якщо масив K < V - перехватит помилку і вивести на екран повідомлення "Key is not enough for map"

  */

    public static Map combineToMapVarOne(List<String> a, List<String> b) {
        Map<String, String> map = new TreeMap();
        for (int i = 0; i < a.size(); i++) {
            if (i < b.size()) {

                map.put(a.get(i), b.get(i));
            } else {
                map.put(a.get(i), null);
            }
        }
        return map;
    }

    public static Map combineToMapVarTwo(List<String> a, List<String> b) {
        Map<String, String> map = new TreeMap();
        try {
            if (a.size() < b.size()) {
                throw new Exception("Key is not enough for map");
            } else if (a.size() > b.size()) {
                throw new Exception("Value is not enough for map");
            } else {
                for (int i = 0; i < a.size(); i++) {
                    map.put(a.get(i), b.get(i));
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return map;
    }

    public static void main(String[] args) {
        Map<String, String> map = new TreeMap();
        List<String> listA = new ArrayList<>();
        List<String> listB = new ArrayList<>();
        listA.add("4");
        listB.add("3");
        listB.add("4");
        listA.add("1");
        listB.add("1");
        listA.add("2");

        // доп добавление чтоб менять разницу в размере
        listA.add("3");
        //listB.add("2");
        System.out.println(listA + "\n" + listB);

        System.out.println(combineToMapVarOne(listA, listB));
        System.out.println(combineToMapVarTwo(listA, listB));


    }
}
