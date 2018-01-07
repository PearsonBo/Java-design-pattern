package construct.decorator;

/**
 * Created by HBooo on 2018/1/7 0007.
 */
public class ClientDemo {
    public static void main(String[] args) {
        Component component = new ConcreateComponent();
        Decorator decorator = new ConcreateDecorator(component);
        decorator.operation();
    }
}
