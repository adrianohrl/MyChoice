/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Adriano Henrique Rossette Leite <adrianohrl@gmail.com>
 */
public class Request {

    /** */
    private Listener listener;
    /** */
    private Music music;
    /** */
    private Artist artist;
    /** */
    private Calendar date = new GregorianCalendar();

    /**
     * 
     */
    public Request() {
    }

    /**
     * 
     * @param listener
     * @param music
     * @param artist 
     */
    public Request(Listener listener, Music music, Artist artist) {
        this.listener = listener;
        this.music = music;
        this.artist = artist;
    }

    /**
     * 
     * @return 
     */
    public Listener getListener() {
        return listener;
    }

    /**
     * 
     * @param listener 
     */
    public void setListener(Listener listener) {
        this.listener = listener;
    }

    /**
     * 
     * @return 
     */
    public Music getMusic() {
        return music;
    }

    /**
     * 
     * @param music 
     */
    public void setMusic(Music music) {
        this.music = music;
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
    public Calendar getDate() {
        return date;
    }

    /**
     * 
     * @param date 
     */
    public void setDate(Calendar date) {
        this.date = date;
    }
    
}
