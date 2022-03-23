package objectClassEquals;

public class ex2 {
    public static void main(String[] args) {
        Person p1 = new Person(123123123L);
        Person p2 = new Person(123123123L);

        if (p1.equals(p2)) {
            System.out.println("p1과 p2는 동일인입니다.");
        } else {
            System.out.println("p1과 p2는 타인입니다. ");
        }
    }
}

class Person {
    long id;

    Person(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) return false;
        Person pObj = (Person) obj; // 다형성
        return this.id == pObj.id;
    }
}