/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javalearning;

/**
 *
 * @author RCAT
 */

import java.math.*;

public class BigDecimalDemo {
    
    public static void main(String[] args)
    {
        BigDecimal bg1 , bg2 ;
        bg1 = new BigDecimal("-333.3454");
        
        MathContext mc = new MathContext(2);
        
        bg2 = bg1.plus(mc);
        
        String str = "The result of lpus usimg context setting is " + bg2 ;
        System.out.println(str);
        
        
        
        // Square root Example
        
        BigDecimal a , sqrt ;
        a = new BigDecimal("100000000000000000000") ;
        MathContext mc1 = new MathContext(10);
        
        sqrt = a.sqrt(mc1);
        
        System.out.println();
        
    }
    
}
