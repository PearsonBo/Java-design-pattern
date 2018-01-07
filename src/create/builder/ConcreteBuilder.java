package create.builder;

/**
 * Created by HBooo on 2018/1/7 0007.
 */
public class ConcreteBuilder extends Builder {

    private Product product = new Product();

    @Override
    public void set1() {

    }

    @Override
    public void set2() {

    }

    @Override
    public void set3() {

    }

    @Override
    public Product bulidProduct() {
        return product;
    }
}
