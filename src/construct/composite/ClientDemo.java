package construct.composite;

/**
 * Created by HBooo on 2018/1/7 0007.
 */
public class ClientDemo {
    public static void main(String[] args) {
        Composite root = new Composite();
        root.operation();
        Composite branch = new Composite();
        Leaf leaf = new Leaf();
        root.add(branch);
        branch.add(leaf);

    }

    //遍历树
    public static void display(Composite root) {
        for (Component c : root.getChild()) {
            if (c instanceof Leaf) {
                c.operation();
            } else {
                c.operation();
                display((Composite) c);
            }
        }
    }
}
