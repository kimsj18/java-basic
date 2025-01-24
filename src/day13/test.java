package day13;

public class test {


    class SuperCat{
        String name;
        void printInfo(){
            System.out.println("부모고양이");
        }
    }

    class SubKitten extends SuperCat{
        String name;
        void printInfo(){
            System.out.println("아기 고양이");
        }
        void printDetail(){
            super.printInfo();
            printInfo();
            super.name = "SuperCat";
            name = "Subkitten";
        }
    }


}



