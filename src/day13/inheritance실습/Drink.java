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

    void printData(){
        System.out.print(this.name+"   "+this.count+"    "+this.price*this.count);
    }
    void getTotalPrice(){

    }
}
