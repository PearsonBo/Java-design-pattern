import domain.*;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by hujianbo on 2018/1/30.
 */
@Slf4j
public class App {
    public static void main(String[] args) {
        new App();
    }

    public App() {
        log.info("Constructing parts and car");
        Map<String, Object> carProperties = new HashMap<String, Object>();
        carProperties.put(HasModel.PROPERTY, "300SL");
        carProperties.put(HasPrice.PROPERTY, 10000L);

        Map<String, Object> wheelProperties = new HashMap<>();
        wheelProperties.put(HasType.PROPERTY, "wheel");
        wheelProperties.put(HasModel.PROPERTY, "15C");
        wheelProperties.put(HasPrice.PROPERTY, 100L);

        Map<String, Object> doorProperties = new HashMap<>();
        doorProperties.put(HasType.PROPERTY, "door");
        doorProperties.put(HasModel.PROPERTY, "Lambo");
        doorProperties.put(HasPrice.PROPERTY, 300L);

        //other part is easy to append
        Map<String, Object> otherProperties = new HashMap<>();
        otherProperties.put(HasType.PROPERTY, "otherType");
        otherProperties.put(HasModel.PROPERTY, "otherModel");
        otherProperties.put(HasPrice.PROPERTY, 200L);

        carProperties.put(HasParts.PROPERTY, Arrays.asList(wheelProperties, doorProperties, otherProperties));

        Car car = new Car(carProperties);

        log.info("-> model: {}", car.getModel().get());
        log.info("-> price: {}", car.getPrice().get());
        log.info("->parts:");
        car.getParts().forEach(p -> log.info(p.toString()));
    }
}
