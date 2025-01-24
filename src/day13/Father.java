package day13;

public class Father extends GrandFather {

    String familyName = "프로그래머";
    String houseAddress = "인천";

    void printFather(){
        System.out.println("나는 아들입니다. ");
        System.out.println("나는 아버지로부터 상속받습니다.");
        System.out.println("나의 아버지는 "+ this.houseAddress);
    }
}
