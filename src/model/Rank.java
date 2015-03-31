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
public class Rank<E extends Comparable> {

    /** */
    private TreeSet<E> elements = new TreeSet();

    /**
     *
     */
    public Rank() {
    }

    /**
     *
     * @param element
     */
    public void add(E element) {
        if (element != null && !elements.add(element)) {
            elements.remove(element);
            elements.add(element);
        }
    }
    
    /**
     * 
     * @param clone 
     */
    public E get(E clone) {
        for (E element : elements) {
            if (element.equals(clone)) {
                return element;
            }
        }
        return null;
    }
    
    /**
     * 
     * @param element 
     */
    public void remove(E element) {
        elements.remove(element);
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
    public Iterator<E> iterator() {
        return elements.iterator();
    }
    
    /**
     * 
     * @param element
     * @return 
     */
    public boolean contains(E element) {
        return elements.contains(element);
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        String str = "Sorted Rank: ";
        int counter = 0;
        for (E element : elements) {
            str += "\nPosition: " + ++counter + "\n" + element;
        }
        return str;
    }

    /**
     *
     * @return
     */
    public TreeSet<E> getElements() {
        return elements;
    }

    /**
     *
     * @param elements
     */
    public void setElements(TreeSet<E> elements) {
        this.elements = elements;
    }

}
