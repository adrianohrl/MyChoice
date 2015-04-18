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
        if (element == null) {
            return;
        }
        if (contains(element)) {
            remove(element);
        } 
        elements.add(element);
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
        E old = get(element);
        elements.remove(old);
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
        for (E e : elements) {
            if (e.equals(element))
            {
                return true;
            }
        }
        return false;
    }
    
    /**
     * 
     * @param rank
     * @return 
     */
    public boolean check(Rank<E> rank) {
        Iterator<E> it1 = iterator();
        Iterator<E> it2 = rank.iterator();
        while (true) {
            E e1 = it1.hasNext() ? it1.next() : null;
            E e2 = it2.hasNext() ? it2.next() : null;
            if (e1 == null && e2 == null) {
                return true;
            } else if (e1 == null || e2 == null || !e1.equals(e2)) {
                return false;
            }
        }
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
