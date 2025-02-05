package day0203.ingeritence.sealedEx;

public class Student extends Manager{
//    봉인된 person 클래스의 permits가 되지 않았으므로 상속 불가, Person 자식 클래스인 Employee도 해제가 되지 않았고 final클래스이므로 상속 불가
    //봉인 해제된 Manager 클래스는 상속 가능


    @Override
    public void work() {
        System.out.println("공부를 열심히 합니다.");
    }
}
