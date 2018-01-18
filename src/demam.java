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
public class demam {
    public static void main(String args[]){
        Scanner input=new Scanner (System.in);
        
System.out.print("Masukkan suhu anda :");
double suhu=input.nextDouble();

if (suhu >= 37)
{System.out.print("anda menghidapi demam panas");}
       
else
{System.out.print("anda ok je");}
    }
}
