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
public class Participation implements Rateable<Participation> {
    
    /** */
    private Artist artist;
    /** */
    private Calendar initialDate = new GregorianCalendar();
    /** */
    private Calendar finalDate;
    /** */
    private Event event;
    /** */
    private OneElementRank<Participation> globalRank = new OneElementRank<>(this);

    /**
     * 
     */
    public Participation() {
    }

    /**
     * 
     * @param artist
     * @param finalDate
     * @param event 
     */
    public Participation(Artist artist, Calendar finalDate, Event event) {
        this.setArtist(artist);
        this.setFinalDate(finalDate);
        this.setEvent(event);
    }  
    
    /**
     * 
     * @param artist
     * @param initialDate
     * @param finalDate
     * @param event 
     */
    public Participation(Artist artist, Calendar initialDate, Calendar finalDate, Event event) {
        this(artist, finalDate, event);
        this.setInitialDate(initialDate);
    } 

    /**
     * 
     * @param participation
     * @return 
     */
    @Override
    public int compareTo(Participation participation) {
        int value = event.compareTo(event);
        if (value == 0) {
            value = initialDate.compareTo(participation.initialDate);
            if (value == 0) {
                value = artist.compareTo(participation.artist);
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
        return rateable instanceof Participation && equals((Participation) rateable);
    }
    
    /**
     * 
     * @param participation
     * @return 
     */
    public boolean equals(Participation participation) {
        return participation != null && artist.equals(participation.artist) && 
                initialDate.equals(participation.initialDate) && event.equals(participation.event);
    }

    /**
     * 
     * @return 
     */
    public Artist getArtist() {
        return artist;
    }

    /**
     * 
     * @param artist 
     */
    public void setArtist(Artist artist) {
        if (artist == null) {
            throw new RuntimeException("Participation artist must not be null!!!");
        }
        this.artist = artist;
    }

    /**
     * 
     * @return 
     */
    public Calendar getInitialDate() {
        return initialDate;
    }

    /**
     * 
     * @param initialDate 
     */
    public void setInitialDate(Calendar initialDate) {
        if (initialDate == null) {
            throw new RuntimeException("Participation initial date must not be null!!!");
        } else if (finalDate != null && initialDate.compareTo(finalDate) < 0) {
            throw new RuntimeException("Participation initial date must be less than its final date!!!");
        }
        this.initialDate = initialDate;
    }

    /**
     * 
     * @return 
     */
    public Calendar getFinalDate() {
        return finalDate;
    }

    /**
     * 
     * @param finalDate 
     */
    public void setFinalDate(Calendar finalDate) {
        if (finalDate == null) {
            throw new RuntimeException("Participation final date must not be null!!!");
        } else if (initialDate != null && initialDate.compareTo(finalDate) < 0) {
            throw new RuntimeException("Participation final date must be less than its initial date!!!");
        }
        this.finalDate = finalDate;
    }

    /**
     * 
     * @return 
     */
    public Event getEvent() {
        return event;
    }

    /**
     * 
     * @param event 
     */
    public void setEvent(Event event) {
        if (event == null) {
            throw new RuntimeException("Participation event must not be null!!!");
        }
        this.event = event;
    }

    /**
     * 
     * @return 
     */
    @Override
    public OneElementRank<Participation> getGlobalRank() {
        return globalRank;
    }

    /**
     * 
     * @param globalRank 
     */
    @Override
    public void setGlobalRank(OneElementRank globalRank) {
        if (globalRank.getRated() instanceof Participation) {
            this.globalRank = globalRank;
        }
    }
    
}
