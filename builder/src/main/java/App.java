import domain.Item;

/**
 * Created by hujianbo on 2018/2/5.
 */
public class App {
    public static void main(String[] args) {
        Item item = new Item.Builder().setId(1).setName("name").build();
        System.out.println(item);
    }
}
