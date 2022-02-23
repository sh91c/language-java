package studyInterface;

// 강한 결합시 (A 클래스가 B에 의존시)
//class A {
//    public void method(C b) {
//        // B 클래스를 사용하지 않게 되어 C 클래스로 변경이 필요할 때
//        // 의존성 때문에 method() 메서드의 매개변수의 참조타입 B 를 C 로 변경해야한다.
//        b.method();
//    }
//}
//
//class B {
//    public void method() {
//        System.out.println("B 클래스의 메서드");
//    }
//}
//
//class C {
//    public void method() {
//        System.out.println("C 클래스의 메서드");
//    }
//}

// 느슨한 결합
interface I {
    void method();
}

class A {
    public void method(I i){ // I i 의미: 인터페이스 I를 구현한 클래스의 인스턴스만 매개변수로 사
        i.method();
    }
}

class B implements I {
    public void method(){
        System.out.println("B 클래스의 메서드");
    }
}

class C implements I {
    public void method(){
        System.out.println("C 클래스의 메서드");
    }
}

public class interface_3 {
    public static void main(String[] args) {
        // A와 B 또는 C가 의존 관계일 때.
//        A a = new A();
////        a.method(new B()); // "B 클래스의 메서드", 매개변수가 C 클래스 인스턴스로 바뀐다면 에러 발생 에상.
//        // B 클래스를 사용하지 않게 되어 C 클래스의 인스턴스를 매개변수로 전달할 때
//        // a.method(new C())를 하게된다면 C 클래스와 의존 관계가 만들어진다..
//        a.method(new C());
        // ----------------------------------------------------------------
        // 의존 관계가 아니게 되었을 때 == 느슨한 결합일 때 == 인터페이스를 사용했을 때.
        A a = new A();
        a.method(new B());  // 다형적 매개변수
        a.method(new C());  // 다형적 매개변수 갸꿀
    }
}
