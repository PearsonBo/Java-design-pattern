package create.builder;

/**
 * Created by HBooo on 2018/1/7 0007.
 */
public class Director {
    private Builder builder = new ConcreteBuilder();

    public Product build() {
        builder.set1();
        builder.set2();
        builder.set3();

        return builder.bulidProduct();
    }
}
