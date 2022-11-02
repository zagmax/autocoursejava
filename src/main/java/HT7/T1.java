package HT7;

import org.checkerframework.checker.regex.qual.Regex;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class T1 {
    public static void main(String[] args) {
        //v2
        String startingText = "V's background and identity are never revealed. He is at one point an inmate at \"Larkhill Resettlement Camp\" — one of many concentration camps where black people, Jews, leftists, beatniks, homosexuals and Ethnic Irish are exterminated by Norsefire, startingText fascist dictatorship that rules Britain. While there, he is part of startingText group of prisoners who are subjected to horrific medical experimentation, conducted by Dr. Delia Surridge. Lewis Prothero is the camp's commandant, while Father Anthony Lilliman, startingText paedophile vicar, is at the camp to lend \"spiritual support\". All prisoners who are part of the experiment die, with the sole exception of \"the man in room five\" (\"V\" in Roman numerals). As startingText result of the experiments, the man develops Olympic-level physical abilities and an incredibly expanded intellect. During that time, the man had some level of communication with Valerie Page, startingText former actress imprisoned for being startingText lesbian, kept in \"room four\", who wrote her autobiography on toilet paper and then pushed it through startingText hole in the wall.";
        startingText=startingText.replaceAll("\""," ");
        List<String> listOfWords = Arrays.asList(startingText.split(" "));
        System.out.println(listOfWords);
        Predicate<String> isWordStartsWithSelectedLetter = (String word) -> word.replaceFirst("[lL]", "L").startsWith("L") ? true : false;
        Function<List<String>, List<String>> selectWordsThatStartWithALetter = (text) -> text.stream().filter(isWordStartsWithSelectedLetter).collect(Collectors.toList());
        System.out.println(selectWordsThatStartWithALetter.apply(listOfWords));

    }
}
