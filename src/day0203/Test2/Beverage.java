package day0203.Test2;

public abstract class Beverage {
    private String name;
    protected int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void Beverage(String name){
        this.name = name;
    }

    public abstract void calcPrice();



    public void print(){}



}
