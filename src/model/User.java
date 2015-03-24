/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 * Escreve aki uma descricão sobre essa classe.
 * 
 * @author Adriano Henrique Rossette Leite <adrianohrl@gmail.com>
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
     * 
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj) {
        return obj instanceof User && equals((User) obj);
    }
    
    /**
     * 
     * @param user
     * @return 
     */
    public boolean equals(User user) {
       return user != null && name.equalsIgnoreCase(user.name) && 
               nickname.equalsIgnoreCase(user.nickname) && email.equalsIgnoreCase(user.email);
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

    /**
     * 
     * @return 
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 
     * @param nickname 
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 
     * @return 
     */
    public String getEmail() {
        return email;
    }

    /**
     * 
     * @param email 
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
}
