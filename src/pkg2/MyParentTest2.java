package pkg2;

import pkg1.MyParent;

class MyChild extends MyParent {
    public void printMembers() {
//        System.out.println(prv);    // 상속받은 prv 가 있지만, MyChild 클래스는 MyParent 클래스와 다르기 때문에 에러.
//        System.out.println(dft);    // 상속받은 dft 가 있지만, MyChild 가 속한 패키지와 MyParent 가 속한 패키지가 다르기 때문에 에러.
        System.out.println(prt);    // MyChild 와 MyParent 가 같은 패키지에 속하진 않지만, MyChild 클래스는 MyParent 클래스를 상속을
                                    // 받은 자손 클래스기 때문에 사용 가능
        System.out.println(pub);    // 접근 제한이 없기 때문에 사용 가능
    }
}

public class MyParentTest2 {
    public static void main(String[] args) {
        MyParent p = new MyParent();
//        System.out.println(p.prv);  // MyParent 는 public 이지만 prv는 private 이기에 에러.
//        System.out.println(p.dft);  // 같은 패키지가 아니라서 에러.
//        System.out.println(p.prt);  // 다른 패키지, 다른 클래스라서 에러.
        System.out.println(p.pub);  // 접근 제한 없음
    }
}
