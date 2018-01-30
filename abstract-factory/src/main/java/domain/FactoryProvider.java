package domain;

/**
 * Created by hujianbo on 2018/1/30.
 */
public class FactoryProvider {

    public static Factory getFactory(FactoryType type) {
        switch (type) {
            case SHAPE:
                return new ShapeFactory();
            case COLOR:
                return new ColorFactory();
            default:
                return null;
        }
    }
}
