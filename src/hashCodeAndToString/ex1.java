package hashCodeAndToString;

import java.util.Objects;

class Card {
    String kind;
    int number;

    Card() {
        this("SPADE", 8);
    }

    Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Card))
            return false;
        Card cObj = (Card) obj;
        return this.kind.equals(cObj.kind) && this.number == cObj.number;
    }

    // equals()를 재정의했다면, hashCode()도 함께 재정의 해야함.
    public int hashCode() {
        return Objects.hash(kind, number); // iv 멤버를 전달하고싶은 만큼 파라미터로 전달
        // Objects 클래스는 객체와 관련된 유용한 메서드를 제공하는 유틸 클래스.
        // int hash(Object... values) {...}
        // 매개변수가 가변인자(Object...)라서 호출시 지정하는 값의 개수가 정해져있지 않다!
        // 결론은 객체의 hashCode는 각각이 다르지만 객체의 iv로 어떤 작업을 진행할 때는 iv로 비교하여
        // 같은 값이면 hashCode가 같은 값, 다르다면 다른 값이 반환되는 것.
        // ** 기준이 iv로 잡힌다고 생각하면 편함 **
    }

    @Override // Object 클래스의 toString() 재정의
    public String toString() {
        return "Kind: " + this.kind + ", number: " + this.number;
    }

    // IDE 자동기능
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Card card = (Card) o;
//        return number == card.number && Objects.equals(kind, card.kind);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(kind, number);
//    }
//
//    @Override
//    public String toString() {
//        return "Card{" +
//                "kind='" + kind + '\'' +
//                ", number=" + number +
//                '}';
//    }
}

public class ex1 {
    public static void main(String[] args) {
//        Card c1 = new Card("Spade", 8);
//        Card c2 = new Card("Diamond", 2);

        Card c1 = new Card();
        Card c2 = new Card();

        System.out.println(c1.equals(c2));
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1);
        System.out.println(c2);
    }
}
