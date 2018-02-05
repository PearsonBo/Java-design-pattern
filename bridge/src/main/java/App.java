import domain.Circle;
import domain.GreenCircle;
import domain.RedCircle;

/**
 * Created by hujianbo on 2018/2/5.
 */
public class App {
    public static void main(String[] args) {
        Circle redCicle = new Circle(new RedCircle(), 100, 100, 10);
        Circle greenCicle = new Circle(new GreenCircle(), 100, 100, 10);

        redCicle.draw();
        greenCicle.draw();
    }
}
