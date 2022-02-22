package polymorphism;

public class Ex7_7 {
    public static void main(String[] args) {
//        Car car = null;
//        FireEngine fe = new FireEngine();
//        FireEngine fe2 = null;
//
//        fe.water();
//        car = (Car) fe; // 자손에서 부모타입으로 형변환은 생략가능
////        car.water();
//        fe2 = (FireEngine) car; // 부모타입에서 자손타입의 형변환은 생략 불가
//        fe2.water();
    }
}

class Car {
    String color;
    int door;

    void drive() {
        System.out.println("drive, Brrrr~");
    }

    void stop() {
        System.out.println("stop!!!");
    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("water!!!");
    }
}