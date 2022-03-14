package anonymous;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class anonymous_1 {
    public static void main(String[] args) {
        // AWT (자바 윈도우 프로그램 구현 라이브러리 예시)
//        Button b = new Button();
//        b.addActionListener(new EventHandler());

        // 익명으로 작성한다면
        Button b = new Button();
        // 클래스의 정의와 객체 생성을 동시에. 1회성.
        b.addActionListener(new ActionListener() { // new 구현메서드이름() {}: 익명
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionEvent occurred!!!");
            }
        }); // anonymous_1$1.class

        b.addActionListener(new ActionListener() { // new 구현메서드이름() {}: 익명
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionEvent 발생!!!");
            }
        }); // anonymous_1$2.class
    }
}

//class EventHandler implements ActionListener {
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        System.out.println("ActionEvent occurred!!!");
//    }
//}