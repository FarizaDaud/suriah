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
public class BMI {
    public static void main(String args[])
    {
        Scanner  input = new Scanner(System.in);
        
        System.out.println("Masukkan berat(kg)");
        double berat=input.nextDouble();
        
        System.out.println("Masukkan tinggi(m)");
        double tinggi=input.nextDouble();
       
        double bmi=(tinggi*tinggi)/berat;
        
        if (bmi<=18.5 )
        { System.out.println("Kurang berat badan");}
        else if(bmi<=25 & bmi>=18.5)
        { System.out.println("Normal");}
        else if (bmi<=30 & bmi>=25)
        { System.out.println("Berat badan berlebihan");}
        else
        { System.out.println("Gemuk!!");}
            
    }

}
