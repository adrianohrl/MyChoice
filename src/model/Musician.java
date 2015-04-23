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
public class Musician extends Listener<Musician> implements Rateable<Musician>, Artist<Musician> {
    
    /** */
    private int ability = 0;
    /** */
    private boolean performing = false;
    /** */
    private List<Equipment> equipments = new ArrayList<>();
    /** */
    private List<Repertory> repertories = new ArrayList<>();
    /** */
    private String about = "";

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
    public int compareTo(Musician musician) {
        return super.compareTo(musician);
    }

    /**
     * 
     * @param rateable
     * @return 
     */
    @Override
    public boolean equals(Rateable rateable) {
        return rateable instanceof Musician && equals((Musician) rateable);
    }
    
    /**
     * 
     * @param listener
     * @return 
     */
    @Override
    public boolean equals(Listener listener) {
        return listener instanceof Musician && equals((Musician) listener);
    }
    
    /**
     * 
     * @param musician
     * @return 
     */
    public boolean equals(Musician musician) {
        return super.equals(musician) && ability == musician.ability;
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

    /**
     * 
     * @return 
     */
    @Override
    public String getAbout() {
        return about;
    }

    /**
     * 
     * @param about 
     */
    @Override
    public void setAbout(String about) {
        this.about = about;
    }
    
}
