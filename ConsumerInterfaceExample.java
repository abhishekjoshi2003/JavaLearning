/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javalearning;

/**
 *
 * @author RCAT
 */

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerInterfaceExample {
    
    static void printMessage(String name)
    {
        System.out.println("Great to see "+name);
    }
    
    static void printValue(int val)
    {
        System.out.println(val);
    }
    
    public static void main(String[] args)
    {
        Consumer<String> c1 = ConsumerInterfaceExample::printMessage;
        c1.accept("Abhishek Joshi");
        
        Consumer<Integer> c2 = ConsumerInterfaceExample::printValue;
        c2.accept(12);
        
        Consumer<String> c3 = (t)->System.out.println(t);
        c3.accept("R-CAT");
        
        Consumer<String> c4 = (input)->System.out.println(input+" World!");
        
        Consumer<String> c5 =  (input)->System.out.println(input+" Java");
        
        c4.andThen(c5).accept("Great");

        Consumer<String> show = value->{
            System.out.println(value);
            System.out.println(value);
            System.out.println(value);
        };
        show.accept("blue sky");
        show.accept("old falcon");
        
        
    }
    
}
