/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FaRieZa
 */
import java.util.Scanner;
public class sifir {
    public static void main(String args[])
    {        
 Scanner input=new Scanner(System.in); 

 System.out.println("masukkan sifir");
  int jum =input.nextInt();
   
 for(int no=1; no<=10; no+=1)                                                   //start no; ulangan; selang
     {                                                                             //for x leh *%/
       int darab;
       darab= no*jum;    
  System.out.println(no+"x"+jum+"="+darab);
 }
    }
    }