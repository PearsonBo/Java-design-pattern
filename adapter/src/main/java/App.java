import domain.Computer;
import domain.Tool;
import domain.ToolAdapter;

/**
 * Created by hujianbo on 2018/1/31.
 */
public class App {

    public static void main(String[] args) {
        Tool tool = new Tool(new ToolAdapter());
        System.out.println(tool.work());

        // pojo最好不要进行实现
        Tool tool2 = new Tool(new Computer());
        System.out.println(tool2.work());
    }
}
