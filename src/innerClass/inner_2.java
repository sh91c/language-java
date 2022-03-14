package innerClass;

class Outer2 {
    int value = 10; // Outer2.this.value, Outer2 의 iv

    class Inner {
        int value = 20; // this.value, Inner 의 iv

        void method1() {
            int value = 30; // lv
            System.out.println("            value: " + value);
            System.out.println("       this.value: " + this.value);
            System.out.println("Outer2.this.value: " + Outer2.this.value);
        }
    }
}

public class inner_2 {
    public static void main(String[] args) {
        Outer2 outer = new Outer2();
        Outer2.Inner inner = outer.new Inner();
        inner.method1();
    }
}
