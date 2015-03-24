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
    private List<Music> musics = new ArrayList<>();
    /** */
    private int rate = 0;
    /** */
    private List<Rating> ratings = new ArrayList<>();

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
     */
    @Override
    public void recalculateRate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    public List<Rating> getRatings() {
        return ratings;
    }

    /**
     * 
     * @param ratings 
     */
    @Override
    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }
    
}
