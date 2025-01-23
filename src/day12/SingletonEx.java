package day12;

class Singleton{
    private static Singleton singleton = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return singleton;
    }
}

public class SingletonEx {
    public static void main(String[] args) {
    //Singleton obj1 = new Singleton(); //안됨

        //정적메소드 getInstance()를 호출해서 싱글톤 객체 얻음
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();
        
        //동일한 객체를 참조하는지 확인
        if(obj1 == obj2){
            System.out.println("객체값이 같다"+obj1.toString()+" "+obj2);
        }else {
            System.out.println("다른 객체");
        }
    }
}
