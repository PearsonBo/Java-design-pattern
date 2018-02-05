package domain;


import lombok.Data;

/**
 * Created by hujianbo on 2018/2/5.
 */
@Data
public class BusinessDelegate {

    private ServiceType serviceType;
    private BusinessService businessService;


    public void doProcess() {
        switch (serviceType) {
            case EJB:
                businessService = new EjbService();
                break;
            case JMS:
                businessService = new JmsService();
                break;
            default:
                break;
        }
        System.out.println(businessService.process());
    }
}
