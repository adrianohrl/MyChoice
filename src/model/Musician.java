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
public class Musician extends User implements Rateable<Musician>, Performer {
    
    private int ability = 0;
    private int rate = 0;
    private List<Respondent> respondents = new ArrayList<>();
    private List<Equipment> equipments = new ArrayList<>();
    private List<Repertory> repertories = new ArrayList<>();

    public Musician() {
    }

    public Musician(String name, String nickname, String email) {
        super(name, nickname, email);
    }

    @Override
    public int compareTo(Musician musician) {
        return rate - musician.rate;
    }

    public int getAbility() {
        return ability;
    }

    public void setAbility(int ability) {
        this.ability = ability;
    }

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

    public List<Equipment> getEquipments() {
        return equipments;
    }

    public void setEquipments(List<Equipment> equipments) {
        this.equipments = equipments;
    }

    public List<Repertory> getRepertories() {
        return repertories;
    }

    public void setRepertories(List<Repertory> repertories) {
        this.repertories = repertories;
    }
    
}
