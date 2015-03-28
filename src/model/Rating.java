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
public class Rating<T extends Rateable> implements Comparable<Rating> {

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
        this.setRate(rate);
        this.setRespondent(respondent);
        this.setRated(rated);
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
    public boolean isValid() {
        return rate != 0;
    }

    /**
     *
     * @param rating
     * @return
     */
    @Override
    public int compareTo(Rating rating) {
        int value = rating.rate - rate;
        if (value == 0) {
            value = rated.compareTo(rating.rated);
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
        return obj instanceof Rating && equals((Rating) obj);
    }

    /**
     *
     * @param rating
     * @return
     */
    public boolean equals(Rating rating) {
        return rating != null && respondent.equals(rating.respondent) && rated.equals(rating.rated);
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
        if (rate < 0) {
            rate = 0;
        } else if (rate > 5) {
            rate = 5;
        }
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
        if (respondent == null) {
            throw new RuntimeException("Respondent must not be null!!!");
        }
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
        if (rated == null) {
            throw new RuntimeException("Rated must not be null!!!");
        }
        this.rated = rated;
        this.rated.getGlobalRank().add(this);
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
