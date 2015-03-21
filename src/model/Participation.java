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
    private int rate = 0;
    /** */
    private List<Respondent> respondents = new ArrayList<>();

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
        this.artist = artist;
        this.finalDate = finalDate;
        this.event = event;
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
        this.initialDate = initialDate;
    } 

    /**
     * 
     * @param participation
     * @return 
     */
    @Override
    public int compareTo(Participation participation) {
        return rate - participation.rate;
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
        this.event = event;
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
    public List<Respondent> getRespondents() {
        return respondents;
    }

    /**
     * 
     * @param respondents 
     */
    @Override
    public void setRespondents(List<Respondent> respondents) {
        this.respondents = respondents;
    }
    
}
