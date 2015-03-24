/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adriano Henrique Rossette Leite <adrianohrl@gmail.com>
 */
public class Equipment implements Rateable<Equipment> {
    
    /** */
    private String category;
    /** */
    private String brand;
    /** */
    private String model;
    /** */
    private String note;
    /** */
    private int rate = 0;
    /** */
    private List<Rating> ratings = new ArrayList<>();

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
     * @param equipment
     * @return 
     */
    @Override
    public int compareTo(Equipment equipment) {
        return rate - equipment.rate;
    }

    /**
     * 
     */
    @Override
    public void recalculateRate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        return rateable instanceof Equipment && equals((Equipment) rateable);
    }
    
    /**
     * 
     * @param equipment
     * @return 
     */
    public boolean equals(Equipment equipment) {
        return equipment != null && category.equalsIgnoreCase(equipment.category) && 
                brand.equalsIgnoreCase(equipment.brand) && model.equalsIgnoreCase(equipment.model);
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

    /**
     * 
     * @return 
     */
    @Override
    public int getRate() {
        return rate;
    }

    /**
     * 
     * @param rate 
     */
    @Override
    public void setRate(int rate) {
        this.rate = rate;
    }

    /**
     * 
     * @return 
     */
    @Override
    public List<Rating> getRatings() {
        return ratings;
    }

    /**
     * 
     * @param ratings 
     */
    @Override
    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }
    
}
