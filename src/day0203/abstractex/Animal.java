package day0203.abstractex;

public abstract class Animal {
    public abstract void sound();    //추상메서드 {}바디 없음
    public void breathe(){
        System.out.println("동물은 숨쉼");
    }
}
