package HT6;

import java.util.*;


public class DictionaryT1 {

    public static Map countLetters(String a) {
        Map<Character, Integer> book = new HashMap<>();
        char[] chars = a.toCharArray();
        Character[] charObjs = new Character[a.length()];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] > 64 && chars[i] < 91 || chars[i] > 96 && chars[i] < 123) {
                charObjs[i] = chars[i];
            }
        }

        List<Character> characters = Arrays.asList(charObjs);
        Set<Character> set = new HashSet<>();
        set.addAll(characters);
        set.remove(null);
        for (Character ch : set) {
            book.put(ch, 0);
        }

        for (int i = 0; i < chars.length; i++) {
            if (book.containsKey(chars[i])) {
                book.put(chars[i], (book.get(chars[i]) + 1));
            }
        }

        return book;
    }

    public static void main(String[] args) {
        //String a = "abcasa ыыЫ  s  @#$^&%^*(][]{}   =_wwwdsdwcggggggc";
        String a = "Random sentence with words";
        //String a = "asd_";
        System.out.println("В следующей строке\n" + a + "\nесть следующие eng буквы в соответственном количестве:\n" + countLetters(a));
    }
}
