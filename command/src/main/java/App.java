import domain.BuyStock;
import domain.Executor;
import domain.SellStock;
import domain.Stock;

/**
 * Created by hujianbo on 2018/2/8.
 */
public class App {
    public static void main(String[] args) {

        Stock stock = new Stock();

        BuyStock buyStock = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);

        Executor executor = new Executor();
        executor.takeOrder(buyStock);
        executor.takeOrder(sellStock);

        executor.placeOrders();
    }
}

