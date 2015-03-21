/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Adriano Henrique Rossette Leite <adrianohrl@gmail.com>
 */
public class Listener extends User implements Respondent {

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
    
}
