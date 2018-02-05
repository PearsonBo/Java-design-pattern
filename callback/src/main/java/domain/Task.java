package domain;

/**
 * Created by hujianbo on 2018/2/5.
 */
public abstract class Task {

    public void executeWith(CallBack callBack) {
        execute();

        callBack.call();
    }

    public abstract void execute();

}
