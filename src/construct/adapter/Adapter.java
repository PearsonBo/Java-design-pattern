package construct.adapter;

/**
 * Created by HBooo on 2018/1/7 0007.
 */
public class Adapter extends Resource implements Target {
    @Override
    public void request() {
        super.specificRequest();
    }
}
