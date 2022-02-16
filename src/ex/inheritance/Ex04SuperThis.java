package ex.inheritance;

// super 조상과 this 자손 자신을 구별하기 위함
// this 는 iv 와 lv 를 구별하기 위함

/*
class Ex04Parent {
    int x = 10;
}

class Ex04Child extends Ex04Parent {
    int x = 20;

    void method() {
        System.out.println("x: " + x);
        System.out.println("this.x: " + this.x);
        System.out.println("super.x: " + super.x);
    }
}
*/

/*
class Ex04Parent {
    int x = 10;
}

class Ex04Child extends Ex04Parent {
    void method() {
        System.out.println("x: " + x);
        System.out.println("this.x: " + this.x);
        System.out.println("super.x: " + super.x);
    }
}
여기까지 super, this
*/

// super(), this() 는 각각 조상의 생성자, 자신의 생성자
// 상속을 할 때 조상의 생성자 호출 및 초기화 블럭은 상속받지 않기때문
// 상속을 받은 자손은 자손의 멤버변수만 초기화하고, 조상의 멤버는 조상단에서 초기화하는 것을 권장.

// *참고: 생성자: 인스턴스 초기화 메서드

class Ex04Point {
    int x, y;

    Ex04Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Ex04Point3D extends Ex04Point {
    int z;

//    권장하지 않는 생성자
//    Ex04Point3D(int x, int y, int z) {
//        this.x = x;
//        this.y = y;
//        this.z = z;
//    }

    Ex04Point3D(int x, int y, int z) {
        super(x, y); // 조상의 생성자에 파라미터로 x,y 전달
        this.z = z;
    }
}

// ch7-11 super(): 조상의 생성자
/*
Ex04Point2
모든 생성자의 첫 줄에 반드시 다른 생성자(super() or this())를 호출해야한다.
그렇지 않으면 컴파일러가 생성자의 첫 줄에 super();를 자동으로 삽입한다.(했었다..지금까지는)
*/

//class Ex04Point2 {
//    int x;
//    int y;
//
//    Ex04Point2(){
//        this(0, 0);
//    }
//
//    Ex04Point2(int x, int y) {
//        // super(); 컴파일러가 자동으로 삽입. 이 경우는 Object();
//        this.x = x;
//        this.y = y;
//    }
//}

class Ex04Point3 {
    int x;
    int y;

    Ex04Point3(int x, int y){
        this.x = x;
        this.y = y;
    }

    String getLocation(){
        return "x: " + x + "y: " + y;
    }
}

class Ex04Point3D2 extends Ex04Point3 {
    int z;

    Ex04Point3D2(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    
    String getLocation(){
        return "x: " + x + "y: " + "z: " + z;
    }
}

public class Ex04SuperThis {
    public static void main(String[] args) {
//        Ex04Child child = new Ex04Child();
//        child.method();
        /*
            x: 20
            this.x: 20
            super.x: 10
        */

//        Ex04Child child = new Ex04Child();
//        child.method();
    }
}
