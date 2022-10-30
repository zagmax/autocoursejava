package HT6;


import java.util.*;

public class CollectionT2 {
    public static Set uniqCollection(List<String> a) {
        Set<String> b = new HashSet<>();
        b.addAll(a);
        return b;
    }

    public static void main(String[] args) {
        List<String> strList = new ArrayList<>() {
            {
                add("first");
                add("first");
                add("second");
                add("second");
                add("2");
                add("2");
                add("3");
            }
        };

        System.out.println(CollectionT2.uniqCollection(strList));
    }


}
