package ex.inheritance;


// Java는 다중상속을 허용하지 않는다.
// 문제점 : 상속한 부모의 멤버가 중복되면 충돌위험이 있다.
// 하지만 파이썬은 mro를 통해 다중상속이 된다.
// 나중에 인터페이스를통해 다중상속 처럼 가능
// 아니면, 비중이 높은 클래스 하나만 상속관계로, 나머지는 포함관계로 작성하면 됨

// override, overriding (오버라이딩)

class Ex03Point {
    int x;
    int y;
    String getLocation() {
        return "x: " + x + ", y: " + y;
    }

    // Object 의 toString override
    // 정확한 override 를 위해 선언부 public 까지 똑같이 작성한다.
    // *선언부가 조상 클래스의 메서드와 일치해야함.
    // *접근제어자를 조상 클래스의 메서드보다 좁은범위로 변경할 수 없다.
    // 예외는 조상 클래스의 메서드보다 많이 선언할 수 없다.
    public String toString() {
        return "[toString() override] x: " + x + ", y: " + y;
    }
}

class Ex03Point3D extends Ex03Point {
    int z;
    String getLocation() {
        return "x: " + x + ", y: " + y + ", z: " + z;
    }

    Ex03Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

public class Ex03 {
    public static void main(String[] args) {
        Ex03Point3D p = new Ex03Point3D(1,2,3);
//        p.x = 1;
//        p.y = 2;
//        p.z = 3;

        System.out.println(p.getLocation());
        System.out.println(p.toString());
        System.out.println(p);
    }
}
