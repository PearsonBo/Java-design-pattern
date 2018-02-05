package domain;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by hujianbo on 2018/2/5.
 */
@Slf4j
public abstract class RequestHandler {

    private RequestHandler next;

    public RequestHandler(RequestHandler next) {
        this.next = next;
    }

    public void handleRequest(Request req) {
        if (next != null) {
            next.handleRequest(req);
        }
    }

    public void printHandling(Request request) {
        log.info("{} handling request \"{}\"", this, request);
    }

    @Override
    public abstract String toString();
}
