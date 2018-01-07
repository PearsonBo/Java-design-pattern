package construct.proxy;

/**
 * Created by HBooo on 2018/1/7 0007.
 */
public class ProxySubject implements Subject {
    private Subject subject;

    public ProxySubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        this.beforeRequest();
        subject.request();
        this.afterRequest();
    }


    private void beforeRequest() {
    }

    private void afterRequest() {
    }
}
