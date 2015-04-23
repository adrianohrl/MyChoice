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
public class Band extends Group<Musician> implements Rateable<Band>, Artist<Band> {
    
    /** */
    private String name;
    /** */
    private boolean performing = false;
    /** */
    private List<Repertory> repertories = new ArrayList<>();
    /** */
    private String about = "";

    /**
     * 
     */
    public Band() {
    }

    /**
     * 
     * @param name 
     */
    public Band(String name) {
        this.setName(name);
    }

    /**
     * 
     * @param band
     * @return 
     */
    @Override
    public int compareTo(Band band) {
        return name.compareToIgnoreCase(band.name);
    }
    
    /**
     * 
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj) {
        return obj instanceof Rateable && this.equals((Rateable) obj);
    }

    /**
     * 
     * @param rateable
     * @return 
     */
    @Override
    public boolean equals(Rateable rateable) {
        return rateable instanceof Band && equals((Band) rateable);
    }
    
    /**
     * 
     * @param band
     * @return 
     */
    public boolean equals(Band band) {
        return band != null && name.equalsIgnoreCase(band.name);
    }

    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + name; // + "(" + globalRank.getGlobalRate() +  ")";
    }

    /**
     * 
     * @return 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name 
     */
    public void setName(String name) {
        if (name == null || name.equals("")) {
            throw new RuntimeException("Band name must not be null!!!");
        }
        this.name = name;
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
     * @param performing 
     */
    @Override
    public void setPerforming(boolean performing) {
        for (Musician member : super.getMembers()) {
            member.setPerforming(performing);
        }
        this.performing = performing;
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
