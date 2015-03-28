/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Iterator;

/**
 *
 * @author Adriano Henrique Rossette Leite <adrianohrl@gmail.com>
 * @param <E>
 */
public class OneElementRank<E extends Rateable> extends Rank<E> implements Rateable<OneElementRank<E>> {

    /** */
    private double globalRate = 0.0;
    /** */
    private E rated;
    
    public OneElementRank() {
    }

    /**
     * 
     * @param rated 
     */
    public OneElementRank(E rated) {
        this.setRated(rated);
    }

    /**
     * 
     * @param rating 
     */
    @Override
    public void add(Rating<E> rating) {
        if (rated.equals(rating.getRated())) {
            super.add(rating);
            updateGlobalRate();
        }
    }
    
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
        return rateable instanceof OneElementRank && equals((OneElementRank) rateable);
    }
    
    /**
     * 
     * @param oneElementRank
     * @return 
     */
    public boolean equals(OneElementRank oneElementRank) {
        return oneElementRank != null && globalRate == oneElementRank.globalRate && rated.equals(oneElementRank.rated);
    }

    /**
     * 
     * @param oneElementRank
     * @return 
     */
    @Override
    public int compareTo(OneElementRank<E> oneElementRank) {
        Double d = globalRate;
        int value = d.compareTo(oneElementRank.globalRate);
        if (value == 0) {
            value = rated.compareTo(oneElementRank.rated);
        }
        return value;
    }

    /**
     * 
     */
    private void updateGlobalRate() {
        Iterator<Rating<E>> it = super.iterator();
        int counter, sum;
        for (counter = 0, sum = 0; it.hasNext(); counter++) {
            Rating<E> rating = it.next();
            sum += rating.getRate();
        }
        globalRate = sum / counter;
    }

    /**
     * 
     * @return 
     */
    public double getGlobalRate() {
        return globalRate;
    }

    /**
     * 
     * @param globalRate 
     */
    public void setGlobalRate(double globalRate) {
        this.globalRate = globalRate;
    }

    /**
     * 
     * @return 
     */
    public E getRated() {
        return rated;
    }

    /**
     * 
     * @param rated 
     */
    public void setRated(E rated) {
        if (rated == null) {
            throw new RuntimeException("One Element Rank rated element must not be null!!!");
        }
        this.rated = rated;
    }

    /**
     * 
     * @return 
     */
    @Override
    public OneElementRank getGlobalRank() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * 
     * @param globalRank 
     */
    @Override
    public void setGlobalRank(OneElementRank globalRank) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
