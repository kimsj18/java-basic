package day9;

public class Encapsulation {
    private String name="신애라";

    public  String getName(){
        return name;

    }
    public void setName(String newName){    //네임을 바꿀려면 셋네임을 통하여 간접적으로 변경
        name = newName;

    }

}
