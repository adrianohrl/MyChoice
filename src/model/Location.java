/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adriano Henrique Rossette Leite <adrianohrl@gmail.com>
 */
public class Location implements Rateable<Location> {

    /** */
    private String name;
    /** */
    private String street = "";
    /** */
    private String identifier = "";
    /** */
    private String district = "";
    /** */
    private String zip = "";
    /** */
    private String city;
    /** */
    private String county = "";
    /** */
    private String state;
    /** */
    private String country;
    /** */
    private int rate = 0;
    /** */
    private List<Rating> ratings = new ArrayList<>();

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
        this.name = name;
        this.city = city;
        this.state = state;
        this.country = country;
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
        return rate - location.rate;
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
        this.country = country;
    }

    /**
     * 
     * @return 
     */
    @Override
    public int getRate() {
        return rate;
    }

    /**
     * 
     * @param rate 
     */
    @Override
    public void setRate(int rate) {
        this.rate = rate;
    }

    /**
     * 
     * @return 
     */
    @Override
    public List<Rating> getRatings() {
        return ratings;
    }

    /**
     * 
     * @param ratings 
     */
    @Override
    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

}
