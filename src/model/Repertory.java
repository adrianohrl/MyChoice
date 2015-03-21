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
 * @author Adriano Henrique Rossette Leite <adrianohrl@gmail.com>
 */
public class Repertory implements Rateable<Repertory> {
    
    /** */
    private int rate = 0;
    /** */
    private List<Respondent> respondents = new ArrayList<>();
    /** */
    private List<Music> musics = new ArrayList<>();

    /**
     * 
     */
    public Repertory() {
    }

    /**
     * 
     * @param repository
     * @return 
     */
    @Override
    public int compareTo(Repertory repository) {
        return rate - repository.rate;
    }

    /**
     * 
     * @return 
     */
    @Override
    public int getRate() {
        return rate;
    }

    /**
     * 
     * @param rate 
     */
    @Override
    public void setRate(int rate) {
        this.rate = rate;
    }

    /**
     * 
     * @return 
     */
    @Override
    public List<Respondent> getRespondents() {
        return respondents;
    }

    /**
     * 
     * @param respondents 
     */
    @Override
    public void setRespondents(List<Respondent> respondents) {
        this.respondents = respondents;
    }

    /**
     * 
     * @return 
     */
    public List<Music> getMusics() {
        return musics;
    }

    /**
     * 
     * @param musics 
     */
    public void setMusics(List<Music> musics) {
        this.musics = musics;
    }
    
}
