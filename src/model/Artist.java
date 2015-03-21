/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author adriano
 */
public interface Artist {
    
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
