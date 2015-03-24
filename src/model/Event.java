/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author Adriano Henrique Rossette Leite <adrianohrl@gmail.com>
 */
public class Event implements Rateable<Event> {
    
    /** */
    private Calendar date = new GregorianCalendar();
    /** */
    private Location location;
    /** */
    private Audience audience;
    /** */
    private List<Participation> participations = new ArrayList<>();
    /** */
    private int rate = 0;
    /** */
    private List<Rating> ratings = new ArrayList<>();

    /**
     * 
     */
    public Event() {
    }

    /**
     * 
     * @param location 
     */
    public Event(Location location) {
        this.location = location;
        this.audience = new Audience();
    }

    /**
     * 
     * @param location
     * @param date 
     */
    public Event(Location location, Calendar date) {
        this(location);
        this.date = date;
    }

    /**
     * 
     * @param location
     * @param date
     * @param participations 
     */
    public Event(Location location, Calendar date, List<Participation> participations) {
        this(location, date);
        this.participations = participations;
    }

    /**
     * 
     */
    @Override
    public void recalculateRate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * 
     * @param event
     * @return 
     */
    @Override
    public int compareTo(Event event) {
        return rate - event.rate;
    }
    
    /**
     * 
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj) {
       return obj instanceof Rateable && equals((Rateable) obj); 
    }

    /**
     * 
     * @param rateable
     * @return 
     */
    @Override
    public boolean equals(Rateable rateable) {
        return rateable instanceof Event && equals((Event) rateable);
    }
    
    /**
     * 
     * @param event
     * @return 
     */
    public boolean equals(Event event) {
        return event != null && date.equals(event.date) && location.equals(event.location);
    }

    /**
     * 
     * @return 
     */
    public Calendar getDate() {
        return date;
    }

    /**
     * 
     * @param date 
     */
    public void setDate(Calendar date) {
        this.date = date;
    }

    /**
     * 
     * @return 
     */
    public Location getLocation() {
        return location;
    }

    /**
     * 
     * @param location 
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * 
     * @return 
     */
    public Audience getAudience() {
        return audience;
    }

    /**
     * 
     * @param audience 
     */
    public void setAudience(Audience audience) {
        this.audience = audience;
    }

    /**
     * 
     * @return 
     */
    public List<Participation> getParticipations() {
        return participations;
    }

    /**
     * 
     * @param participations 
     */
    public void setParticipations(List<Participation> participations) {
        this.participations = participations;
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
