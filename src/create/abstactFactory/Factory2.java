package create.abstactFactory;

/**
 * Created by HBooo on 2018/1/7 0007.
 */
public class Factory2 implements AbstractFactory {
    @Override
    public ProductA factoryA() {
        return new ProductA2();
    }

    @Override
    public ProductB factoryB() {
        return new ProductB2();
    }
}
