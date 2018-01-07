package create.abstactFactory;

/**
 * Created by HBooo on 2018/1/7 0007.
 */
public class Factory1 implements AbstractFactory {
    @Override
    public ProductA factoryA() {
        return new ProductA1();
    }

    @Override
    public ProductB factoryB() {
        return new ProductB1();
    }
}
