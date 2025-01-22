package day9;

 class ParentCat {
//    public String breed = "샴 고양이";
//    void methodParentCat(){
//        System.out.println("어미 고양이 냐옹");
        private String breed = "샴 고양이";
        void methodParentCat(){
         System.out.println("어미 고양이 냐옹");
    }

}

 class kitten extends ParentCat{
    void methodKitten(){
        System.out.println("아기고양이 야옹");
    }

}

