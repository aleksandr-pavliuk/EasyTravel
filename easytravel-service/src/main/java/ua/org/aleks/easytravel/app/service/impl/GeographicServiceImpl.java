package ua.org.aleks.easytravel.app.service.impl;

import ua.org.aleks.easytravel.app.infra.util.CommonUtil;
import ua.org.aleks.easytravel.app.model.entity.geography.City;
import ua.org.aleks.easytravel.app.service.GeographicService;

import java.util.ArrayList;
import java.util.List;

/**
 * Default implementation of the {@link GeographicService}
 * @author admin
 *
 */
public class GeographicServiceImpl implements GeographicService {
    /**
     * Internal list of cities
     */
    private final List<City> cities;

    public GeographicServiceImpl() {
        cities = new ArrayList<City>();
    }

    @Override
    public List<City> findCities() {
        return CommonUtil.getSafeList(cities);
    }

    @Override
    public void saveCity(City city) {
        if(!cities.contains(city)) {
            cities.add(city);
        }
    }

}
