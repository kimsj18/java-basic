package day13.inheritance02;

public class SmartPhone extends Phone {
    //와이파이 기능 추가
    private boolean wifi;

    public SmartPhone() {
        super();    //없어도 자동으로 컴파일러가 생성해줌
                    //슈퍼는 컴파일러의 영역으로 쓰나안쓰나 똑같음
                    //쓰면 쓰는거고 안쓰면 컴파일러가 알아서 써주고

    }

    public SmartPhone(String bander, String model, String color){

        super(bander,model,color);
    }

    public void deviceInfo(){
        super.getBander();
        super.getModel();
        super.getColor();
    }
    public void setWifi(boolean wifi){
        this.wifi = wifi;
        String model = super.getModel();
        System.out.println("와이파이 상태변경");
        internet();
    }

    public void internet(){
        System.out.println("인터넷 연결");
    }
}
