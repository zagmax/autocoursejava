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
        System.out.println(listOfBooks.stream().map(book -> book.toString()).collect(Collectors.joining("\n")));

        //ST12 get List<String> of all book names and print them
        System.out.println("\nST12"); //+
        System.out.println(listOfBooks.stream().map(book -> book.getName()).collect(Collectors.toList()));

        //ST13 get total price of all books and print it
        System.out.println("\nST13"); //+
        BinaryOperator<Float> summ = (sum, x) -> sum + x;
        System.out.println("Sum of all books prices: " + roundNumber(listOfBooks.stream().map(book -> book.getPrice()).reduce(0f, summ)));

        //ST14 get any book with “A” or “a” character in name and print its name
        System.out.println("\nST14");
        String selectedLetter = "a";
        System.out.println("Books that contains " + selectedLetter.toUpperCase() + " or an " + selectedLetter.toLowerCase() + " : \n" +
                listOfBooks.stream().map(book -> book.getName()).filter(book -> book.toLowerCase().contains(selectedLetter)).collect(Collectors.toList()));

        //ST15 print book name with the highest price
        System.out.println("\nST15");
        System.out.println(listOfBooks.stream().max(Comparator.comparing(Book::getPrice)).get());

        //ST16 get number of books where name consists of 5 letters
        System.out.println("\nST16"); //+
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
        System.out.println(
                "Amount of books with names of " + number + " letters: " +
                        listOfBooks.stream().map(book -> book.getName()).filter(name -> name.length() == number).count());

        //ST17 get all books except books with price higher than 30
        System.out.println("\nST17"); //+
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
        List<Book> cheapBooks = listOfBooks.stream().filter(x -> x.getPrice() < 30).collect(Collectors.toList());
        System.out.println(cheapBooks);
        //System.out.println();

        //ST18 sort books by name in desc order, if name equals then sort by price
        System.out.println("\nST18 - Sorted list\n"); //+
        listOfBooks.sort((o1, o2) -> -o1.compareTo(o2));
        //st18 v2? хз куда этот ту стринг тыкать, раз оно в принте и так есть
        System.out.println(listOfBooks);

        //Sub task 2 +
        Book book1 = new Book("myBook", 5f);
        Book book2 = new Book("myBook", 5f);
        Map<Book, String> mapWithBook = new HashMap<>();
        mapWithBook.put(book1, "libraryName");
        System.out.println("\nSub task 2 - " + mapWithBook.get(book2));
    }


}



