package polymorphism;

public class Ex7_29_7_9 {
    public static void main(String[] args) {
        Buyer2 b = new Buyer2();
        b.buy(new Tv2());
        b.buy(new Computer2());
        b.buy(new Audio2());
        b.summary();
    }
}

/*
    [여러 종류의 객체를 배열로 다루기]
    부모타입 참조 배열에 여러 타입의 자손 객체를 배열로 담는 것.
*/

class Product2 {
    int price;
    int bonusPoint;

    Product2() {
    }

    Product2(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Tv2 extends Product2 {
    Tv2() {
        super(100);
    }

    public String toString() {
        return "Tv2";
    }
}

class Computer2 extends Product2 {
    Computer2() {
        super(200);
    }

    public String toString() {
        return "Computer2";
    }
}

class Audio2 extends Product2 {
    Audio2() {
        super(50);
    }

    public String toString() {
        return "Audio2";
    }
}

class Buyer2 {
    int money = 1000;
    int bonusPoint = 0;
    Product2[] cart = new Product2[10];
    int i = 0;

    void buy(Product2 p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 제품을 구입할 수 없습니다.");
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        cart[i++] = p;
        System.out.println(p + "을/를 구입했습니다.");
    }

    void summary() {
        int sum = 0;
        String itemList = "";

        for (int i = 0; i < cart.length; i++) {
            if(cart[i] == null) break;
            sum += cart[i].price;
            itemList += cart[i] + ", ";
        }
        System.out.println("구입한 물건의 총 금액은 " + sum +"입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}