package create.factory;

/**
 * Created by HBooo on 2018/1/7 0007.
 */
public class OracleGargener implements FruitGardener {
    @Override
    public Fruit factory() {
        return new Oracle();
    }

    private class Oracle implements Fruit {

        @Override
        public void grow() {
            System.out.println("橘子在生长");
        }

        @Override
        public void plant() {
            System.out.println("橘子在种植");
        }
    }
}
