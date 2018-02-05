package domain;

/**
 * Created by hujianbo on 2018/2/5.
 */
public class Soldier extends RequestHandler {

    public Soldier(RequestHandler handler) {
        super(handler);
    }

    @Override
    public void handleRequest(Request req) {
        if (req.getRequestType().equals(RequestType.COLLECT_TAX)) {
            printHandling(req);
            req.markHandled();
        } else {
            super.handleRequest(req);
        }
    }

    @Override
    public String toString() {
        return "this is soldier";
    }
}
