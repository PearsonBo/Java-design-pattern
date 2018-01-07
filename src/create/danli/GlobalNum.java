package create.danli;

/**
 * Created by HBooo on 2018/1/7 0007.
 */
public class GlobalNum {

    private static GlobalNum gn = new GlobalNum();
    private int num = 0;

    public static GlobalNum getInstance() {
        return gn;
    }

    public synchronized int getNum() {
        return ++num;
    }
}
