package day0203.ingeritence.sealedEx;

public sealed class Person permits Employee, Manager {

    public  String name;

    public void work(){
        System.out.println("하는 일이 결정안됨");
    }
}
