package domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hujianbo on 2018/2/8.
 */
public class Executor {

    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
            order.execute2();
        }
        orderList.clear();
    }

}
