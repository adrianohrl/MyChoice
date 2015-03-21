/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adriano Henrique Rossette Leite <adrianohrl@gmail.com>
 */
public class Music implements Rateable<Music> {
    
    /** */
    private String title;
    /** */
    private String album = "";
    /** */
    private String genre = "";
    /** */
    private Artist artist;
    /** */
    private Duration duration = Duration.ZERO;
    /** */
    private int rate = 0;
    /** */
    private List<Rating> ratings = new ArrayList<>();

    /**
     * 
     */
    public Music() {
    }

    /**
     * 
     * @param title
     * @param artist 
     */
    public Music(String title, Artist artist) {
        this.title = title;
        this.artist = artist;
    }

    /**
     * 
     * @param title
     * @param album
     * @param genre
     * @param artist 
     */
    public Music(String title, String album, String genre, Artist artist) {
        this(title, artist);
        this.album = album;
        this.genre = genre;
    }

    /**
     * 
     * @param title
     * @param album
     * @param genre
     * @param artist
     * @param duration 
     */
    public Music(String title, String album, String genre, Artist artist, Duration duration) {
        this(title, album, genre, artist);
        this.duration = duration;
    }

    /**
     * 
     * @param title
     * @param album
     * @param genre
     * @param artist
     * @param minutes
     * @param seconds 
     */
    public Music(String title, String album, String genre, Artist artist, int minutes, int seconds) {
        this(title, album, genre, artist, Duration.ofSeconds(seconds + 60 * minutes));
    }
    
    /**
     * 
     * @param music
     * @return 
     */
    @Override
    public int compareTo(Music music) {
        return rate - music.rate;
    }

    /**
     * 
     * @return 
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title 
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return 
     */
    public String getAlbum() {
        return album;
    }

    /**
     * 
     * @param album 
     */
    public void setAlbum(String album) {
        this.album = album;
    }

    /**
     * 
     * @return 
     */
    public String getGenre() {
        return genre;
    }

    /**
     * 
     * @param genre 
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * 
     * @return 
     */
    public Artist getArtist() {
        return artist;
    }

    /**
     * 
     * @param artist 
     */
    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    /**
     * 
     * @return 
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * 
     * @param duration 
     */
    public void setDuration(Duration duration) {
        this.duration = duration;
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
