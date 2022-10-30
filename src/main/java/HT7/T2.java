package HT7;

import org.apache.commons.math3.util.Precision;

import static org.apache.commons.lang3.RandomStringUtils.*;
import static org.apache.commons.lang3.RandomUtils.nextFloat;


import java.util.*;

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
/*
        //sub-task 1
        //ST11 print all books using method toString (information should be consistent, e.g. “name: Book1, price: 10”)
        System.out.println("\nST11");
        for (int i = 0; i < selectedAmount; i++) {
            System.out.println("Book: \"" + listOfBooks.get(i).getName() + "\", price: " + listOfBooks.get(i).getPrice() + "$");
        }

        //ST12 get List<String> of all book names and print them
        System.out.println("\nST12");
        List<String> listOfBookNames = new ArrayList<>();
        for (int i = 0; i < listOfBooks.size(); i++) {
            listOfBookNames.add(listOfBooks.get(i).getName());
        }
        System.out.println("List of books names: " + listOfBookNames);

        //ST13 get total price of all books and print it
        System.out.println("\nST13");
        Float sum = 0f;
        for (int i = 0; i < listOfBooks.size(); i++) {
            sum += listOfBooks.get(i).getPrice();
        }
        System.out.println("Sum of all books prices: " + roundNumber(sum));

        //ST14 get any book with “A” or “a” character in name and print its name
        System.out.println("\nST14");
        for (int i = 0; i < listOfBooks.size(); i++) {
            if (listOfBooks.get(i).getName().contains("a") || listOfBooks.get(i).getName().contains("A")) {
                System.out.println("Book that contains \"A\" or an \"a\": " + listOfBooks.get(i).getName());
                break;
            } else if (i == listOfBooks.size() - 1) {
                System.out.println("There is no book that contains \"A\" or an \"a\"");

            }
        }


        //ST15 print book name with the highest price
        System.out.println("\nST15");
        Integer expensiveBook = 0;
        for (int i = 0; i < listOfBooks.size(); i++) {
            if (listOfBooks.get(i).getPrice() > listOfBooks.get(expensiveBook).getPrice()) {
                expensiveBook = i;
            }
        }
        System.out.println("Most expensive book: " + listOfBooks.get(expensiveBook).getPrice());

        //ST16 get number of books where name consists of 5 letters
        System.out.println("\nST16");
        Integer amountOfFiveLetterNameBooks = 0;
        for (int i = 0; i < listOfBooks.size(); i++) {
            if (listOfBooks.get(i).getName().length() == 5) {
                amountOfFiveLetterNameBooks += 1;
            }
        }
        System.out.println("Amount of books with names of 5 letters: " + amountOfFiveLetterNameBooks);

        //ST17 get all books except books with price higher than 30
        System.out.println("\nST17");
        for (int i = 0; i < listOfBooks.size(); i++) {
            if (listOfBooks.get(i).getPrice() < 30) {
                System.out.println("Book: \"" + listOfBooks.get(i).getName() + "\", price: " + listOfBooks.get(i).getPrice() + "$");
            }
        }

*/
        //ST18 sort books by name in desc order, if name equals then sort by price
        System.out.println("\nST18");
        List<Book> sortedBooks = new ArrayList<>();
        sortedBooks.add(new Book("name1",1.0f));
        sortedBooks.add(new Book("name2",2.0f));
        sortedBooks.add(new Book("name3",3.0f));
        sortedBooks.add(new Book("name5",5.0f));
        sortedBooks.add(new Book("name5",4.0f));

        sortedBooks.forEach(book -> System.out.println(book.getName()+" "+book.getPrice()));

        Map<String, Float> sort = new TreeMap<>();
        for(int i=0;i<sortedBooks.size();i++){
            sort.put(sortedBooks.get(i).getName(),sortedBooks.get(i).getPrice());
        }
        System.out.println(sort);
        //sort.put(sortedBooks.forEach(book -> book.getName()),sortedBooks.forEach(book -> book.getPrice()));
        //sortedBooks.addAll(listOfBooks);
        //sortedBooks.forEach(Book -> System.out.println("Book name: \"" + Book.getName() + "\" price: " + Book.getPrice()));
        //sortedBooks.stream().sorted().forEach(Book -> System.out.println("Book name: \"" + Book.getName() + "\" price: " + Book.getPrice()));


        //Sub task 2
        Book book1 = new Book("myBook", 5f);
        Book book2 = new Book("myBook", 5f);
        Map<Book, String> mapWithBook = new HashMap<>();
        mapWithBook.put(book1,"libraryName");

    }


}



