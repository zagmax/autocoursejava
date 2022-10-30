package HT7;

public class Book {
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
}
