/*
 * ID: 21CE035
 * NAME: KHUSHI GORIYA
 * AIM: Develop a Program that illustrate method overloading concept.
 */
import java.util.*;
public class Pract2_5
{ 
   void sum(int a, int b) 
   { 
     int s = a + b; 
     System.out.println("Sum of two numbers: " +s); 
   } 

   void sum(int a, int b, int c) 
   { 
     int t = a + b + c; 
     System.out.println("Sum of three numbers: " +t); 
   } 
public static void main(String[] args) 
{ 
   Pract2_5 a= new Pract2_5(); 
    a.sum(10, 20); 
    a.sum(10,20,30);  
  } 
 }
