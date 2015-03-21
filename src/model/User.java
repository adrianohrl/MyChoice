/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 * Escreve aki uma descricão sobre essa classe.
 * 
 * @author adriano
 */
public abstract class User {
    
    /** descricao sobre a variavel */
    private String name;
    /** */
    private String nickname;
    /** */
    private String email;

    /**
     * descricao do construtor
     */
    public User() {
    }

    /**
     *  descricao desse construtor
     * @param name descricao desse parametro
     * @param nickname
     * @param email 
     */
    public User(String name, String nickname, String email) {
        this.name = name;
        this.nickname = nickname;
        this.email = email;
    }

    /**
     * descricao desse metodo
     * @return descricao do objeto de retorno
     */
    public String getName() {
        return name;
    }

    /**
     * descricao desse metodo
     * @param name descricao desse parametro de entrada
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
