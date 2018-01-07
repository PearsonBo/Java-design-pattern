package create.prototype;

/**
 * Created by HBooo on 2018/1/7 0007.
 */
public class ConcretePrototype implements Prototype {
    @Override
    public Prototype clone() {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

}
