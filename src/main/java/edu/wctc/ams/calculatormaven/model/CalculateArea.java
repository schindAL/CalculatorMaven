/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.ams.calculatormaven.model;

/**
 *
 * @author Alec
 */
public class CalculateArea {
        
    public final double getRectangularArea(String first, String second){
        double newFirst, newSecond; 
        newFirst = Double.parseDouble(first);
        newSecond = Double.parseDouble(second);
        return newFirst * newSecond;  
    }
    public final double getCicularArea(String radius){
        double newRadius = Double.parseDouble(radius);
        return newRadius * newRadius * Math.PI;
    }
    public final double getPythagoreanArea(String firstSide, String secondSide){
        double first, second;
        first = Double.parseDouble(firstSide);
        second = Double.parseDouble(secondSide);
        double thirdSide = Math.sqrt(first*first+second*second);
        return thirdSide;
    }
}
