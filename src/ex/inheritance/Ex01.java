package ex.inheritance;

class Tv {
    boolean power;
    int channel;

    void power() { power = !power; };
    void channelUp() { channel++; };
    void channelDown() { channel--; };
}

class SmartTv extends Tv {
    boolean caption;
    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        } else {
            System.out.println("캡션이 지정되지 않았습니다.");
        }
    }
}

public class Ex01 {
    public static void main(String[] args) {
        SmartTv stv = new SmartTv();
        stv.channel = 10;
        stv.channelUp();
        System.out.println(stv.channel);
        stv.displayCaption("Caption: false.. Hello, world!");
        stv.caption = true;
        stv.displayCaption("Caption: true.. Hello, world!");
    }
}
