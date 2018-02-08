package domain;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hujianbo on 2018/2/8.
 */
@ToString
public class Item {
    private Integer id;
    private String name;
    private List<Item> subItems;

    public Item(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.subItems = new ArrayList<Item>();
    }

    public void add(Item item) {
        subItems.add(item);
    }

    public void remove(Item item) {
        subItems.remove(item);
    }

    public List<Item> getSubItems() {
        return subItems;
    }

}
