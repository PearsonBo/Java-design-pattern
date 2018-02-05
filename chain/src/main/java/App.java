import domain.King;
import domain.Request;
import domain.RequestType;

/**
 * Created by hujianbo on 2018/2/5.
 */
public class App {
    public static void main(String[] args) {
        King king = new King();
        king.makeRquest(new Request(RequestType.DEFEND_CASTLE, "保卫国家"));
        king.makeRquest(new Request(RequestType.TORTURE_PRISONER, "拷问犯人"));
        king.makeRquest(new Request(RequestType.COLLECT_TAX, "收保护费"));
    }
}
