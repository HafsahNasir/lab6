package com.example.listycity;

import java.util.Objects;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable<City> {
    /**
     * The name of the city.
     */
    private String city;

    /**
     * The name of the province.
     */
    private String province;

    /**
     * Creates a City object with a city name and province name.
     *
     * @param city     the city name
     * @param province the province name
     */
    City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * Returns the city name.
     *
     * @return the city name
     */
    String getCityName() {
        return this.city;
    }

    /**
     * Returns the province name.
     *
     * @return the province name
     */
    String getProvinceName() {
        return this.province;
    }

    /**
     * Compares this city with another city by city name.
     *
     * @param other the city to compare with
     * @return a negative integer, zero, or a positive integer if this city name
     *         is less than, equal to, or greater than the other city name
     * @throws NullPointerException if {@code other} is {@code null}
     */
    @Override
    public int compareTo(City other) {
        return this.city.compareTo(other.getCityName());
    }

    /**
     * Compares this city to another object for equality.
     *
     * @param obj the object to compare with
     * @return true if both city name and province are equal; otherwise false
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof City)) {
            return false;
        }
        City other = (City) obj;
        return Objects.equals(city, other.city) && Objects.equals(province, other.province);
    }

    /**
     * Returns the hash code for this city.
     *
     * @return the hash code based on city name and province
     */
    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}
