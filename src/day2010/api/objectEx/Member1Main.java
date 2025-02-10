package day2010.api.objectEx;

public class Member1Main {
    public static void main(String[] args) {
        Member1 m1 = new Member1("shin",25);
        System.out.println(m1.name());
        System.out.println(m1.age());
        System.out.println(m1.toString());

        Member1 m2 = new Member1("shin",25);
        System.out.println("m1해시코드"+ m1.hashCode());
        System.out.println("m2해시코드"+ m2.hashCode());
        System.out.println("m1.equals(m2) : "+m1.equals(m2));
    }
}
