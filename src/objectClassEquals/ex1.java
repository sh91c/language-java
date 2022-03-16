package objectClassEquals;

public class ex1 {
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v1.equals(v2));
    }
}

class Value {
    int value;

    Value(int value) {
        this.value = value;
    }

    // 객체의 iv를 비교하고 싶다면 Object 클래스의 equals()를 재정의해야함
    public boolean equals(Object obj) {
        // obj 는 value가 없기 때문에 형변환 과정을 거쳐야한다.
        // 인자 obj의 참조 타입은 Object 이기 때문에
        // 형변환 시 instanceof로 Value 타입인지 확인을 무조건 해야함.
//        if (obj instanceof Value) {
//            Value v = (Value) obj;
//            return this.value == v.value;
//        } else {
//            return false;
//        }
        if (!(obj instanceof Value)) return false;
        Value v = (Value) obj;
        return this.value == v.value;
    }
}