/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.Duration;

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
    private OneElementRank<Music> globalRank = new OneElementRank<>(this);

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
        this.setTitle(title);
        this.setArtist(artist);
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
     * Pré requisito de duration mm:ss
     *
     * @param title
     * @param album
     * @param genre
     * @param artist
     * @param duration
     */
    public Music(String title, String album, String genre, Artist artist, String duration) {
        this(title, album, genre, artist);
        String[] splitted = duration.split(":");
        try {
            int minutes = Integer.parseInt(splitted[0]);
            int seconds = Integer.parseInt(splitted[1]);
            this.duration = Duration.ofSeconds(seconds + 60 * minutes);
        } catch (NumberFormatException e) {
            System.out.println("Invalid duration format (MM:SS)!!!");
        }
    }

    /**
     *
     * @param music
     * @return
     */
    @Override
    public int compareTo(Music music) {
        int value = artist.compareTo(music.artist);
        if (value == 0) {
            value = album.compareToIgnoreCase(music.album);
            if (value == 0) {
                value = title.compareToIgnoreCase(music.title);
            }
        }
        return value;
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
        return rateable instanceof Music && equals((Music) rateable);
    }
    
    /**
     * 
     * @param music
     * @return 
     */
    public boolean equals(Music music) {
        return music != null && title.equalsIgnoreCase(music.title) && album.equalsIgnoreCase(music.album)
                && artist.equals(music.artist) && genre.equalsIgnoreCase(music.genre) && duration.equals(music.duration);
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + title + " (by: " + artist + ")";
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
        if (title == null || title.equals("")) {
            throw new RuntimeException("Music title must not be null!!!");
        }
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
        if (artist == null) {
            throw new RuntimeException("Music artist must not be null!!!");
        }
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
    public OneElementRank<Music> getGlobalRank() {
        return globalRank;
    }

    /**
     * 
     * @param globalRank 
     */
    @Override
    public void setGlobalRank(OneElementRank globalRank) {
        if (globalRank.getRated() instanceof Music) {
            this.globalRank = globalRank;
        }
    }

}
