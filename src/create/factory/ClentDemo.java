package create.factory;

/**
 * Created by HBooo on 2018/1/7 0007.
 */
public class ClentDemo {
    public static void main(String[] args) {
        //生产苹果
        FruitGardener gardener = new AppleGardener();
        Fruit apple = gardener.factory();
        apple.grow();
        apple.plant();

        //生产橘子
        FruitGardener gardener2 = new OracleGargener();
        Fruit oracle = gardener2.factory();
        oracle.grow();
        oracle.plant();


    }
}
