package ex.inheritance;

class Point extends Object{
    int x;
    int y;
}

class Circle01 extends Point { // 상속
    int r;
}

class Circle02 {
//    Point p = new Point(); 아래 생성자로도 참조변수를 포함시켜 초기화 할 수 있다.
    Point p;
    int r;

    Circle02(){
        this.p = new Point();
    }
}


public class Ex02 {
    public static void main(String[] args) {
//        Circle01 c = new Circle01();
//        c.x = 1;
//        c.y = 2;
//        c.r = 3;
//        System.out.println("c.x = " + c.x);
//        System.out.println("c.y = " + c.y);
//        System.out.println("c.r = " + c.r);
//
//        Circle02 c2 = new Circle02();
//        c2.p.x = 4;
//        c2.p.y = 5;
//        c2.r = 6;
//        System.out.println("c2.p.x = " + c2.p.x);
//        System.out.println("c2.p.x = " + c2.p.y);
//        System.out.println("c2.p.x = " + c2.r);

        Circle01 c01 = new Circle01();
        System.out.println(c01.toString());
        System.out.println(c01);
        Circle01 c02 = new Circle01();
        System.out.println(c02.toString());
        System.out.println(c02);
    }
}
