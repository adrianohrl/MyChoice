/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Adriano Henrique Rossette Leite <adrianohrl@gmail.com>
 * @param <T>
 */
public interface Rateable<T> extends Comparable<T> {
    
    /**
     * 
     * @param obj
     * @return 
     */
    @Override
    public abstract boolean equals(Object obj);
    
    /**
     * 
     * @param rateable
     * @return 
     */
    public abstract boolean equals(Rateable rateable);
    
}
