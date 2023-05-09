/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javalearning;

/**
 *
 * @author RCAT
 */

abstract class Person
{
    abstract void eat();
}

public class AnonymousExample1 
{
    public static void main(String[] args)
    {
        Person p = new Person()
        {
            void eat()
            {
                System.out.println("Nice fruit");
            }
        };
        p.eat();
    }
}
