/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author Adriano Henrique Rossette Leite <adrianohrl@gmail.com>
 * @param <E>
 */
public class ManyElementsRank<E extends Rateable> extends Rank<OneElementRank<E>>  {
    
    /**
     * 
     */
    public ManyElementsRank() {
    }
    
    /**
     * 
     * @param ratings 
     */
    public ManyElementsRank(List<Rating<E>> ratings) {
        for (Rating<E> rating : ratings) {
            add(rating);
        }
    }
    
    /**
     * 
     * @param rating 
     */
    public void add(Rating<E> rating) {
        OneElementRank<E> element = new OneElementRank<>(rating.getRated());
        if (super.contains(element)) {
            element = get(element);
            super.remove(element);
            element.add(rating);
            super.add(element);
        } else {
            element.add(rating);
            super.add(element);
        }
    }
    
}
