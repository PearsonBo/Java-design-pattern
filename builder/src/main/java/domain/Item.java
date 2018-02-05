package domain;

import lombok.ToString;

/**
 * Created by hujianbo on 2018/2/5.
 */
@ToString
public class Item {
    private Integer id;
    private String name;

    public Item(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static class Builder {

        private Integer id;
        private String name;

        public Builder(Integer id, String name) {
            this.id = id;
            this.name = name;
        }

        public Builder() {

        }

        public Builder setId(Integer id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Item build() {
            return new Item(this);
        }
    }
}
