package innerClass;

class Outer {
    class InstanceInner {
        int iv = 100;
    }

    static class StaticInner { // 외부 객체 Outer의 객체를 생성하지 않고
        int iv = 200;          // StaticInner클래스의 객체 생성 가능
        static int cv = 300;   // static class 기 때문.
    }

    void method() {
        // 메서드 내 클래스의 경우
        class LocalInner {
            int iv = 400;
        }
        // 메서드 내에서 객체 생성을 해서 사용
        LocalInner li = new LocalInner();
        System.out.println("메서드 내 클래스(지역 중첩 클래스) li.iv: " + li.iv);
    }
}

public class inner_1 {
    public static void main(String[] args) {
        Outer oc = new Outer(); // 외부 클래스의 인스턴스를 먼저 생성해야
                                // 인스턴스 클래스 내부의 클래스를 가지고
        Outer.InstanceInner oii = oc.new InstanceInner(); // 인스턴스를
                                // 생성할 수 있다.

        System.out.println("oii.iv: " + oii.iv);
        System.out.println("Outer.StaticInner.cv: " + Outer.StaticInner.cv);

        // '스태틱 내부 클래스'의 인스턴스는 '외부 클래스'를 먼저 생성하지 않아도 된다.
        Outer.StaticInner osi = new Outer.StaticInner();
        System.out.println("osi.iv: " + osi.iv);

        // 지역 중첩 클래스
        oc.method();
    }
}
