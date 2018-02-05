package domain;

/**
 * Created by hujianbo on 2018/2/5.
 */
public class Officer extends RequestHandler {

    public Officer(RequestHandler handler) {
        super(handler);
    }

    @Override
    public void handleRequest(Request req) {
        if (req.getRequestType().equals(RequestType.TORTURE_PRISONER)) {
            printHandling(req);
            req.markHandled();
        } else {
            super.handleRequest(req);
        }
    }

    @Override
    public String toString() {
        return "this is officer";
    }
}
