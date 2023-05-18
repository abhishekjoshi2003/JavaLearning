/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javalearning;

/**
 *
 * @author RCAT
 */
public class EnumExample1 
{
    public enum Season
    {
        WINTER, SPRING, SUMMER, FALL
    }
    
    public static void main(String[] args)
    {
        for(Season s : Season.values())
        {
            System.out.println(s);
        }
    }
}
