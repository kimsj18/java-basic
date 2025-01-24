package day13.inheritance03;

public class SmartPhone extends Phone {

    public SmartPhone(String model, String color){
        super();

        //super.model = model;
        System.out.println("스마트폰 모델과 컬러"+super.getBander() + super.getColor());
    }

}
