/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import javafx.scene.input.KeyCode;
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
        users.add(new Musician("Alfredo Vasconcelos", "fredo", "alf@bol.com.br"));
        users.add(new Listener("Ana Maria Braga", "praguinha", "ana@globo.com"));
        users.add(new Musician("Galvão Bueno", "galvao", "galvao@globo.com"));
        users.add(new Musician("Marcos Adriano Leite", "mal", "marquinhos@bol.com.br"));
        Audience a1 = new Audience();
        a1.setMembers(users);
        
        Location l = new Location("Universidade Federal de Itajubá", "Av. BPS", "1303", "Pinheirinho", "37500-903", "Itajubá", "Sul de Minas", "Minas Gerais", "Brazil");
        Event e = new Event(l, new GregorianCalendar(2015, GregorianCalendar.APRIL, 4));
        e.setAudience(a1);
        
        Band dt = BandInsertion.newInstanceOfDreamTheater();
        e.getParticipations().add(new Participation(dt, new GregorianCalendar(2015, GregorianCalendar.APRIL, 4, 23, 30), new GregorianCalendar(2015, GregorianCalendar.APRIL, 5, 2, 30), e));
        for (Musician member : dt.getMembers()) {
            users.add(member);
        }
        
        Band of = BandInsertion.newInstanceOfOficinaG3();
        e.getParticipations().add(new Participation(of, new GregorianCalendar(2015, GregorianCalendar.APRIL, 4, 21, 30), new GregorianCalendar(2015, GregorianCalendar.APRIL, 4, 23, 30), e));
        for (Musician member : of.getMembers()) {
            users.add(member);
        }
                
        System.out.println("After event, every body will valueate:");
        List<Listener> respondents = e.getAudience().getMembers();
        
        ManyElementsRank<Location> locationRank = new ManyElementsRank<>();
        for (Respondent respondent : respondents) {
            locationRank.add(respondent.rate(l, Random.randInt(0, 5), "Meu nome é: " + respondent + ", estou avaliando a localizaćão!!!"));
        }
        
        ManyElementsRank<Band> bandRank = new ManyElementsRank<>();
        for (Respondent respondent : respondents) {
            bandRank.add(respondent.rate(dt, Random.randInt(0, 5), ""));
            bandRank.add(respondent.rate(of, Random.randInt(0, 5), ""));
            bandRank.add(respondent.rate(dt, Random.randInt(0, 5), ""));
        }
        
        /*List<Music> musics = new ArrayList<>();
        for (Repertory repertory : dt.getRepertories()) {
            musics.addAll(repertory.getMusics());
        }
        for (Repertory repertory : of.getRepertories()) {
            musics.addAll(repertory.getMusics());
        }
        ManyElementsRank<Music> musicRank = new ManyElementsRank<>();
        for (Respondent respondent : respondents) {
            for (Music music : musics) {
                musicRank.add(respondent.rate(music, Random.randInt(0, 5), ""));
            }
        }*/
        
        System.out.println("============================================");
        System.out.println(locationRank);
        
        System.out.println("============================================");
        System.out.println(bandRank);
        
        /*System.out.println("============================================");
        System.out.println(musicRank);*/
        
    }
    
}
