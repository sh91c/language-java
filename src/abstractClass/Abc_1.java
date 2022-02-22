package abstractClass;

abstract class Player {
    abstract void play(int pos);
    abstract void stop();
}

abstract class AbcAudioPlayer extends Player {
    void play(int pos) {
        System.out.println(pos + " 위치 부터 플레이합니다.");
    }

    // stop() 추상 메서드를 구현하지 않았기 때문에 해당 클래스는 추상 클래스이다.
}

class AudioPlayer extends Player {
    void play(int pos) {
        System.out.println(pos + " 위치 부터 플레이합니다.");
    }
    void stop() {
        System.out.println("정지되었습니다.");
    }
}

public class Abc_1 {
    public static void main(String[] args) {
//        AudioPlayer ap = new AudioPlayer();
        Player ap = new AudioPlayer();  // 다형성
        ap.play(100);
        ap.stop();
    }
}
