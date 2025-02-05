package day0205.InterfaceEx01;

public class Radio implements RemoteControl{
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("라디오 켠다.");

    }

    @Override
    public void turnOff() {
        System.out.println("라디오 끈다.");

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
        System.out.println("현재 Radio 볼륨은 "+this.volume);
    }

    }


