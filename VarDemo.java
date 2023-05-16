/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.demo;

/**
 *
 * @author RCAT
 */
import java.util.*;

interface myInt
{
    int add(int a, int b);
}




public class VarDemo {
    //var cannot be used as global variable declaration
    //var l = 50 ; 
    static int y = 0;
    int x = 0;
   public static void main(String[] args) 
   {
       //We can't use as genric type
       //var<var> al = new ArrayList<>();
       //var<Integer> al = new ArrayList<Integer>();
       
       // var cannot be used without explicit initialization
       //var variable;
       
       //var cannot be used with lambda expression 
       //var obj =(a,b)->(a+b);
  
       //var cannot be used for method parameters and return type
//       var method()
//       {
//           return "Inside method";
//       }
       
//       void method1(var a)
//       {
//           System.out.print(a);
//       }
//       
       VarDemo var = new VarDemo();
       System.out.println(var.x);
       var x = 100;
       var y = 1.90;
       var z = 'a';
       var p = "tanu";
       var q = false;
       System.out.println(x);
       System.out.println(y);
       System.out.println(z);
       System.out.println(p);
       System.out.println(q); 
  //     System.out.println(l);
   }
}
