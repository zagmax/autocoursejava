package HT6;

import java.util.*;


public class MapKeysT3 {


    public static Map<String, List<String>> valuesKeysSwitch(Map<String, String> startMap) {

        ArrayList<String> tempArray = new ArrayList<>();
        Map<String, List<String>> resultMap = new HashMap<>();
        Set<Map.Entry<String, String>> entries = startMap.entrySet();
        for (Map.Entry<String, String> i : entries) {
            tempArray.clear();
            if (!resultMap.containsKey(i.getValue())) {
                for (Map.Entry<String, String> j : entries) {
                    if (i.getValue().equals(j.getValue())) {
                        tempArray.add(j.getKey());
                    }
                }
                resultMap.put(i.getValue(), (ArrayList<String>) tempArray.clone());
            }
        }
        return resultMap;
    }


    public static void main(String[] args) {
        Map<String, String> startMap = new HashMap<>() {
            {
                put("1", "first");
                put("2", "first");
                put("3", "45");
                put("4", "45");
                put("5", "55");
                put("6", "6");
                put("7", "word");
            }
        };

        System.out.println(startMap + "\n");
        System.out.println(valuesKeysSwitch(startMap));
    }

}
