package ua.org.aleks.easytravel.app.infra.exeption;

import ua.org.aleks.easytravel.app.infra.exeption.base.AppException;

/**
 * Signals about exception cases in the work of external services and API
 * @author admin
 *
 */
public class CommunicationException extends AppException {

    private static final long serialVersionUID = -2850898723336164866L;

    public CommunicationException(String message, Throwable cause) {
        super(message, cause);
    }

    public CommunicationException(String message) {
        super(message);
    }

}