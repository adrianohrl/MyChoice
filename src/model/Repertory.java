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
 */
public class Repertory implements Rateable<Repertory> {
    
    private int rate = 0;
    private List<Respondent> respondents = new ArrayList<>();

    @Override
    public int getRate() {
        return rate;
    }

    @Override
    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public List<Respondent> getRespondents() {
        return respondents;
    }

    @Override
    public void setRespondents(List<Respondent> respondents) {
        this.respondents = respondents;
    }

    @Override
    public int compareTo(Repertory repository) {
        return rate - repository.rate;
    }
    
}
