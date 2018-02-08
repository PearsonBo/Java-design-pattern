package domain;

/**
 * Created by hujianbo on 2018/2/8.
 */
public class BuyStock implements Order {
    private Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }

    @Override
    public void execute2() {
        stock.test();
    }
}
