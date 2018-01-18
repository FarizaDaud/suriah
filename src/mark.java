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
public class mark {
    public static void main(String args[])
    {
        Scanner input = new Scanner (System.in);
        int jum_sub=input.nextInt();
        int jum_mark =0;
        for(int i=0;i<jum_sub;i+=1)
        {
            int mark=input.nextInt();
             jum_mark = jum_mark+mark;
    }
        double pratus =jum_mark*100/(jum_sub*100);
        System.out.println("Jumalh markah:"+jum_mark);
        System.out.println("Peratus markah:" +pratus);
    }
}
