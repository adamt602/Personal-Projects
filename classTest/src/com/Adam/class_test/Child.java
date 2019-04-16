/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Adam.class_test;

/**
 *
 * @author Bioni
 */
public class Child extends Parent{
    
    private double money = 10000;
    
   public Child(){
        
    }
    
    public double checkMoney(){
        return money;
    }
    
    public double checkParentMoney(){
        
        return super.checkMoney();
    }
    
}
