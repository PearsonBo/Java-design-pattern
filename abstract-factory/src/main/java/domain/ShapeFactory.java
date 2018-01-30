package domain;

/**
 * Created by hujianbo on 2018/1/30.
 */
public class ShapeFactory implements Factory {

    @Override
    public Color getColor(ColorType color) {
        return null;
    }

    @Override
    public Shape getShape(ShapeType shape) {
        switch (shape) {
            case ROUND:
                return new Round();
            case SQUARE:
                return new Square();
            default:
                return null;
        }
    }
}
