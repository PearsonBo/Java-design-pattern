import java.util.concurrent.ExecutionException;

/**
 * Created by hujianbo on 2018/1/31.
 */
public interface AsyncResult<T> {

    /**
     * Status of the async task excution
     *
     * @return
     */
    boolean isCompleted();

    /**
     * Get the value of completed async task
     *
     * @return
     */
    T getValue() throws ExecutionException;

    /**
     * Blocks the current thread until the async task is completed
     */
    void await() throws InterruptedException;
}
