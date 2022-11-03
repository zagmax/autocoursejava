package HT7;

import java.util.Objects;

public class Book implements   Comparable  {
    private String name;
    private Float price;

    public Book(String name, Float price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Float getPrice() {
        return price;
    }

    @Override
    public int compareTo(Object o) {
        Book o1 = (Book)o;
        if(this.name.compareTo(o1.getName())==0){
            return this.price.compareTo(o1.getPrice());
        }
        else return this.name.compareTo(o1.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name) && Objects.equals(price, book.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Book: \"" + this.getName() + "\", price: " + this.getPrice() + "$";
    }
}
