package ua.org.aleks.easytravel.app.infra.exeption;

import ua.org.aleks.easytravel.app.infra.exeption.base.AppException;

/**
 * Signals about incorrect configuration settings/parameters
 * @author admin
 *
 */
public class FlowException extends AppException {

    private static final long serialVersionUID = -2889607185988464072L;

    public FlowException(String message, Throwable cause) {
        super(message, cause);
    }

    public FlowException(String message) {
        super(message);
    }
}
