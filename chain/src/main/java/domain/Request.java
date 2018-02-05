package domain;

import java.util.Objects;

/**
 * Created by hujianbo on 2018/2/5.
 */
public class Request {
    private final RequestType requestType;

    private final String requestDescription;

    private boolean handled;

    public Request(final RequestType requestType, final String requestDescription) {
        this.requestType = Objects.requireNonNull(requestType);
        this.requestDescription = Objects.requireNonNull(requestDescription);
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public String getRequestDescription() {
        return requestDescription;
    }

    public boolean isHandled() {
        return this.handled;
    }

    public void setHandled(boolean handled) {
        this.handled = handled;
    }

    @Override
    public String toString() {
        return getRequestDescription();
    }

    public void markHandled() {
        this.handled = true;
    }
}
