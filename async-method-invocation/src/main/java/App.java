import lombok.extern.slf4j.Slf4j;

import java.util.Optional;
import java.util.concurrent.Callable;

/**
 * Created by hujianbo on 2018/1/31.
 */
@Slf4j
public class App {

    public static void main(String[] args) throws Exception {
        AsyncExecutor executor = new ThreadAsyncExecutor();

        AsyncResult<Integer> asyncResult1 = executor.startProcess(lazyval(10, 500));
        AsyncResult<String> asyncResult2 = executor.startProcess(lazyval("test", 500));
        AsyncResult<Long> asyncResult3 = executor.startProcess(lazyval(1000L, 500));
        AsyncResult<Integer> asyncResult4 = executor.startProcess(lazyval(20, 500), callback("Callback result 4"));
        AsyncResult<String> asyncResult5 = executor.startProcess(lazyval("callback", 600), callback("Callback result 5"));

        Thread.sleep(350);

        Integer result1 = executor.endProcess(asyncResult1);
        String result2 = executor.endProcess(asyncResult2);
        Long result3 = executor.endProcess(asyncResult3);

        asyncResult4.await();
        asyncResult5.await();

        log.info("Result1: " + result1);
        log.info("Result2: " + result2);
        log.info("Result3: " + result3);

    }

    private static <T> AsyncCallback<T> callback(String name) {
        return (value, ex) -> {
            if (ex.isPresent()) {
                log.info(name + "failed:" + ex.map(Exception::getMessage).orElse(""));
            } else {
                log.info(name + ": " + value);
            }
        };
    }

    private static <T> Callable<T> lazyval(T value, long delayMillis) {
        return () -> {
            Thread.sleep(delayMillis);
            log.info("Task completed with: " + value);
            return value;
        };
        //return new Callable<T>() {
        //    @Override
        //    public T call() throws Exception {
        //        return value;
        //    }
        //};
    }


}
