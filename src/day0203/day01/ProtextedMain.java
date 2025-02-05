package day0203.day01;

class A{
    protected String field1;

    public A(){}
    protected  A(String field1){
        this.field1 = field1;
    }
    protected  void method1(){
        System.out.println("A클래스의 메소드1()");
    }
}

class B {
    protected String field12;

    protected B() {
    }

    protected void method1() {
        System.out.println("B클래스의 메소드1()");
        A a = new A();
        a.field1 = "value1";
        a.method1();
    }
}


//public class ProtextedMain {
//}
