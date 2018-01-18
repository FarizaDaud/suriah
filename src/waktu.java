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
public class waktu {
    public static void main(String args[])
{
    Scanner input=new Scanner(System.in);

    System.out.println("Masukkan masa anda tiba");
    int masa=input.nextInt();

    if(masa>1030)//start 1031
    {
        System.out.println("Anda lewat!!");
    }

    else if(masa<1030)// kurang 1029
        {
            System.out.println("Anda awal ^V^");
        }
        
else// pilihan akhir
{
        System.out.println("Anda tepat pada masanya");
        }
}}