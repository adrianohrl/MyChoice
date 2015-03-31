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
public class Listener<T extends Listener> extends User implements Respondent<T> {

    /**
     * 
     */
    public Listener() {
    }

    /**
     * 
     * @param name
     * @param nickname
     * @param email 
     */
    public Listener(String name, String nickname, String email) {
        super(name, nickname, email);
    }

    /**
     * 
     * @param rated
     * @param rate
     * @param comment
     * @return 
     */
    @Override
    public Rating rate(Rateable rated, int rate, String comment) {
        return new Rating(rate, comment, this, rated);
    }
    
    /**
     * 
     * @param user
     * @return 
     */
    @Override
    public boolean equals(User user) {
        return user instanceof Listener && equals((Listener) user);
    }
    
    /**
     * 
     * @param listener
     * @return 
     */
    public boolean equals(Listener listener) {
        return super.equals(listener);
    }

    /**
     * 
     * @param listener
     * @return 
     */
    @Override
    public int compareTo(Listener listener) {
        return super.compareTo(listener);
    }
    
}
