import domain.BusinessDelegate;
import domain.Client;
import domain.ServiceType;

/**
 * Created by hujianbo on 2018/2/5.
 */
public class App {

    public static void main(String[] args) {
        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType(ServiceType.JMS);

        Client client = new Client(businessDelegate);
        client.process();
    }
}
