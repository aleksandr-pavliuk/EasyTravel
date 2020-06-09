package ua.org.aleks.easytravel.app.service;

import ua.org.aleks.easytravel.app.model.entity.geography.City;
import java.util.List;

/**
 * Entry point to perform operations
 * over geographic entities
 * @author admin
 *
 */
public interface GeographicService {

    /**
     * Returns list of existing cities
     * @return
     */
    List<City> findCities();

    /**
     * Saves specified city instance
     * @param city
     */
    void saveCity(City city);
}
