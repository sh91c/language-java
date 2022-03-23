package innerClass;

/*

class A {
    int i = 100;
    B b = new B();
}

class B {
    void method() {
        A a = new A();
        System.out.println(a.i);
    }
}

class C {
    B b = new B();
}
 */

class A {  // A 클래스는 B의 외부 클래스
    int i = 100;
    class B { // B 클래스는 A의 내부 클래스
        void method(){
            System.out.println(i);
        }
    }
}



public class InnerClass_1 {
    public static void main(String[] args) {
        /*
        B b = new B();
        b.method();
         */

        A a = new A();
        
    }
}
