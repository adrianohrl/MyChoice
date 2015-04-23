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
public class Participation implements Rateable<Participation> {
    
    /** */
    private Artist artist;
    /** */ 
    private List<Musician> absents = new ArrayList<>();
    /** */
    private List<Artist> guests = new ArrayList<>();
    /** */ 
    private Repertory reportory;
    /** */
    private Calendar initialDate = new GregorianCalendar();
    /** */
    private Calendar finalDate;
    /** */
    private Event event;

    /**
     * 
     */
    public Participation() {
    }

    /**
     * 
     * @param artist
     * @param repertory
     * @param finalDate
     * @param event 
     */
    public Participation(Artist artist, Repertory repertory, Calendar finalDate, Event event) {
        this.setArtist(artist);
        this.setFinalDate(finalDate);
        this.setEvent(event);
        this.reportory = repertory;
    }  
    
    /**
     * 
     * @param artist
     * @param absents
     * @param repertory
     * @param finalDate
     * @param event 
     */
    public Participation(Artist artist, List<Musician> absents, Repertory repertory, Calendar finalDate, Event event) {
        this(artist,repertory, finalDate, event);
        this.setAbsents(absents);
    }
    
    /**
     * 
     * @param artist
     * @param repertory
     * @param guests
     * @param finalDate
     * @param event 
     */
    public Participation(Artist artist, Repertory repertory, List<Artist> guests, Calendar finalDate, Event event) {
        this(artist, repertory, finalDate, event);
        this.setGuests(guests);
    }
    
    /**
     * 
     * @param artist
     * @param absents
     * @param repertory
     * @param guests
     * @param finalDate
     * @param event 
     */
    public Participation(Artist artist, List<Musician> absents, Repertory repertory, List<Artist> guests, Calendar finalDate, Event event) {
        this(artist, absents, repertory, finalDate, event);
        this.setGuests(guests);
    }
    
    /**
     * 
     * @param artist
     * @param repertory
     * @param initialDate
     * @param finalDate
     * @param event 
     */
    public Participation(Artist artist, Repertory repertory, Calendar initialDate, Calendar finalDate, Event event) {
        this.setArtist(artist);
        this.setInitialDate(initialDate);
        this.setFinalDate(finalDate);
        this.setEvent(event);
        this.reportory = repertory;
    } 
    
    /**
     * 
     * @param artist
     * @param absents
     * @param repertory
     * @param initialDate
     * @param finalDate
     * @param event 
     */
    public Participation(Artist artist, List<Musician> absents, Repertory repertory, Calendar initialDate, Calendar finalDate, Event event) {
        this(artist, repertory, initialDate, finalDate, event);
        this.setAbsents(absents);
    }
    
    /**
     * 
     * @param artist
     * @param repertory
     * @param guests
     * @param initialDate
     * @param finalDate
     * @param event 
     */
    public Participation(Artist artist, Repertory repertory, List<Artist> guests, Calendar initialDate, Calendar finalDate, Event event) {
        this(artist, repertory, initialDate, finalDate, event);
        this.setGuests(guests);
    }
    
    /**
     * 
     * @param artist
     * @param absents
     * @param repertory
     * @param guests
     * @param initialDate
     * @param finalDate
     * @param event 
     */
    public Participation(Artist artist, List<Musician> absents, Repertory repertory, List<Artist> guests, Calendar initialDate, Calendar finalDate, Event event) {
        this(artist, absents, repertory, initialDate, finalDate, event);
        this.setGuests(guests);
    }

    /**
     * 
     * @param participation
     * @return 
     */
    @Override
    public int compareTo(Participation participation) {
        int value = event.compareTo(event);
        if (value == 0) {
            value = initialDate.compareTo(participation.initialDate);
            if (value == 0) {
                value = artist.compareTo(participation.artist);
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
        return rateable instanceof Participation && equals((Participation) rateable);
    }
    
    /**
     * 
     * @param participation
     * @return 
     */
    public boolean equals(Participation participation) {
        return participation != null && artist.equals(participation.artist) && 
                initialDate.equals(participation.initialDate) && event.equals(participation.event);
    }
    
    /**
     * 
     * @return 
     */
    public List<Musician> getParticipants() {
        List<Musician> participants = new ArrayList();
        if (artist instanceof Musician) {
            participants.add((Musician) artist);
        } else {
            participants.addAll(((Band) artist).getMembers());
        }
        participants.removeAll(absents);
        for (Artist guest : guests) {
            if (guest instanceof Musician) {
                participants.add((Musician) guest);
            } else {
                participants.addAll(((Band) guest).getMembers());
            }
        }
        return participants;
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
            throw new RuntimeException("Participation artist must not be null!!!");
        }
        this.artist = artist;
    }

    /**
     * 
     * @return 
     */
    public List<Musician> getAbsents() {
        return absents;
    }

    /**
     * 
     * @param absents 
     */
    public void setAbsents(List<Musician> absents) {
        if (!(artist instanceof Band)) {
            return;
        }
        List<Musician> members = ((Band) artist).getMembers();
        for (Musician absent : absents) {
            if (absent instanceof Musician && members.contains((Musician) absent)) {
                this.absents.add(absent);
            }
        }
    }

    /**
     * 
     * @return 
     */
    public List<Artist> getGuests() {
        return guests;
    }

    /**
     * 
     * @param guests 
     */
    public void setGuests(List<Artist> guests) {  
        if (artist instanceof Musician) {
            for (Artist guest : guests) {
                if (!guest.equals(artist)) {
                    this.guests.add(guest);
                }
            }
            return;
        }
        List<Musician> members = ((Band) artist).getMembers();
        for (Artist guest : guests) {
            if (guest instanceof Musician) {
                Musician guestMusician = (Musician) guest;
                if (!members.contains(guestMusician)) {
                    this.guests.add(guest);
                } else if (absents.contains(guestMusician)) {
                    absents.remove(guestMusician);
                }
            }
        }
    }

    /**
     * 
     * @return 
     */
    public Repertory getReportory() {
        return reportory;
    }

    /**
     * 
     * @param reportory 
     */
    public void setReportory(Repertory reportory) {
        this.reportory = reportory;
    }

    /**
     * 
     * @return 
     */
    public Calendar getInitialDate() {
        return initialDate;
    }

    /**
     * 
     * @param initialDate 
     */
    public void setInitialDate(Calendar initialDate) {
        if (initialDate == null) {
            throw new RuntimeException("Participation initial date must not be null!!!");
        } else if (finalDate != null && initialDate.compareTo(finalDate) > 0) {
            throw new RuntimeException("Participation initial date must be less than its final date!!!");
        }
        this.initialDate = initialDate;
    }

    /**
     * 
     * @return 
     */
    public Calendar getFinalDate() {
        return finalDate;
    }

    /**
     * 
     * @param finalDate 
     */
    public void setFinalDate(Calendar finalDate) {
        if (finalDate == null) {
            throw new RuntimeException("Participation final date must not be null!!!");
        } else if (initialDate != null && initialDate.compareTo(finalDate) > 0) {
            throw new RuntimeException("Participation final date must be less than its initial date!!!");
        }
        this.finalDate = finalDate;
    }

    /**
     * 
     * @return 
     */
    public Event getEvent() {
        return event;
    }

    /**
     * 
     * @param event 
     */
    public void setEvent(Event event) {
        if (event == null) {
            throw new RuntimeException("Participation event must not be null!!!");
        }
        this.event = event;
    }
    
}
