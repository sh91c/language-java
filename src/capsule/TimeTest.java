package capsule;

/*
    캡슐화와 접근 제어자
    접근 제어자를 사용하는 이유:
        1. 외부로부터 데이터를 보호하기 위해서
        2. 외부에는 불필요한, 내무적으로만 사용되는 값이나 로직을 감추기 위해서
 */

class Time {
    private int hour;   // 0 ~ 23 사이의 값을 가져야함.
    private int minute; // 0 ~ 59
    private int second; // 0 ~ 59
    // -> 직접적으로 인스턴스 변수에 접근하지 못하도록 private 할당

    // 같은 클래스내에서 메서드를 통해 간접적으로 인스턴스 멤버 변수에 값을 할당하거나, 불러올 수 있도록..
    public void setHour(int hour) {
        if (isNotValidHour(hour)) {
            System.out.println("시간 범위를 벗어났습니다.");
            return;
        }
        this.hour = hour;
    }

    // 매개변수로 넘겨진 hour 가 유효한지 확인해서 boolean 값을 반환하는 메서드
    private boolean isNotValidHour(int hour) {
        return hour < 0 || hour > 23;
    }

    public int getHour() {
        return this.hour;
    }
}

public class TimeTest {
    public static void main(String[] args) {
//        Time t = new Time();
//        t.hour = 25;    // 원하는 값이 아님
//        System.out.println(t.hour);

        /* getter setter 이후 */
        Time t = new Time();
        System.out.println("setHour(222)");
        t.setHour(222);
        System.out.println(t.getHour());

        System.out.println("setHour(22)");
        t.setHour(22);
        System.out.println(t.getHour());

        System.out.println("setHour(100)");
        t.setHour(100);
        System.out.println(t.getHour());
    }
}
