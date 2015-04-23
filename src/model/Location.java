/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Adriano Henrique Rossette Leite <adrianohrl@gmail.com>
 */
public class Location implements Rateable<Location> {

    /**
     *
     */
    private String name;
    /**
     *
     */
    private String street = "";
    /**
     *
     */
    private String identifier = "";
    /**
     *
     */
    private String district = "";
    /**
     *
     */
    private String zip = "";
    /**
     *
     */
    private String city;
    /**
     *
     */
    private String county = "";
    /**
     *
     */
    private String state;
    /**
     *
     */
    private String country;

    /**
     *
     */
    public Location() {
    }

    /**
     *
     * @param name
     * @param city
     * @param state
     * @param country
     */
    public Location(String name, String city, String state, String country) {
        this.setName(name);
        this.setCity(city);
        this.setState(state);
        this.setCountry(country);
    }

    /**
     *
     * @param name
     * @param street
     * @param identifier
     * @param district
     * @param zip
     * @param city
     * @param county
     * @param state
     * @param country
     */
    public Location(String name, String street, String identifier, String district, String zip, String city, String county, String state, String country) {
        this(name, city, state, country);
        this.street = street;
        this.identifier = identifier;
        this.district = district;
        this.zip = zip;
        this.county = county;
    }

    /**
     *
     * @param location
     * @return
     */
    @Override
    public int compareTo(Location location) {
        int value = name.compareToIgnoreCase(location.name);
        if (value == 0) {
            value = city.compareToIgnoreCase(location.city);
            if (value == 0) {
                value = county.compareToIgnoreCase(location.county);
                if (value == 0) {
                    value = state.compareToIgnoreCase(location.state);
                    if (value == 0) {
                        value = country.compareToIgnoreCase(location.country);
                        if (value == 0) {
                            value = street.compareToIgnoreCase(location.street);
                            if (value == 0) {
                                value = identifier.compareToIgnoreCase(location.identifier);
                                if (value == 0) {
                                    value = district.compareToIgnoreCase(location.district);
                                    if (value == 0) {
                                        value = zip.compareToIgnoreCase(location.zip);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return value;
    }

    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj
    ) {
        return obj instanceof Rateable && equals((Rateable) obj);
    }

    /**
     *
     * @param rateable
     * @return
     */
    @Override
    public boolean equals(Rateable rateable
    ) {
        return rateable instanceof Location && equals((Location) rateable);
    }

    /**
     *
     * @param location
     * @return
     */
    public boolean equals(Location location) {
        return location != null && name.equalsIgnoreCase(location.name) && street.equalsIgnoreCase(location.street)
                && identifier.equalsIgnoreCase(location.identifier) && district.equalsIgnoreCase(location.district)
                && zip.equalsIgnoreCase(location.zip) && city.equalsIgnoreCase(location.city) && county.equalsIgnoreCase(location.county)
                && state.equalsIgnoreCase(location.state) && country.equalsIgnoreCase(location.country);
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + name + " (" + city + " - " + state + ")";
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        if (name == null || name.equals("")) {
            throw new RuntimeException("Location name must not be null!!!");
        }
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getStreet() {
        return street;
    }

    /**
     *
     * @param street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     *
     * @return
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     *
     * @param identifier
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     *
     * @return
     */
    public String getDistrict() {
        return district;
    }

    /**
     *
     * @param district
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     *
     * @return
     */
    public String getZip() {
        return zip;
    }

    /**
     *
     * @param zip
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     *
     * @return
     */
    public String getCity() {
        return city;
    }

    /**
     *
     * @param city
     */
    public void setCity(String city) {
        if (city == null || city.equals("")) {
            throw new RuntimeException("City must not be null!!!");
        }
        this.city = city;
    }

    /**
     *
     * @return
     */
    public String getCounty() {
        return county;
    }

    /**
     *
     * @param county
     */
    public void setCounty(String county) {
        this.county = county;
    }

    /**
     *
     * @return
     */
    public String getState() {
        return state;
    }

    /**
     *
     * @param state
     */
    public void setState(String state) {
        if (state == null || state.equals("")) {
            throw new RuntimeException("State must not be null!!!");
        }
        this.state = state;
    }

    /**
     *
     * @return
     */
    public String getCountry() {
        return country;
    }

    /**
     *
     * @param country
     */
    public void setCountry(String country) {
        if (country == null || country.equals("")) {
            throw new RuntimeException("Country must not be null!!!");
        }
        this.country = country;
    }
    
}
