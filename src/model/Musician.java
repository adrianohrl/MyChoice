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
public class Musician extends User implements Rateable<Musician>, Artist {
    
    /** */
    private int ability = 0;
    /** */
    private boolean performing = false;
    /** */
    private int rate = 0;
    /** */
    private List<Respondent> respondents = new ArrayList<>();
    /** */
    private List<Equipment> equipments = new ArrayList<>();
    /** */
    private List<Repertory> repertories = new ArrayList<>();

    /**
     * 
     */
    public Musician() {
    }

    /**
     * 
     * @param name
     * @param nickname
     * @param email 
     */
    public Musician(String name, String nickname, String email) {
        super(name, nickname, email);
    }

    /**
     * 
     * @param musician
     * @return 
     */
    @Override
    public int compareTo(Musician musician) {
        return rate - musician.rate;
    }

    /**
     * 
     * @return 
     */
    public int getAbility() {
        return ability;
    }

    /**
     * 
     * @param ability 
     */
    public void setAbility(int ability) {
        this.ability = ability;
    }

    /**
     * 
     * @return 
     */
    @Override
    public boolean isPerforming() {
        return performing;
    }

    /**
     * 
     * @param performing 
     */
    @Override
    public void setPerforming(boolean performing) {
        this.performing = performing;
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
    public List<Equipment> getEquipments() {
        return equipments;
    }

    /**
     * 
     * @param equipments 
     */
    public void setEquipments(List<Equipment> equipments) {
        this.equipments = equipments;
    }

    /**
     * 
     * @return 
     */
    public List<Repertory> getRepertories() {
        return repertories;
    }

    /**
     * 
     * @param repertories 
     */
    public void setRepertories(List<Repertory> repertories) {
        this.repertories = repertories;
    }
    
}
