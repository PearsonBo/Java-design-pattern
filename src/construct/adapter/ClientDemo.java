package construct.adapter;

/**
 * Created by HBooo on 2018/1/7 0007.
 */
public class ClientDemo {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
