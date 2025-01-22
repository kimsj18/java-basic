package day10;

import day10.dto.Person;

public class PersonMain {
    public static void main(String[] args) {
        Person 김라떼 = new Person();
        //김라떼.name = "김라떼";
        //김라떼.setName("김라떼");
        //김라떼.age(9);
        //김라떼.setPhone("010-5555-4444");
        //생성자 오버로딩을 통해 객체를 생성 후 멤버변수에 값을 할당할 수 있다.
        Person 박동동 = new Person("박동동",1,"010-4444-5555");

        System.out.println(박동동.getName()+" " + 박동동.eat());
        김라떼.play();

        //자신 이름의 객체 생성, 생성자 오버로딩한 생성자 이용. //Person 클래스의 age. phone private로 변경
        //김성준 운동한다.
        //김성준 점심시간에 우동을 먹다.
        //김성준 점심시간에 걷다.
        Person 김성준 = new Person("김성준",34,"010-3333-1111");
        System.out.println(김성준.getName()+" "+김성준.play());
        System.out.println(김성준.getName()+" 점심시간에 우동을"+김성준.eat());
        System.out.println(김성준.getName()+" 점심시간에 "+김성준.walt());

    }
}
