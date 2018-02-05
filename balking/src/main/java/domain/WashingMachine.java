package domain;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by hujianbo on 2018/2/5.
 */
@Slf4j
public class WashingMachine {

    private WashingMachineState state;

    public WashingMachine() {
        state = WashingMachineState.ENABLED;
    }

    public WashingMachineState getWashingMachineState() {
        return state;
    }

    public void wash() {
        synchronized (this) {
            log.info("{}:state:{}", Thread.currentThread().getName(), getWashingMachineState());
            if (state == WashingMachineState.WASHING) {
                log.error("ERROR:is washing!");
                return;
            }
            state = WashingMachineState.WASHING;
        }
        log.info("{}:Doing the washing", Thread.currentThread().getName());
        try {
            Thread.sleep(50);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        endOfWashing();
    }

    private void endOfWashing() {
        state = WashingMachineState.ENABLED;
        log.info("{}:washing completed.", Thread.currentThread().getName());

    }

}
