package create.abstactFactory;

/**
 * Created by HBooo on 2018/1/7 0007.
 */
public class ClientDemo {
    public static void main(String[] args) {
        AbstractFactory factory1 = new Factory1();
        ProductA productA1 = factory1.factoryA();
        ProductB productB1 = factory1.factoryB();
        productA1.method();
        productB1.method();

        AbstractFactory factory2 = new Factory2();
        ProductA productA2 = factory2.factoryA();
        ProductB productB2 = factory2.factoryB();
        productA2.method();
        productB2.method();

    }
}
