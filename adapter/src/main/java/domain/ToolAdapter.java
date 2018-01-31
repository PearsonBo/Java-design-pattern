package domain;

/**
 * Created by hujianbo on 2018/1/31.
 */
public class ToolAdapter implements Work {

    private Mouse mouse;

    public ToolAdapter() {
        mouse = new Mouse();
    }

    @Override
    public String work() {
        return mouse.mouseWork();
    }
}
