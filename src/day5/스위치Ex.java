package day5;

public class 스위치Ex {
    public static void main(String[] args) {


        char ch = 'C';

        switch (ch) {
            case 'A':
                System.out.println("매우 우수");
                break;
            case 'B':
                System.out.println("우수");
                break;
            case 'C':
                System.out.println("좋음");
                break;
            default:
                System.out.println("잘못된 등급");

        }
    }
}
