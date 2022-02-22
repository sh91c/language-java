package polymorphism;

public class Ex7_27_7_8 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());

        System.out.println("현재 남은 잔액은 " + b.money + "입니다.");
        System.out.println("현재 보너스 포인트는 " + b.bonusPoint + "입니다.");
    }
}

/*
    <복습>
    1. Tv t = new SmartTv(); 부모타입 참조변수 = new 자식 타입 객체
    2. 참조변수의 형변환: 사용 가능한 멤버개수 조절
    3. instanceof 연산자: 형변환 전 가능여부확인 메서드

    [매개변수의 다형성; 다형적 매개변수]
    <장점>
    1. 다형적 매개변수.
    2. 하나의 배열로 여러 종류의 객체를 다룸.
    <정의>
    - 참조형 매개변수는 메서드 호출 시, 자신과 같은 타입 또는 자손타입의 인스턴스를 넘겨줄 수 있음.
    -> 매개변수가 참조형이면 메서드 호출 시, 해당 매개변수로 자신또는 자손타입을 매개변수로 넘겨줄 수 있다.
 */

class Product {
    int price;      // 제품가격
    int bonusPoint; // 보너스 점수

    Product(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}

// Product 의 자손들
class Tv extends Product {
    Tv(){
        // 부모클래스의 생성자 Product(int Price)를 호출한다.
        super(100); // Tv의 가격을 100으로 초기화.
    }

    // 조상 Object 클래스의 toString() 메서드를 오버라이딩.
    public String toString(){
        return "Tv";
    }
}
class Computer extends Product {
    Computer(){
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Buyer {
    int money = 1000;   // 소유금액
    int bonusPoint = 0; // 보너스점수

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 물건을 구입할 수 없습니다.");
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p + "을/를 구입했습니다.");
    }
}

