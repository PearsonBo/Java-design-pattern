import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/**
 * Created by hujianbo on 2018/1/31.
 */
public interface AsyncExecutor {

    /**
     * Starts processing of an async task. Returns immediately with async result.
     *
     * @param task
     * @param <T>
     * @return
     */
    <T> AsyncResult<T> startProcess(Callable<T> task);

    /**
     * Starts processing of an async task. Returns immediately with async result. Execute callback when the task is completed
     *
     * @param task
     * @param asyncCallback
     * @param <T>
     * @return
     */
    <T> AsyncResult<T> startProcess(Callable<T> task, AsyncCallback<T> asyncCallback);

    /**
     * Ends processing of async task. Block the current thread if necessary and returns the evaluated value of the completed task
     *
     * @param asyncResult
     * @param <T>
     * @return
     */
    <T> T endProcess(AsyncResult<T> asyncResult) throws InterruptedException, ExecutionException;


}
