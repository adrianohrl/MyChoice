/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.List;
import model.Band;
import model.Music;
import model.Musician;
import model.Repertory;

/**
 *
 * @author Adriano Henrique Rossette Leite <adrianohrl@gmail.com>
 */
public class BandInsertion {

    /**
     * 
     * @return 
     */
    public static Band newInstanceOfDreamTheater() {
        Band dt = new Band("Dream Theater");
        
        List<Musician> members = new ArrayList<>();
        members.add(new Musician("John Petrucci", "jp", "jp@musicman.com"));
        members.add(new Musician("Michael Portnoy", "mike", "portnoy@sabian.com"));
        members.add(new Musician("John Myung", "jmyung", "myung@musicman.com"));
        members.add(new Musician("Jordan Rudess", "rudess", "rudess@"));
        members.add(new Musician("James LaBrie", "labrie", "labrie@gmail.com"));
        dt.setMembers(members);

        List<Music> octavarium = new ArrayList<>();
        octavarium.add(new Music("The Root of All Evil", "Octavarium", "Progressive Rock", dt, "8:25"));
        octavarium.add(new Music("The Answer Lies Within", "Octavarium", "Progressive Rock", dt, "5:33"));
        octavarium.add(new Music("These Walls", "Octavarium", "Progressive Rock", dt, "7:36"));
        octavarium.add(new Music("I Walk Beside You", "Octavarium", "Progressive Rock", dt, "4:29"));
        octavarium.add(new Music("Panic Attack", "Octavarium", "Progressive Rock", dt, "8:13"));
        octavarium.add(new Music("Never Enough", "Octavarium", "Progressive Rock", dt, "6:46"));
        octavarium.add(new Music("Sacrified Sons", "Octavarium", "Progressive Rock", dt, "10:42"));
        octavarium.add(new Music("Octavarium", "Octavarium", "Progressive Rock", dt, "24:00"));
        dt.getRepertories().add(new Repertory(octavarium));
        
        List<Music> systematicChaos = new ArrayList<>();
        systematicChaos.add(new Music("In the Presence of Enimies - Part I", "Systematic Chaos", "Progressive Rock", dt, "9:00"));
        systematicChaos.add(new Music("Forsaken", "Systematic Chaos", "Progressive Rock", dt, "5:35"));
        systematicChaos.add(new Music("Constant Motion", "Systematic Chaos", "Progressive Rock", dt, "6:55"));
        systematicChaos.add(new Music("The Dark Eternal Night", "Systematic Chaos", "Progressive Rock", dt, "8:53"));
        systematicChaos.add(new Music("Repentance", "Systematic Chaos", "Progressive Rock", dt, "10:43"));
        systematicChaos.add(new Music("Prophets of War", "Systematic Chaos", "Progressive Rock", dt, "6:00"));
        systematicChaos.add(new Music("The Ministry of Lost Souls", "Systematic Chaos", "Progressive Rock", dt, "14:57"));
        systematicChaos.add(new Music("In the Presence of Enemies - Part II", "Systematic Chaos", "Progressive Rock", dt, "16:38"));
        dt.getRepertories().add(new Repertory(systematicChaos));
        
        List<Music> imagesAndWords = new ArrayList<>();
        imagesAndWords.add(new Music("Pull me Under", "Images and Words", "Progressice Rock", dt, "8:14"));
        imagesAndWords.add(new Music("Another Day", "Images and Words", "Progressice Rock", dt, "4:23"));
        imagesAndWords.add(new Music("Take the Time", "Images and Words", "Progressice Rock", dt, "8:21"));
        imagesAndWords.add(new Music("Surrounded", "Images and Words", "Progressice Rock", dt, "5:30"));
        imagesAndWords.add(new Music("Metropolis - Part I: The Miracle and the Sleeper", "Images and Words", "Progressice Rock", dt, "9:32"));
        imagesAndWords.add(new Music("Under a Glass Moon", "Images and Words", "Progressice Rock", dt, "7:03"));
        imagesAndWords.add(new Music("Wait for Sleep", "Images and Words", "Progressice Rock", dt, "2:31"));
        imagesAndWords.add(new Music("Learning to Live", "Images and Words", "Progressice Rock", dt, "11:30"));
        dt.getRepertories().add(new Repertory(imagesAndWords));
        
        List<Music> blackCloudsAndSilver = new ArrayList<>();
        blackCloudsAndSilver.add(new Music("A Nightmare to Remember", "Black Clouds & Silver", "Progressive Rock", dt, "16:10"));
        blackCloudsAndSilver.add(new Music("A Rite of Passage", "Black Clouds & Silver", "Progressive Rock", dt, "8:35"));
        blackCloudsAndSilver.add(new Music("Wither", "Black Clouds & Silver", "Progressive Rock", dt, "5:25"));
        blackCloudsAndSilver.add(new Music("The Shattered Fortress", "Black Clouds & Silver", "Progressive Rock", dt, "12:46"));
        blackCloudsAndSilver.add(new Music("The Best of Times", "Black Clouds & Silver", "Progressive Rock", dt, "13:19"));
        blackCloudsAndSilver.add(new Music("The Count of Tuscany", "Black Clouds & Silver", "Progressive Rock", dt, "19:16"));
        dt.getRepertories().add(new Repertory(blackCloudsAndSilver));
        
        return dt;
    }
    
    public static Band newInstanceOfOficinaG3() {
        Band oficinaG3 = new Band("Oficina G3");
        
        List<Musician> members = new ArrayList<>();
        members.add(new Musician("Juninho Afram", "afram", "afram@oficinag3.com.br"));
        members.add(new Musician("Duca Tambasco", "duca", "duca@oficinag3.com.br"));
        members.add(new Musician("Jean Carlos", "jean_carlos", "jean@oficinag3.com.br"));
        members.add(new Musician("Mauro Henrique", "mauro_henrique", "mauro@oficinag3.com.br"));
        members.add(new Musician("Alexandre Aposan", "aposan", "aposan@oficinag3.com.br"));
        oficinaG3.setMembers(members);
        
        List<Music> humanos = new ArrayList<>();
        humanos.add(new Music("Desculpas", "Humanos", "Progressive Rock", oficinaG3, "2:10"));
        humanos.add(new Music("Até Quando?", "Humanos", "Progressive Rock", oficinaG3, "1:10"));
        humanos.add(new Music("Te Escolhi", "Humanos", "Progressive Rock", oficinaG3, "3:10"));
        humanos.add(new Music("Ele se foi", "Humanos", "Progressive Rock", oficinaG3, "1:50"));
        humanos.add(new Music("Minha Luta", "Humanos", "Progressive Rock", oficinaG3, "3:47"));
        humanos.add(new Music("Apostasia", "Humanos", "Progressive Rock", oficinaG3, "4:32"));
        oficinaG3.getRepertories().add(new Repertory(humanos));
        
        List<Music> ddg = new ArrayList<>();
        ddg.add(new Music("Depois da Guerra", "Depois da Guerra", "Progressive Rock", oficinaG3, "5:10"));
        ddg.add(new Music("Eu sou", "Depois da Guerra", "Progressive Rock", oficinaG3, "5:48"));
        oficinaG3.getRepertories().add(new Repertory(ddg));
        
        List<Music> tempo = new ArrayList<>();
        tempo.add(new Music("Ele vive", "O Tempo", "Progressive Rock", oficinaG3, "2:52"));
        tempo.add(new Music("Necessário", "O Tempo", "Progressive Rock", oficinaG3, "4:52"));
        tempo.add(new Music("O Tempo", "O Tempo", "Progressive Rock", oficinaG3, "3:26"));
        oficinaG3.getRepertories().add(new Repertory(tempo));
        
        List<Music> alemDoOsOlhosPodemVer = new ArrayList<>();
        alemDoOsOlhosPodemVer.add(new Music("Além do que os Olhos podem ver", "Além do que os Olhos podem ver", "Progressive Rock", oficinaG3, "2:12"));
        alemDoOsOlhosPodemVer.add(new Music("O fim é só o comeco", "Além do que os Olhos podem ver", "Progressive Rock", oficinaG3, "2:12"));
        alemDoOsOlhosPodemVer.add(new Music("A licão", "Além do que os Olhos podem ver", "Progressive Rock", oficinaG3, "2:12"));
        oficinaG3.getRepertories().add(new Repertory(alemDoOsOlhosPodemVer));
        
        return oficinaG3;
    }

}
