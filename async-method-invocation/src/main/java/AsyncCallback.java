import java.util.Optional;

/**
 * Created by hujianbo on 2018/1/31.
 */
public interface AsyncCallback<T> {

    /**
     * Complete handler which is executed when aysnc task is completed or fails execution
     *
     * @param value
     * @param ex
     */
    void onComplete(T value, Optional<Exception> ex);
}
