/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.List;
import model.ManyElementsRank;
import model.Musician;
import model.OneElementRank;
import model.Rating;
import utilities.Random;

/**
 *
 * @author Adriano Henrique Rossette Leite <adrianohrl@gmail.com>
 */
public class RankTest {
    
    public static void main(String[] args) {
        List<Musician> musicians = new ArrayList<>();
        Musician adriano = new Musician("Adriano Henrique Rossette Leite", "adrianohrl", "adrianohrl@gmail.com");
        Musician monica = new Musician("Mônica Fernanda da Silva", "monicao", "mo_fer@gmail.com");
        musicians.add(monica);
        musicians.add(adriano);
        musicians.add(new Musician("Elen Poliane Rossette Leite", "elenpoly", "elenpoly95@gmail.com"));
        musicians.add(new Musician("Andréia Jaqueline Rossette Leite", "jack", "andreiajrl@gmail.com"));
        musicians.add(new Musician("Angélika da Silva", "jeka", "jeka@gmail.com"));
        musicians.add(new Musician("Henrique Santos", "guaranesi", "rick@gmail.com"));
        musicians.add(new Musician("Lucas Braga", "praga", "braga@gmail.com"));
        musicians.add(new Musician("Alfredo Vasconcelos", "fredo", "alf@bol.com.br"));
        musicians.add(new Musician("Ana Maria Braga", "praguinha", "ana@globo.com"));
        musicians.add(new Musician("Galvão Bueno", "galvao", "galvao@globo.com"));
        musicians.add(new Musician("Marcos Adriano Leite", "mal", "marquinhos@bol.com.br"));
        ManyElementsRank<Musician> rank = new ManyElementsRank<>();
        ManyElementsRank<Musician> test = new ManyElementsRank<>();
        //System.out.println(test);
        for (Musician musician : musicians) {
            OneElementRank<Musician> musicianRank = new OneElementRank<>(musician);
            for (Musician m : musicians) {
                if (!m.equals(musician)) {
                    int rate = Random.randInt(0, 5);
                    Rating<Musician> rating = m.rate(musician, rate, "");
                    musicianRank.add(rating);
                    test.add(rating);
                }
            }
            rank.add(musicianRank);
        }
        System.out.println(test);
        if (rank.check(test)) {
            System.out.println("Legal, funcionou!!!");
        } else {
            System.out.println("Ops, não foi dessa vez!!!");
        }
    }
    
}
