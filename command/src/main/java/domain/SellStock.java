package domain;

/**
 * Created by hujianbo on 2018/2/8.
 */
public class SellStock implements Order {

    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }

    @Override
    public void execute2() {
        stock.test();
    }
}
