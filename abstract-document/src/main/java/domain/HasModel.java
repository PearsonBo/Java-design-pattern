package domain;

import java.util.Optional;

/**
 * Created by hujianbo on 2018/1/30.
 */
public interface HasModel extends Document {

    String PROPERTY = "model";

    default Optional<String> getModel() {
        return Optional.ofNullable((String) get(PROPERTY));
    }
}
