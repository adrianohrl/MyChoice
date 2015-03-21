/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Adriano Henrique Rossette Leite <adrianohrl@gmail.com>
 * @param <E>
 */
public class Rank<E extends Rateable> {
    
    /** */
    /*talvez usar um TreeSet*/
    private List<Element<E>> elements = new ArrayList<>();

    /**
     * 
     */
    public Rank() {
    }

    /**
     * 
     * @param elements
     * @param rates
     * @param respondents 
     */
    public Rank(List<E> elements, List<Integer> rates, List<List<Respondent>> respondents) {
        int numberOfElements = elements.size();
        if (rates.size() != numberOfElements && respondents.size() != numberOfElements) {
            return;
        }
        for (int i = 0; i < numberOfElements; i++) {
            Element<E> element = new Element<>(elements.get(i), i, rates.get(i), respondents.get(i));
            this.elements.add(element);
        }
        sort();
    }
    
    /**
     * 
     */
    private void sort() {
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
     * @param index
     * @return 
     */
    public Element<E> get(int index) {
        return elements.get(index);
    }
    
    /**
     * 
     * @param index
     * @return 
     */
    public Element<E> remove(int index) {
        return elements.remove(index);
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
        return elements.iterator();
    }

    /**
     * 
     * @return 
     */
    public List<Element<E>> getElements() {
        return elements;
    }

    /**
     * 
     * @param elements 
     */
    public void setElements(List<Element<E>> elements) {
        this.elements = elements;
    }
    
}
