/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/**
 *
 * @author Adriano Henrique Rossette Leite <adrianohrl@gmail.com>
 * @param <E>
 */
public class Rank<E extends Rateable> {
    
    /** */
    private final RankComparator<E> comparator = new RankComparator<>();
    private TreeSet<Element<E>> elements = new TreeSet(comparator);

    /**
     * 
     */
    public Rank() {
    }

    /**
     * 
     * @param ratings 
     */
    public Rank(List<Rating<E>> ratings) {
        //create elements given all ratings
        sort();
    }
    
    /**
     * 
     */
    private void sort() {
    }
    
    /**
     * 
     * @param rating
     */
    public void add(Rating<E> rating) {
        //elements.add(rating);
        sort();
    }
    
    /**
     * 
     * @param element
     */
    public void add(Element<E> element) {
        elements.add(element);
        sort();
    }
    
    /**
     * 
     * @return 
     */
    public Element<E> getHighest() {
        return elements.last();
    }
    
    /**
     * 
     * @return 
     */
    public int size() {
        return elements.size();
    }
    
    /**
     * 
     * @return 
     */
    public boolean isEmpty() {
        return elements.isEmpty();
    }
    
    /**
     * 
     * @return 
     */
    public Iterator iterator() {
        return elements.descendingIterator();
    }

    /**
     * 
     * @return 
     */
    public TreeSet<Element<E>> getElements() {
        return elements;
    }

    /**
     * 
     * @param elements 
     */
    public void setElements(TreeSet<Element<E>> elements) {
        this.elements = elements;
    }
    
}
