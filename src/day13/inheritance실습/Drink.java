package day13.inheritance실습;

public class Drink {
    String name;
    int price;
    int count;

    public Drink(){}
    public Drink(String a, int b, int c){
        this.name = a;
        this.price = b;
        this.count = c;

    }
    static void printTitle(){
        System.out.println("상품명    단가    수량    금액");
    }

    void printData(String a,int b, int c){
        System.out.printf(this.name+"   "+this.count+"    "+this.price);
    }
    void getTotalPrice(){

    }
}
