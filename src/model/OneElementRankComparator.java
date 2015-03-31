/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Comparator;

/**
 *
 * @author Adriano Henrique Rossette Leite <adrianohrl@gmail.com>
 * @param <E>
 */
public class OneElementRankComparator<E extends Rateable> implements Comparator<OneElementRank<E>> {

    /**
     * 
     * @param element1
     * @param element2
     * @return 
     */
    @Override
    public int compare(OneElementRank<E> element1, OneElementRank<E> element2) {
        return compare(element1.getRated(), element2.getRated());
    }
    
    /**
     * 
     * @param rated1
     * @param rated2
     * @return 
     */
    private int compare(E rated1, E rated2) {
        return rated1.compareTo(rated2);
    }
    
}
