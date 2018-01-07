package create.factory;

/**
 * Created by HBooo on 2018/1/7 0007.
 */
public class AppleGardener implements FruitGardener {
    @Override
    public Fruit factory() {
        return new Apple();
    }

    private class Apple implements Fruit {

        @Override
        public void grow() {
            System.out.println("苹果在生长");
        }

        @Override
        public void plant() {
            System.out.println("苹果在种植");
        }
    }
}

