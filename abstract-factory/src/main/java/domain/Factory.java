package domain;

/**
 * Created by hujianbo on 2018/1/30.
 */
public interface Factory {

    public Color getColor(ColorType color);

    public Shape getShape(ShapeType shape);

}
