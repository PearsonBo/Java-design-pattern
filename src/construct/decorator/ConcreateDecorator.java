package construct.decorator;

/**
 * Created by HBooo on 2018/1/7 0007.
 */
public class ConcreateDecorator extends Decorator {
    public ConcreateDecorator(Component component) {
        super(component);
    }

    private void method() {
        System.out.println("装饰");
    }

    @Override
    public void operation() {
        this.method();
        super.operation();
    }
}
