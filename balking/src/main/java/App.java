import domain.WashingMachine;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by hujianbo on 2018/2/5.
 */
@Slf4j
public class App {
    public static void main(String[] args) {

        final WashingMachine washingMachine = new WashingMachine();

        ExecutorService service = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 3 ; i++) {
            service.execute(washingMachine::wash);
        }
        service.shutdown();

        try {
            service.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException ie) {
            log.error("ERROR: Waiting on executor service shutdown!");
        }
    }
}
