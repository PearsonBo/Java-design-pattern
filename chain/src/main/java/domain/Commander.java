package domain;

/**
 * Created by hujianbo on 2018/2/5.
 */
public class Commander extends RequestHandler {
    public Commander(RequestHandler handler) {
        super(handler);
    }

    @Override
    public void handleRequest(Request req) {
        if (req.getRequestType().equals(RequestType.DEFEND_CASTLE)) {
            printHandling(req);
            req.markHandled();
        } else {
            super.handleRequest(req);
        }
    }

    @Override
    public String toString() {
        return "this is commander";
    }
}
