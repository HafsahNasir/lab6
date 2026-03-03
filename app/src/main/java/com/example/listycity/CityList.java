package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * Creates an empty city list.
     */
    public CityList() {
    }

    /**
     * This adds a city to the list if the city does not exist.
     *
     * @param city This is a candidate city to add.
     * @throws IllegalArgumentException if the city already exists in the list
     */
    public void add(City city) {
        if (hasCity(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * Checks whether a city belongs to the list.
     *
     * @param city the city to check
     * @return true if the city exists in the list, otherwise false
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Removes a city from the list if it exists.
     *
     * @param city the city to remove
     * @throws IllegalArgumentException if the city does not exist in the list
     */
    public void delete(City city) {
        if (!cities.remove(city)) {
            throw new IllegalArgumentException();
        }
    }

    /**
     * Returns the number of cities in the list.
     *
     * @return the number of cities
     */
    public int countCities() {
        return cities.size();
    }

    /**
     * This returns a sorted list of cities.
     *
     * @return Return the sorted list.
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }
}
