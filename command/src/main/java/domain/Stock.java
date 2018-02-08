package domain;

/**
 * Created by hujianbo on 2018/2/8.
 */
public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println("Stock [ Name: " + name + ",Quantity:" + ++quantity + " ]bought ");
    }

    public void sell() {
        System.out.println("Stock [ Name: " + name + ",Quantity:" + --quantity + " ]sold ");
    }

    public void test() {
        System.out.println("test..");
    }
}
