package domain;

/**
 * Created by hujianbo on 2018/1/31.
 */
public class Tool implements Work {

    private Work work;

    public Tool(Work work) {
        this.work = work;
    }

    @Override
    public String work() {
        return work.work();
    }
}
