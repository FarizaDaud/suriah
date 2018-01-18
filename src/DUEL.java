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
public class ulg {
    public static void main(String args)
    {
        Scanner input=new Scanner(System.in);
       int ulang=input.nextInt();
       int jum=0;
       int i=0;
     do{
         int no=input.nextInt();
         i++;
     jum+=no;
     }   while(i<=ulang);
     System.out.println(jum);
    }}
