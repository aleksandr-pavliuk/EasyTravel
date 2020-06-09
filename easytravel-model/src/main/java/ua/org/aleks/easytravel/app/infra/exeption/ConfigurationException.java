package ua.org.aleks.easytravel.app.infra.exeption;

import ua.org.aleks.easytravel.app.infra.exeption.base.AppException;

/**
 * Signals about incorrect configuration settings/parameters
 * @author admin
 *
 */
public class ConfigurationException extends AppException {

    private static final long serialVersionUID = -2177284893894040026L;

    public ConfigurationException(String message, Throwable cause) {
        super(message, cause);
    }

    public ConfigurationException(String message) {
        super(message);
    }

}
