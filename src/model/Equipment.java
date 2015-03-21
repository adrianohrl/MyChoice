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
public class Equipment {
    
    /** */
    private String category;
    /** */
    private String brand;
    /** */
    private String model;
    /** */
    private String note;
    /** */

    /**
     * 
     */
    public Equipment() {
    }

    /**
     * 
     * @param category
     * @param brand
     * @param model
     * @param note 
     */
    public Equipment(String category, String brand, String model, String note) {
        this.category = category;
        this.brand = brand;
        this.model = model;
        this.note = note;
    }

    /**
     * 
     * @return 
     */
    public String getCategory() {
        return category;
    }

    /**
     * 
     * @param category 
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * 
     * @return 
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 
     * @param brand 
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 
     * @return 
     */
    public String getModel() {
        return model;
    }

    /**
     * 
     * @param model 
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * 
     * @return 
     */
    public String getNote() {
        return note;
    }

    /**
     * 
     * @param note 
     */
    public void setNote(String note) {
        this.note = note;
    }
    
}
