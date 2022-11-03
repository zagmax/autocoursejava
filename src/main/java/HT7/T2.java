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
        //st11 v2
        System.out.println(listOfBooks.stream().map(book -> book.toString()).collect(Collectors.joining("\n")));

        //ST12 get List<String> of all book names and print them
        //st12 v2
        System.out.println("\nST12");
        System.out.println("List of books names: ");
        //стрим версия
        System.out.println(listOfBooks.stream().map((book) -> book.getName()).collect(Collectors.toList()));

        //ST13 get total price of all books and print it
        System.out.println("\nST13");
        //st13 v2
        BinaryOperator<Float> summ = (sum, x) -> sum + x;
        System.out.println("Sum of all books prices: " + roundNumber(listOfBooks.stream().map(book -> book.getPrice()).reduce(0f, summ)));

        //ST14 get any book with “A” or “a” character in name and print its name
        System.out.println("\nST14");
        //st14 v2 foreach
        String selectedLetter = "a";
        /*
        listOfBooks.forEach(book -> {
            if (book.getName().contains(selectedLetter.toLowerCase()) || book.getName().contains(selectedLetter.toUpperCase())) {
                System.out.println("Book that contains " + selectedLetter.toUpperCase() + " or an " + selectedLetter.toLowerCase() + " : " + book.getName());
            }
        });
         */
        //st14 v2 stream
        System.out.println("Books that contains " + selectedLetter.toUpperCase() + " or an " + selectedLetter.toLowerCase() + " : \n" +
                listOfBooks.stream().map(book -> book.getName()).filter(book -> book.toLowerCase().contains(selectedLetter)).collect(Collectors.toList()));


        //ST15 print book name with the highest price
        System.out.println("\nST15");
        //st15 v1
        /*
        BinaryOperator<Float> exp = (big, curr) -> {
            if (big > curr) return big;
            else return curr;
        };
        Float bigs = listOfBooks.stream().map(book -> book.getPrice()).reduce(0f, exp);
        Map<Float, String> tempMap = new HashMap<>();
        listOfBooks.forEach(book -> tempMap.put(book.getPrice(), book.getName()));
        System.out.println("name: " + tempMap.get(bigs) + " price: " + bigs);
        */
        //st15 v2
        System.out.println("name: " + listOfBooks.stream().max(Comparator.comparing(Book::getPrice)).get().getName());


        //ST16 get number of books where name consists of 5 letters
        System.out.println("\nST16");
        //st16 v2
        Integer number = 5;
        Predicate<String> consistOfNumberLetters = x -> x.length() == number;
        System.out.println("Amount of books with names of " + number + " letters: " + listOfBooks.stream().map(book -> book.getName()).filter(consistOfNumberLetters).count());

        //ST17 get all books except books with price higher than 30
        System.out.println("\nST17");
        //st17 v2
        Predicate<Book> isCheaperThan30 = x -> x.getPrice() < 30;
        List<Book> cheapBooks = listOfBooks.stream().filter(isCheaperThan30).collect(Collectors.toList());
        cheapBooks.forEach(book -> System.out.println("Book: \"" + book.getName() + "\", price: " + book.getPrice() + "$"));

        //ST18 sort books by name in desc order, if name equals then sort by price
        System.out.println("\nST18 - Sorted list\n");
        listOfBooks.sort((o1, o2) -> -o1.compareTo(o2));
        //st18 v2
        listOfBooks.forEach(book -> System.out.println("book: " + book.getName().concat(" price: " + book.getPrice())));

        //Sub task 2
        Book book1 = new Book("myBook", 5f);
        Book book2 = new Book("myBook", 5f);
        Map<Book, String> mapWithBook = new HashMap<>();
        mapWithBook.put(book1, "libraryName");
        System.out.println("\nSub task 2 - " + mapWithBook.get(book2));
    }


}



