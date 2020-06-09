package ua.org.aleks.easytravel.app.service.impl;

import org.junit.Before;
import org.junit.Test;
import ua.org.aleks.easytravel.app.model.entity.geography.City;
import ua.org.aleks.easytravel.app.service.GeographicService;

import java.util.List;

import static org.junit.Assert.*;

public class GeographicServiceImplTest {
    private GeographicService service;

    @Before
    public void setUp() throws Exception {
        service = new GeographicServiceImpl();
    }

    @Test
    public void testNoDataReturnedAtStart() {
        List<City> cities = service.findCities();
        assertTrue(cities.isEmpty());
    }

    @Test
    public void testSaveNewCitySuccess() {
        City city = new City("Odessa");
        service.saveCity(city);

        List<City> cities = service.findCities();
        assertEquals(cities.size(), 1);
        assertEquals(cities.get(0).getName(), "Odessa");
    }
}