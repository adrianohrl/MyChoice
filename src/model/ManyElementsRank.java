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
public class ManyElementsRank<E extends Rateable> extends Rank<E>  {
    
    /** */
    private OneElementRank<OneElementRank<E>> elements = new OneElementRank<>();
    
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
        
    }

    /**
     * 
     * @return 
     */
    public OneElementRank<OneElementRank<E>> getElements() {
        return elements;
    }

    /**
     * 
     * @param elements 
     */
    public void setElements(OneElementRank<OneElementRank<E>> elements) {
        this.elements = elements;
    }
    
}
