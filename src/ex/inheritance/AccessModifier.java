package ex.inheritance;

public class AccessModifier {
    public static void main(String[] args) {
        
    }
}
/*
    접근 제어자(access modifier)
    private: 같은 [클래스] 내에서만 접근이 가능하다.
    (default): 같은 [패키지] 내에서만 접근이 가능하다.
    protected: 같은 [패키지 내에서, 그리고 다른 패키지의 자손 클래스]에서 접근이 가능하다.
    public: 접근 제한이 전혀 [없다].
*/

/*
    public 또는 (default) class AccessModifierTest{
        int iv;
        static in cv;

        void method() {}
    }
    1. class 에는 public 또는 (default) 2개만 붙일 수 있다.
    1.1. 한 파일에 public class 는 하나만 사용가능하다.
    2. 멤버들에게는 모든 접근 제어자를 사용할 수 있다.
*/