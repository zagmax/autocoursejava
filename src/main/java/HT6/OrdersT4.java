package HT6;


import java.util.*;

public class OrdersT4 {

    public static void main(String[] args) {

        List<String> orders = new LinkedList<>();
        orders.add("2.item:door.price:35,05");
        orders.add("5.item:table.price:20,99");
        orders.add("1.item:ladder.price:15,90");
        orders.add("4.item:table.price:20,99");
        orders.add("4.item:table.price:20,99");

        Set<String> set1 = new HashSet<>();
        set1.addAll(orders);
        Set<String> set2 = new TreeSet<>();
        set2.addAll(orders);
        System.out.println(set1 + "\n\n" + set2);
    }

}
