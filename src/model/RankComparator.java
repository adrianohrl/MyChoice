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
public class RankComparator<E extends Rateable> implements Comparator<Rating<E>> {

    /**
     * 
     * @param element1
     * @param element2
     * @return 
     */
    @Override
    public int compare(Rating<E> element1, Rating<E> element2) {
        return element1.compareTo(element2);
    }
    
}
