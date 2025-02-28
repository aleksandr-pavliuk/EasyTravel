package ua.org.aleks.easytravel.app.infra.exeption.base;

/**
 * Base class for all application-specific exceptions
 * @author admin
 *
 */
public abstract class AppException extends RuntimeException {

    private static final long serialVersionUID = 7837501112802868980L;

    public AppException(String message, Throwable cause) {
        super(message, cause);
    }

    public AppException(String message) {
        super(message);
    }
}