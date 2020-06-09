package ua.org.aleks.easytravel.app.infra.util;

import org.junit.Before;
import org.junit.Test;
import ua.org.aleks.easytravel.app.infra.exeption.flow.InvalidParameterException;

import java.security.InvalidAlgorithmParameterException;

import static org.junit.Assert.*;

public class ChecksTest {

    @Test
    public void testCheckParameterGetException() {
        try {
            Checks.checkParameter(false, "test");

            assertTrue(false);
        } catch (Exception ex) {
            assertSame(ex.getClass(), InvalidParameterException.class);
            assertEquals(ex.getMessage(), "test");
        }
    }

    @Test
    public void testCheckParameterNoException() {
        Checks.checkParameter(true, "test");
        assertTrue(true);
    }
}