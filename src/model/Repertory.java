/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author Adriano Henrique Rossette Leite <adrianohrl@gmail.com>
 */
public class Repertory implements Rateable<Repertory> {
    
    /** */
    private Calendar createdOn = new GregorianCalendar();
    /** */
    private List<Music> musics = new ArrayList<>();

    /**
     * 
     */
    public Repertory() {
    }
    
    /**
     * 
     * @param musics 
     */
    public Repertory(List<Music> musics) {
        this.musics = musics;
    }

    /**
     * 
     * @param repository
     * @return 
     */
    @Override
    public int compareTo(Repertory repository) {
        return createdOn.compareTo(repository.createdOn);
    }

    /**
     * 
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj) {
        return obj instanceof Rateable && equals((Rateable) obj);
    }

    /**
     * 
     * @param rateable
     * @return 
     */
    @Override
    public boolean equals(Rateable rateable) {
        return rateable instanceof Repertory && equals((Repertory) rateable);
    }
    
    /**
     * 
     * @param repertory
     * @return 
     */
    public boolean equals(Repertory repertory) {
        if (repertory == null) {
            return false;
        }
        if (musics.size() != repertory.musics.size()) {
            return false;
        }
        for (int i = 0; i < musics.size(); i++) {
            Music music = musics.get(i);
            if (!music.equals(repertory.musics.get(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * 
     * @return 
     */
    public Calendar getCreatedOn() {
        return createdOn;
    }

    /**
     * 
     * @param createdOn 
     */
    public void setCreatedOn(Calendar createdOn) {
        this.createdOn = createdOn;
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
