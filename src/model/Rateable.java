/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author adriano
 * @param <T>
 */
public interface Rateable<T> extends Comparable<T> {
    
    /**
     * 
     * @return 
     */
    public abstract int getRate();
    
    /**
     * 
     * @param rate 
     */
    public abstract void setRate(int rate);
    
    /**
     * 
     * @return 
     */
    public abstract List<Respondent> getRespondents();
    
    /**
     * 
     * @param respondents 
     */
    public abstract void setRespondents(List<Respondent> respondents);
    
}
