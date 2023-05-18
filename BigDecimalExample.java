/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javalearning;

/**
 *
 * @author RCAT
 */

import java.math.BigDecimal;

public class BigDecimalExample {
    
    public static void main(String[] args)
    {
        BigDecimal bd = new BigDecimal("12.123");
        BigDecimal bd1 = new BigDecimal("98.12");
        
        bd  = bd.add(bd1);
        System.out.println("BigDecimal1 = "+bd);
        
        bd  = bd.multiply(bd1);
        System.out.println("BigDecimal1 = "+bd);
        
        bd  = bd.subtract(bd1);
        System.out.println("BigDecimal1 = "+bd);
        
        bd  = bd.divide(bd1);
        System.out.println("BigDecimal1 = "+bd);        
        
        bd  = bd.pow(2);
        System.out.println("BigDecimal1 = "+bd);
        
        bd  = bd.negate();
        System.out.println("BigDecimal1 = "+bd);
    
        System.out.println(bd.compareTo(bd1));
        
        String s  = bd.toString();
        System.out.println("BigDecimal1 = "+s);
    }   
}