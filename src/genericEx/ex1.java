package genericEx;

import java.util.ArrayList;

class Product {}
class Tv extends Product {}
class Audio extends Product {}

public class ex1 {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<Product>();
        productList.add(new Product()); // 매개변수의 다형성은 가능하다.
        productList.add(new Tv());
        productList.add(new Audio());

        ArrayList<Tv> tvList = new ArrayList<Tv>();
        tvList.add(new Tv());

        printAll(productList);
//        printAll(tvList); 제네릭 타입을 형변환 할 수 없다.
    }

    public static void printAll(ArrayList<Product> productList) {
        for (Product product : productList) {
            System.out.println(product);
        }
    }
}
