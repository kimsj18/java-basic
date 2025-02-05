package day0205.InterfaceEx01;

public class TV implements RemoteControl{   //추상메소드 오버라이딩 해야 사용가능
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("tv를 키다");
    }

    @Override
    public void turnOff() {     //인터페이스에서 선언된 전원 온/오프 기능 TV 스팩에 맞추어 구현
        System.out.println("tv를 끄다");

    }

    @Override
    public void setVolume(int volume) {
        if(volume > RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
            System.out.println("현재 해당 제품의 볼륨 최대값으로 세팅되어 있습니다.");
        }else if(volume < RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
            System.out.println("mute");
        }else{
            this.volume = volume;
        }
        System.out.println("현재 tv 볼륨은 "+this.volume);
    }
}
