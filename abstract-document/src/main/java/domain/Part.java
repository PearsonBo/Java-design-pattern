package domain;

import java.util.Map;

/**
 * Created by hujianbo on 2018/1/30.
 */
public class Part extends AbstractDocument implements HasType, HasModel, HasPrice {
    
    public Part(Map<String, Object> properties) {
        super(properties);
    }
}
