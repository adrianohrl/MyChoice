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
    private OneElementRank<Event> globalRank = new OneElementRank<>(this);

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
        this.setLocation(location);
        this.audience = new Audience();
    }

    /**
     * 
     * @param location
     * @param date 
     */
    public Event(Location location, Calendar date) {
        this(location);
        this.setDate(date);
    }

    /**
     * 
     * @param location
     * @param dayOfMonth
     * @param month
     * @param year 
     */
    public Event(Location location, int dayOfMonth, int month, int year) {
        this(location, new GregorianCalendar(year, month, dayOfMonth));
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
     * @param location
     * @param dayOfMonth
     * @param month
     * @param year
     * @param participations 
     */
    public Event(Location location, int dayOfMonth, int month, int year, List<Participation> participations) {
        this(location, dayOfMonth, month, year);
        this.participations = participations;
    }

    /**
     * 
     * @param event
     * @return 
     */
    @Override
    public int compareTo(Event event) {
        int value = date.compareTo(event.date);
        if (value == 0) {
            value = location.compareTo(event.location);
        }
        return value;
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
        if (date.get(Calendar.YEAR) == 0) {
            throw new RuntimeException("Year must be greater than zero!!!");
        } else if (date.get(Calendar.MONTH) > 11) {
            throw new RuntimeException("Month must be less than twelve!!!");
        } else if (date.get(Calendar.DAY_OF_MONTH) == 0) {
            throw new RuntimeException("Day of month must be greater than zero!!!");
        }
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
        if (location == null) {
            throw new RuntimeException("Location must not be null!!!");
        }
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
    public OneElementRank<Event> getGlobalRank() {
        return globalRank;
    }

    /**
     * 
     * @param globalRank 
     */
    @Override
    public void setGlobalRank(OneElementRank globalRank) {
        if (globalRank.getRated() instanceof Event) {
            this.globalRank = globalRank;
        }
    }
    
}
