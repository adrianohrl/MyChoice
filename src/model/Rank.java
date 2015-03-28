/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Adriano Henrique Rossette Leite <adrianohrl@gmail.com>
 * @param <E>
 */
public class Rank<E extends Rateable> {

    /**
     *      */
    private TreeSet<Rating<E>> ratings = new TreeSet();

    /**
     *
     */
    public Rank() {
    }

    /**
     *
     * @param rating
     */
    public void add(Rating<E> rating) {
        if (!rating.isValid()) {
            if (ratings.contains(rating)) {
                ratings.remove(rating);
            }
        } else if (!ratings.add(rating)) {
            ratings.remove(rating);
            ratings.add(rating);
        }
    }

    /**
     *
     * @return
     */
    public int size() {
        return ratings.size();
    }

    /**
     *
     * @return
     */
    public boolean isEmpty() {
        return ratings.isEmpty();
    }

    /**
     *
     * @return
     */
    public Iterator<Rating<E>> iterator() {
        return ratings.iterator();
    }

    /**
     *
     * @return
     */
    public TreeSet<Rating<E>> getRatings() {
        return ratings;
    }

    /**
     *
     * @param ratings
     */
    public void setRatings(TreeSet<Rating<E>> ratings) {
        this.ratings = ratings;
    }

}
