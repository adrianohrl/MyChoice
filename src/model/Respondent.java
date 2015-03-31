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
public interface Respondent<T> extends Comparable<T> {
    
    /**
     * 
     * @param rated
     * @param rate
     * @param comment
     * @return 
     */
    public abstract Rating rate(Rateable rated, int rate, String comment);
    
}
