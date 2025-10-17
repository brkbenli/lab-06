package com.example.listycity;

/**
 * this is a class that defines a city.
 */
public class City implements Comparable<City> {
    private String city;
    private String province;

    /**
     * creates a city object with a city name and province
     * @param city the name of the city
     * @param province the name of the province
     */
    City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * gets the city name
     * @return the city name
     */
    String getCityName() {
        return this.city;
    }

    /**
     * gets the province name.
     * @return the province name
     */
    String getProvinceName() {
        return this.province;
    }

    /**
     * compares this city with another city by name
     * @param other another City object to compare to
     * @return a negative integer, zero, or a positive integer as this city is less than,
     * equal to, or greater than the specified city
     */
    @Override
    public int compareTo(City other) {
        return this.city.compareTo(other.getCityName());
    }

    /**
     * checks if two cities are equal by comparing their names and provinces
     * @param obj The object to compare
     * @return true if both cities have the same name and province, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        City other = (City) obj;
        return this.city.equals(other.city) && this.province.equals(other.province);
    }

    /**
     * generates a hash code for this city
     * @return The hash code value
     */
    @Override
    public int hashCode() {
        return city.hashCode() + province.hashCode();
    }
}
