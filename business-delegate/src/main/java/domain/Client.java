package domain;

/**
 * Created by hujianbo on 2018/2/5.
 */
public class Client {

    BusinessDelegate businessDelegate;

    public Client(BusinessDelegate businessDelegate) {
        this.businessDelegate = businessDelegate;
    }

    public void process() {
        businessDelegate.doProcess();
    }
}
