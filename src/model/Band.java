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
public class Band extends Group<Musician> implements Rateable<Band>, Artist {
    
    /** */
    private String name;
    /** */
    private boolean performing = false;
    /** */
    private int rate = 0;
    /** */
    private List<Rating> ratings = new ArrayList<>();
    /** */
    private List<Repertory> repertories = new ArrayList<>();

    /**
     * 
     */
    public Band() {
    }

    /**
     * 
     * @param name 
     */
    public Band(String name) {
        this.name = name;
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
     * @param band
     * @return 
     */
    @Override
    public int compareTo(Band band) {
        return rate - band.rate;
    }
    
    /**
     * 
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj) {
        return obj instanceof Rateable && this.equals((Rateable) obj);
    }

    /**
     * 
     * @param rateable
     * @return 
     */
    @Override
    public boolean equals(Rateable rateable) {
        return rateable instanceof Band && equals((Band) rateable);
    }
    
    /**
     * 
     * @param band
     * @return 
     */
    public boolean equals(Band band) {
        return band != null && name.equalsIgnoreCase(band.name);
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
    @Override
    public boolean isPerforming() {
        return performing;
    }

    /**
     * 
     * @return 
     */
    public List<Repertory> getRepertories() {
        return repertories;
    }

    /**
     * 
     * @param repertories 
     */
    public void setRepertories(List<Repertory> repertories) {
        this.repertories = repertories;
    }

    /**
     * 
     * @param performing 
     */
    @Override
    public void setPerforming(boolean performing) {
        for (Musician member : super.getMembers()) {
            member.setPerforming(performing);;
        }
        this.performing = performing;
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
