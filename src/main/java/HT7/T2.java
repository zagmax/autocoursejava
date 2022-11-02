package HT7;

import org.apache.commons.math3.util.Precision;
import org.openqa.selenium.json.JsonOutput;

import static org.apache.commons.lang3.RandomStringUtils.*;
import static org.apache.commons.lang3.RandomUtils.nextFloat;


import java.util.*;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class T2 {

    public static Book createRandBook() {
        return new Book(randomAlphabetic(3, 10), roundNumber(nextFloat(1, 99)));
    }

    public static Float roundNumber(Float number) {
        return Precision.round(number, 2);
    }

    public static List createRandBookList(Integer amount) {
        List<Book> listOfBooks = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            listOfBooks.add(createRandBook());
        }
        return listOfBooks;
    }

    public static void main(String[] args) {
        Integer selectedAmount = 5;
        List<Book> listOfBooks = createRandBookList(selectedAmount);

        //sub-task 1
        //ST11 print all books using method toString (information should be consistent, e.g. “name: Book1, price: 10”)
        System.out.println("\nST11");
        /*
        for (int i = 0; i < selectedAmount; i++) {
            System.out.println("Book: \"" + listOfBooks.get(i).getName() + "\", price: " + listOfBooks.get(i).getPrice() + "$");
        }
        */

        //st11 v2?
        listOfBooks.forEach(book -> System.out.println("name: " + book.getName().concat(" price: " + book.getPrice().toString())));
        //ST12 get List<String> of all book names and print them
/*


        List<String> listOfBookNames = new ArrayList<>();
        for (int i = 0; i < listOfBooks.size(); i++) {
            listOfBookNames.add(listOfBooks.get(i).getName());
        }
        System.out.println("List of books names: " + listOfBookNames);
*/
        //st12 v2
        System.out.println("\nST12");
        System.out.println("List of books names: ");
        //форич версия
        listOfBooks.forEach(book -> System.out.println(book.getName()));
        //стрим версия
        System.out.println(listOfBooks.stream().map((book) -> book.getName()).collect(Collectors.toList()));

        //ST13 get total price of all books and print it
        System.out.println("\nST13");

/*


        for (int i = 0; i < listOfBooks.size(); i++) {
            sum += listOfBooks.get(i).getPrice();
        }
*/
        //st13 v2
        BinaryOperator<Float> summ = (sum, x) -> sum + x;
        //форич не придумал работающий
        //listOfBooks.forEach(book -> summ.apply(total,book.getPrice()));
        //Float total = 0f;
        //listOfBooks.forEach(book -> total+=book.getPrice()); // - ругает что тотал не файнал и потому низя в лямбде выражение вставлять
        //System.out.println("Sum of all books prices: " + roundNumber(total));
        //стрим
        System.out.println("Sum of all books prices: " + roundNumber(listOfBooks.stream().map(book -> book.getPrice()).reduce(0f, summ)));

        //ST14 get any book with “A” or “a” character in name and print its name
        System.out.println("\nST14");
        /*
        for (int i = 0; i < listOfBooks.size(); i++) {
            if (listOfBooks.get(i).getName().contains("a") || listOfBooks.get(i).getName().contains("A")) {
                System.out.println("Book that contains \"A\" or an \"a\": " + listOfBooks.get(i).getName());
                break;
            } else if (i == listOfBooks.size() - 1) {
                System.out.println("There is no book that contains \"A\" or an \"a\"");

            }
        }
*/
        //st14 v2
        //форич
        String selectedLetter = "a";
        listOfBooks.forEach(book -> {
            if (book.getName().contains(selectedLetter.toLowerCase()) || book.getName().contains(selectedLetter.toUpperCase())) {
                System.out.println("Book that contains " + selectedLetter.toUpperCase() + " or an " + selectedLetter.toLowerCase() + " : " + book.getName());
            }
        });


        //ST15 print book name with the highest price
        System.out.println("\nST15");
/*
        Integer expensiveBook = 0;
        for (int i = 0; i < listOfBooks.size(); i++) {
            if (listOfBooks.get(i).getPrice() > listOfBooks.get(expensiveBook).getPrice()) {
                expensiveBook = i;
            }
        }
        //System.out.println("Most expensive book: " + listOfBooks.get(expensiveBook).getPrice());
  */
        //st15 v2
        BinaryOperator<Float> exp = (big, curr) -> {
            if (big > curr) return big;
            else return curr;
        };
        Float bigs = listOfBooks.stream().map(book -> book.getPrice()).reduce(0f, exp);
        Map<Float, String> tempMap = new HashMap<>();
        listOfBooks.forEach(book -> tempMap.put(book.getPrice(), book.getName()));
        System.out.println("name: " + tempMap.get(bigs) + " price: " + bigs);


        //ST16 get number of books where name consists of 5 letters
        System.out.println("\nST16");
        /*
        Integer amountOfFiveLetterNameBooks = 0;
        for (int i = 0; i < listOfBooks.size(); i++) {
            if (listOfBooks.get(i).getName().length() == 5) {
                amountOfFiveLetterNameBooks += 1;
            }
        }

         */
        //System.out.println("Amount of books with names of 5 letters: " + amountOfFiveLetterNameBooks);

        //st16 v2
        Integer number = 5;
        Predicate<String> consistOfNumberLetters = x -> x.length()==number;
        System.out.println("Amount of books with names of "+number+" letters: "+listOfBooks.stream().map(book -> book.getName()).filter(consistOfNumberLetters).count());


        //ST17 get all books except books with price higher than 30
        System.out.println("\nST17");
        /*
        Integer cheapBooks = 0;
        for (int i = 0; i < listOfBooks.size(); i++) {
            if (listOfBooks.get(i).getPrice() < 30) {
                cheapBooks += 1;
                System.out.println("Book: \"" + listOfBooks.get(i).getName() + "\", price: " + listOfBooks.get(i).getPrice() + "$");
            }
        }
        if (cheapBooks == 0) {
            System.out.println("There is no book with price less than 30");
        }
         */

        //st17 v2
        Predicate<Book> isCheaperThan30 = x -> x.getPrice()<30;
        List<Book> cheapBooks =listOfBooks.stream().filter(isCheaperThan30).collect(Collectors.toList());
        cheapBooks.forEach(book -> System.out.println("Book: \"" + book.getName() + "\", price: " + book.getPrice() + "$"));
        //System.out.println();


        //ST18 sort books by name in desc order, if name equals then sort by price
        System.out.println("\nST18 - Sorted list\n");
        listOfBooks.sort((o1, o2) -> -o1.compareTo(o2));
        listOfBooks.forEach(book -> System.out.println("Book: \"" + book.getName() + "\", price: " + book.getPrice()));

        //Sub task 2
        Book book1 = new Book("myBook", 5f);
        Book book2 = new Book("myBook", 5f);
        Map<Book, String> mapWithBook = new HashMap<>();
        mapWithBook.put(book1, "libraryName");
        System.out.println("\nSub task 2 - " + mapWithBook.get(book2));
    }


}



