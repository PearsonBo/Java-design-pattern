package construct.composite;

import java.util.ArrayList;

/**
 * Created by HBooo on 2018/1/7 0007.
 */
public class Composite implements Component {
    @Override
    public void operation() {

    }

    private ArrayList<Component> componentList = new ArrayList<Component>();

    public void add(Component component) {
        this.componentList.add(component);
    }

    public void remove(Component component) {
        this.componentList.remove(component);
    }

    public ArrayList<Component> getChild() {
        return this.componentList;
    }
}
