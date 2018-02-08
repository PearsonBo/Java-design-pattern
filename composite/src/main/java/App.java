import domain.Item;

import java.util.List;

/**
 * Created by hujianbo on 2018/2/8.
 */
public class App {
    public static void main(String[] args) {
        Item boss = new Item(1, "boss");

        Item manager = new Item(2, "manager");

        Item clerk1 = new Item(3, "clerk1");
        Item clerk2 = new Item(3, "clerk2");

        boss.add(manager);
        manager.add(clerk1);
        manager.add(clerk2);

        print(boss);
        System.out.println("---------");
        print(manager);
        System.out.println("---------");
        print(clerk1);
    }

    private static void print(Item item) {
        List<Item> subItems = item.getSubItems();
        if (subItems != null && subItems.size() > 0) {
            subItems.forEach(p -> {
                System.out.println(p);
                print(p);
            });
        }
    }
}
