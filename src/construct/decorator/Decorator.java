package construct.decorator;

/**
 * Created by HBooo on 2018/1/7 0007.
 */
public abstract class Decorator implements Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        this.component.operation();
    }
}
