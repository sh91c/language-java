package pkg1;

public class MyParent {
    private int prv;    // 같은 클래스
    int dft;            // 같은 패키지
    protected int prt;  // 같은 패키지 + 자손 (다른 패키지의 자손)
    public int pub;     // 접근 제한 없음.

    public void printMembers() {
        System.out.println(prv);    // 같은 클래스 내부라서 사용가능
        System.out.println(dft);
        System.out.println(prt);
        System.out.println(pub);
    }
}

//public class MyParentTest {
class MyParentTest {
    public static void main(String[] args) {
        MyParent p = new MyParent();
//        System.out.println(p.prv);  // 다른 클래스이기 때문에 에러.
        System.out.println(p.dft);
        System.out.println(p.prt);
        System.out.println(p.pub);
    }
}
