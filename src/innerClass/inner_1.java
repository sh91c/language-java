package innerClass;

class A {       // A는 B의 외부 클래스
    int i = 100;
    B b = new B();

    class B {   // B는 A의 내부 클래스
        void method() {
//            A a = new A();
//            System.out.println(a.i);
            System.out.println(i);  // 객체 생성없이 외부 클래스 A의 멤버 접근 가능
        }
    }
}

// class C {
//    B b = new B();
// }

public class inner_1 {
    public static void main(String[] args) {
//        B b = new B();
//        b.method();
    }
}
