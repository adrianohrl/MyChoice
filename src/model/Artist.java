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
public interface Artist<T extends Rateable> extends Rateable<T> {
    
    /**
     * 
     * @return 
     */
    public abstract boolean isPerforming();
    
    /**
     * 
     * @param performing 
     */
    public abstract void setPerforming(boolean performing);
    
}
