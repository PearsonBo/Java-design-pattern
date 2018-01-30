package domain;

/**
 * Created by hujianbo on 2018/1/30.
 */
public class ColorFactory implements Factory {

    @Override
    public Color getColor(ColorType color) {
        switch (color) {
            case RED:
                return new Red();
            case BLACK:
                return new Black();
            default:
                return null;
        }
    }

    @Override
    public Shape getShape(ShapeType shape) {
        return null;
    }
}
