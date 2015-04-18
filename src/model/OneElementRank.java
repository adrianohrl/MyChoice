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
public class OneElementRank<E extends Rateable> extends Rank<Rating<E>> implements Comparable<OneElementRank<E>> {

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
            if (!rating.isValid()) {
                if (super.contains(rating)) {
                    super.remove(rating);
                }
            } else {
                super.add(rating);
            }
            if (!super.isEmpty()) {
                updateGlobalRate();
            }
        }
    }
    
    /**
     * 
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj) {
        return obj instanceof OneElementRank && equals((OneElementRank) obj);
    }
    
    /**
     * 
     * @param oneElementRank
     * @return 
     */
    public boolean equals(OneElementRank oneElementRank) {
        return oneElementRank != null && rated.equals(oneElementRank.rated); // && globalRate == oneElementRank.globalRate
    }

    /**
     * 
     * @param oneElementRank
     * @return 
     */
    @Override
    public int compareTo(OneElementRank<E> oneElementRank) {
        if (rated.equals(oneElementRank.rated)) {
            return 0;
        }
        Double d = oneElementRank.globalRate;
        int value = d.compareTo(globalRate);
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
        globalRate = sum;
        if (counter > 0) {
            globalRate /= counter;
        }
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        String str = "\n" + rated.toString() + " (" + globalRate + " / " + getElements().size() + ")";
        int counter = 0;
        for (Rating<E> rating : getElements()) {
            str += "\n(" + ++counter + ")\t" + rating;
        }
        return str;
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

}
