/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Adriano Henrique Rossette Leite <adrianohrl@gmail.com>
 * @param <T>
 */
public class Rating<T extends Rateable> {
    
    /** */
    private int rate = 0;
    /** */
    private String comment = "";
    /** */
    private Respondent respondent;
    /** */
    private T rated;
    /** */
    private Calendar date = new GregorianCalendar();
    
    /**
     * 
     */
    public Rating() {
    }
    
    /**
     * 
     * @param rate
     * @param respondent
     * @param rated 
     */
    public Rating(int rate, Respondent respondent, T rated) {
        this.rate = rate;
        this.respondent = respondent;
        this.rated = rated;
    }

    /**
     * 
     * @param rate
     * @param comment
     * @param respondent
     * @param rated 
     */
    public Rating(int rate, String comment, Respondent respondent, T rated) {
        this(rate, respondent, rated);
        this.comment = comment;
    }

    /**
     * 
     * @return 
     */
    public int getRate() {
        return rate;
    }

    /**
     * 
     * @param rate 
     */
    public void setRate(int rate) {
        this.rate = rate;
    }

    /**
     * 
     * @return 
     */
    public String getComment() {
        return comment;
    }

    /**
     * 
     * @param comment 
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * 
     * @return 
     */
    public Respondent getRespondent() {
        return respondent;
    }

    /**
     * 
     * @param respondent 
     */
    public void setRespondent(Respondent respondent) {
        this.respondent = respondent;
    }

    /**
     * 
     * @return 
     */
    public T getRated() {
        return rated;
    }

    /**
     * 
     * @param rated 
     */
    public void setRated(T rated) {
        this.rated = rated;
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
    
}
