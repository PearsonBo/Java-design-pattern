import domain.CallBack;
import domain.SimpleTask;
import domain.Task;

/**
 * Created by hujianbo on 2018/2/5.
 */
public class App {
    public static void main(String[] args) {
        Task task = new SimpleTask();
        task.executeWith(new CallBack() {
            @Override
            public void call() {
                System.out.println("callback...");
            }
        });
    }
}
