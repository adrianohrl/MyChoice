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
 */
public class RespondentComparator implements Comparator<Respondent> {

    /**
     * 
     * @param respondent1
     * @param respondent2
     * @return 
     */
    @Override
    public int compare(Respondent respondent1, Respondent respondent2) {
        if (respondent1 instanceof User && respondent2 instanceof User) {
            return compare((User) respondent1, (User) respondent2);
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    /**
     * 
     * @param user1
     * @param user2
     * @return 
     */
    private int compare(User user1, User user2) {
        return user1.compareTo(user2);
    }
    
}
