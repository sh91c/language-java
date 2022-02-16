package ex.inheritance;

public class Modifier {
    // 제어자 (modifier)
    // 클래스와 클래스의 멤버(멤버 변수 및 멤버 메서드)에 부가적인 의미 부여
    // 접근 제어자: public, protected, (default), private
    // 그 외 제어자: static, final, abstract, native, transient, synchronized, volatile, strictfp

    // 하나의 대상에 여러 제어자를 같이 사용가능 (접근 제어자는 4개 중 하나만
    public static final int WIDTH = 200;

    public static void main(String[] args) {
        System.out.println("WIDTH = " + WIDTH);
    }
}

// static: 클래스의, 공통적인
// 멤버 변수 : 모든 인스턴스에 공통적으로 사용되는 클래스 변수가 됨.
//           클래스 변수는 인스턴스를 생성하지 않고도 사용 가능함.
//           클래스가 메모리에 로드될 때 생성된다.
// 메서드 : 인스턴스를 생성하지 않고도 호출이 가능한 static 메서드가 된다.
//         static 메서드 내에서는 인스턴스 멤버들을 직접 사용할 수 없다.
class StaticTest {
    // '간단: 명시적 초기화' 수행
    static int width = 120;
    static int height = 120;

    static { // 클래스 변수 초기화 블럭
        // static 변수의 '복잡한 초기화' 수행
    }

    static int max(int a, int b) { // 클래스 메서드(static 메서드)
        // iv 사용할 수 없음, instance 메서드 사용할 수 없음
        return a > b ? a : b;
    }
}

/*
    final: 마지막의, 변경될 수 없는
        클래스: 변경될 수 없는 클래스, 확장될 수 없는 클래스가 된다.
        메서드: 변경될 수 없는 메서드, final 로 지정된 메서드는 오버라이딩을 통해 재정의 될 수 없다.
        멤버 변수 & 지역 변수: 변수 앞에 final 이 붙으면, 값을 변경할 수 없는 상수가 된다.
*/
final class FinalTest {     // 조상이 될 수 없는 클래스
    final int MAX_SIZE = 10;    // 값을 변경할 수 없는 멤버 변수(상수)

    final int getMaxSize() {    // 오버라이딩할 수 없는 메서드(변경 불가)
        final int LV = MAX_SIZE;    // 값을 변경할 수 없는 지역 변수(상수)
        return MAX_SIZE;
    }
}

/*
    abstract - 추상의, 미완성의
        클래스: 클래스 내에 추상 메서드가 선언되어 있음을 의미한다.
        메서드: 선언부만 작성하고 구현부는 작성하지 않은 추상 메서드임을 알린다.
*/
abstract class AbstractTest {   // 추상 클래스(추상 메서드를 포함한 클래스)
    abstract void move();   // 추상 메서드(구현부{}가 없는 메서드),
}
// 미완성의 클래스이므로 AbstractTest ab = new AbstractTest(); 는 에러 발생.
// 추상 클래스의 인스턴스는 생성이 불가능함.
// 추상 클래스를 상속받아서 완전한 클래스(구상 클래스)를 만든후에 객체 생성이 가능해진다.
// 추상 <-> 구상