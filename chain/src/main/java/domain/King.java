package domain;

/**
 * Created by hujianbo on 2018/2/5.
 */
public class King {

    RequestHandler chain;

    public King() {
        chain = new Commander(new Officer(new Soldier(null)));
    }

    public void makeRquest(Request req) {
        chain.handleRequest(req);
    }
}
