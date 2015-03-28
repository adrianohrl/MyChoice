/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import utilities.Random;
import model.*;

/**
 *
 * @author Adriano Henrique Rossette Leite <adrianohrl@gmail.com>
 */
public class App {
    
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        
        List<Listener> users = new ArrayList<>();
        users.add(new Listener("Mônica Fernanda da Silva", "monicao", "mo_fer@gmail.com"));
        users.add(new Musician("Adriano Henrique Rossette Leite", "adrianohrl", "adrianohrl@gmail.com"));
        users.add(new Listener("Elen Poliane Rossette Leite", "elenpoly", "elenpoly95@gmail.com"));
        users.add(new Listener("Andréia Jaqueline Rossette Leite", "jack", "andreiajrl@gmail.com"));
        users.add(new Listener("Angélika da Silva", "jeka", "jeka@gmail.com"));
        users.add(new Listener("Henrique Santos", "guaranesi", "rick@gmail.com"));
        users.add(new Musician("Lucas Braga", "praga", "braga@gmail.com"));
        Audience a1 = new Audience();
        a1.setMembers(users);
        
        Band dt = BandInsertion.newInstanceOfDreamTheater();
        
        Location l = new Location("Universidade Federal de Itajubá", "Av. BPS", "1303", "Pinheirinho", "37500-903", "Itajubá", "Sul de Minas", "Minas Gerais", "Brazil");
        Event e = new Event(l, new GregorianCalendar(2015, 4, 4));
        Participation p = new Participation(dt, new GregorianCalendar(2015, 4, 4, 22, 00), new GregorianCalendar(2015, 4, 5, 1, 0), e);
        e.setAudience(a1);
        e.getParticipations().add(p);
        
        System.out.println("After event, every body will valueate:");
        for (Respondent respondent : e.getAudience().getMembers()) {
            respondent.rate(l, Random.randInt(0, 5), "");
            respondent.rate(e, Random.randInt(0, 5), "");
            for (Participation participation : e.getParticipations()) {
                respondent.rate(participation, Random.randInt(0, 5), "");
            }
            respondent.rate(dt, Random.randInt(0, 5), "");
            /*Repertory r = dt.getRepertories();
            respondent.rate(dt.re, Random.randInt(0, 5), "");
            for (Music playedMusic : playedMusics) {
            respondent.rate(playedMusic, Random.randInt(0, 5), "");
            }*/
        }
        
    }
    
}
