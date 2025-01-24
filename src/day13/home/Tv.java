package day13.home;

public class Tv {
    String color;
    boolean power;
    int channel;


       public Tv() {
        color = "black";
        power = false;
        channel = 0;
    }

    public void color(String a){
        color = "black";
    }
    public void power() {
        if (power == false) {
            power = true;
        } else {
            power = false;
        }
    }
    public void channelUp(){
        channel ++;
    }
    public void channelDown(){
        channel --;
    }
    public void print(){
        System.out.println("color : "+color+" power : "+power+" channel :"+channel);
    }
}
