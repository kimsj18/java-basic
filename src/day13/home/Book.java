package day13.home;

public class Book {
    private String title;
    private int price;

    public Book(){}
    public Book(String a,int b){
        this.title = a;
        this.price = b;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}


