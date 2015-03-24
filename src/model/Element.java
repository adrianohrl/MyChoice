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
public class Element <E extends Rateable> implements Comparable<Element> {
    
    private E element;
    /** */
    private int position;
    /** */
    private int rate = 0;
    /** */
    private List<Rating<E>> ratings = new ArrayList<>();

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
    public Element(E element, int position, int rate, List<Rating<E>> ratings) {
        this.element = element;
        this.position = position;
        this.rate = rate;
        this.ratings = ratings; // according to the element
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
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj) {
        return obj instanceof Element && this.equals((Element) element);
    }
    
    /**
     * 
     * @param element
     * @return 
     */
    public boolean equals(Element element) {
        return this.element.equals(element);
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
    public List<Rating<E>> getRatings() {
        return ratings;
    }

    /**
     * 
     * @param ratings 
     */
    public void setRatings(List<Rating<E>> ratings) {
        this.ratings = ratings;
    }
    
}
