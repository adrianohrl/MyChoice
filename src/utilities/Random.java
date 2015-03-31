/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

/**
 *
 * @author Adriano Henrique Rossette Leite <adrianohrl@gmail.com>
 */
public class Random {
    
    /** */
    private final static java.util.Random rand = new java.util.Random();

    /**
     * 
     * @param min
     * @param max
     * @return 
     */
    public static int randInt(int min, int max) {
        return rand.nextInt((max - min) + 1) + min;
    }
    
    /**
     * 
     * @param min
     * @param max
     * @return 
     */
    public static float randFloat(float min, float max) {
        return rand.nextFloat() * (max - min) + min;
    }

}
