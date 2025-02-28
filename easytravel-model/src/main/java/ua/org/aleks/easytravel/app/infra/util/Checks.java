package ua.org.aleks.easytravel.app.infra.util;

import ua.org.aleks.easytravel.app.infra.exeption.flow.InvalidParameterException;

/**
 * Contains common check routines
 *
 * @author admin
 */
public class Checks {
    private Checks() {
    }

    /**
     * Verifies that specified check passed and throws exception otherwise
     *
     * @param check
     * @param message
     * @throws InvalidParameterException
     */
    public static void checkParameter(boolean check, String message) throws InvalidParameterException {
        if (!check) {
            throw new InvalidParameterException(message);
        }
    }
}
