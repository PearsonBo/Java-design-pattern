package domain;

/**
 * Created by hujianbo on 2018/2/5.
 */
public abstract class Shape {

    DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();


}
