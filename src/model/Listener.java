/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author adriano
 */
public class Listener extends User implements Respondent {

    public Listener() {
    }

    public Listener(String name, String nickname, String email) {
        super(name, nickname, email);
    }
    
}
