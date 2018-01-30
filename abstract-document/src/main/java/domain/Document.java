package domain;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Created by hujianbo on 2018/1/30.
 */
public interface Document {
    Void put(String key, Object value);

    Object get(String key);

    <T> Stream<T> children(String key, Function<Map<String, Object>, T> constructor);
}
