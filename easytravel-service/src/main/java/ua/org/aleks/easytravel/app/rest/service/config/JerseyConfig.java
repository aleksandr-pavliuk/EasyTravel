package ua.org.aleks.easytravel.app.rest.service.config;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("api")
/**
 * REST web-service configuration for Jersey
 * @author admin
 *
 */
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        packages("ua.org.aleks.easytravel.app.rest");
    }
}
