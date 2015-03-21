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
 * @param <E>
 */
public class Element <E extends Rateable> implements Rateable<Element> {
    
    /** */
    private E element;
    /** */
    private int position;
    /** */
    private int rate;
    /** */
    private List<Rating> ratings = new ArrayList<>();

    /**
     * 
     */
    public Element() {
    }

    /**
     * 
     * @param element
     * @param position
     * @param rate 
     * @param ratings 
     */
    public Element(E element, int position, int rate, List<Rating> ratings) {
        this.element = element;
        this.position = position;
        this.rate = rate;
        this.ratings = ratings;
    }

    /**
     * 
     * @param element
     * @return 
     */
    @Override
    public int compareTo(Element element) {
        return rate - element.getRate();
    }

    /**
     * 
     * @return 
     */
    public E getElement() {
        return element;
    }

    /**
     * 
     * @param element 
     */
    public void setElement(E element) {
        this.element = element;
    }

    /**
     * 
     * @return 
     */
    public int getPosition() {
        return position;
    }

    /**
     * 
     * @param position 
     */
    public void setPosition(int position) {
        this.position = position;
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
