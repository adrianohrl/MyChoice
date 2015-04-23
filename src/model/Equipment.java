/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

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
     */
    public Equipment(String category, String brand, String model) {
        this.setCategory(category);
        this.setBrand(brand);
        this.setModel(model);
    }

    /**
     * 
     * @param category
     * @param brand
     * @param model
     * @param note 
     */
    public Equipment(String category, String brand, String model, String note) {
        this(category, brand, model);
        this.note = note;
    }

    /**
     * 
     * @param equipment
     * @return 
     */
    @Override
    public int compareTo(Equipment equipment) {
        int value = category.compareToIgnoreCase(equipment.category);
        if (value == 0) {
            value = brand.compareToIgnoreCase(equipment.brand);
            if (value == 0) {
                value = model.compareToIgnoreCase(equipment.model);
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
        if (category == null || category.equals("")) {
            throw new RuntimeException("Equipment category must not be null!!!");
        }
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
        if (brand == null || brand.equals("")) {
            throw new RuntimeException("Equipment brand must not be null!!!");
        }
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
        if (model == null || model.equals("")) {
            throw new RuntimeException("Equipment model must not be null!!!");
        }
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
