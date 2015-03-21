/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adriano
 * @param <T>
 */
public abstract class Group<T extends User> {
    
    /** */
    private List<T> members = new ArrayList<>();

    /**
     * 
     * @return 
     */
    public List<T> getMembers() {
        return members;
    }

    /**
     * 
     * @param members 
     */
    public void setMembers(List<T> members) {
        this.members = members;
    }
    
}
