package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * this is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * this adds a city to the list if the city does not exist
     * @param city this is a candidate city to add
     * @throws IllegalArgumentException if the city already exists
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException("City already exists in the list");
        }
        cities.add(city);
    }

    /**
     * this returns a sorted list of cities
     * @return return the sorted list
     */
    public List<City> getCities() {
        List<City> list = new ArrayList<>(cities);
        Collections.sort(list);
        return list;
    }

    /**
     * checks whether a given city exists in the list
     * @param city the city to check for
     * @return true if the city is in the list, false otherwise
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * deletes a city from the list if it exists
     * @param city the city to remove
     * @throws IllegalArgumentException if the city is not found in the list
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException("City not found in the list");
        }
        cities.remove(city);
    }

    /**
     * returns the total number of cities in the list
     * @return the number of cities
     */
    public int countCities() {
        return cities.size();
    }
}
