package studyInterface;

abstract class Unit {
    int x, y;
    abstract void move(int x, int y);
    void stop() {
        System.out.println("[STOP]");
    }
}

interface Fightable { // 예외없이 인터페이스의 모든 메서드는 public abstract.
    // jdk1.8에서는 추가되었다고는 함(추후에 학습)
    void move(int x, int y);    // public abstract 생략
    void attack(Fightable f);   // public abstract 생략
}

class Fighter extends Unit implements Fightable {
    // Override 규칙: 조상(public)보다 접근제어자가 좁은 범위를 사용할 수 없다.
    @Override
    public void move(int x, int y) { // (default)는 public 보다 좁은 범위의 접근을 가진다.
        System.out.println("[MOVE: " + x + ", " + y + "]");
    }

    @Override
    public void attack(Fightable f) {
        System.out.println(f + " 에게 [Attack!]");
    }

    // 전투 가능한 상대를 호출하는 메서드
    Fightable getFightable() {
        return new Fighter(); // (Fightable) 생략되어있음. 자손에서 부모타입 자동 형변환이니까.
    }
}

public class Interface_1_2 {
    public static void main(String[] args) {
        // Fighter f = new Fighter();
        Unit u = new Fighter();
        Fightable f = new Fighter();
        // f.move(100, 200);
        // f.attack(new Fighter());
        // 또는
        // Fighter f2 = new Fighter();
        // f.attack(f2); // 참조 타입이 Unit 이었다면 attack() 메서드가 없어서 에러 발생함.
        // f.stop(); // 에러. Fightable 인터페이스에 stop() 추상 메서드가 없기때문에.

        // 다형성 확인
        u.move(100, 200);
        // u.attack(new Fighter()); // 에러.
        u.stop();

        f.move(200, 300);
        f.attack(new Fighter());
        // f.stop(); // 에러.

        Fighter f2 = new Fighter();
        Fightable f3 = f2.getFightable();
        f3.move(500, 100);
        f3.attack(f2);
    }
}
