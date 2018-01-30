import domain.*;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by hujianbo on 2018/1/30.
 */
public class App {

    public static void main(String[] args) {
        Factory factory1 = FactoryProvider.getFactory(FactoryType.COLOR);
        Color color = factory1.getColor(ColorType.RED);
        System.out.println(color.getColor());

        Factory factory2 = FactoryProvider.getFactory(FactoryType.SHAPE);
        Shape shape = factory2.getShape(ShapeType.ROUND);
        System.out.println(shape.getShape());
    }

}
