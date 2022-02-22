package abstractClass;

abstract class Unit {
    int x, y;

    abstract void move(int x, int y);

    void stop() { /* 현재 위치에서 정지하는 로직 */}
}

class Marine extends Unit {

    @Override
    void move(int x, int y) {
        System.out.println("Marine[x: " + x + ", y: " + y + "]");
    }

    void stimPack() {
        System.out.println("스팀팩이 사용되었습니다.");
    }
}

class Tank extends Unit {

    @Override
    void move(int x, int y) {
        System.out.println("Tank[x: " + x + ", y: " + y + "]");
    }

    void changeMode() {
        System.out.println("공격모드가 전환되었습니다.");
    }
}

class DropShip extends Unit {

    @Override
    void move(int x, int y) {
        System.out.println("DropShip[x: " + x + ", y: " + y + "]");
    }

    void load() {
        System.out.println("승차를 진행합니다.");
    }

    void unload() {
        System.out.println("하차를 진행합니다.");
    }
}

public class Abc_2 {
    public static void main(String[] args) {
        Unit[] units = { new Marine(), new Tank(), new DropShip() };

        for (Unit unit: units) {
            unit.move(100, 200);
        }
    }
}
