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
public class Latihan1_27Julai
{
    public static void main (String args[])
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Bil");
        int bil1=input.nextInt();
        int bil2=input.nextInt();
        int bil3=input.nextInt();
        int bil4=input.nextInt();
        int bil5=input.nextInt();
        int bil6=input.nextInt();
        int bil7=input.nextInt();
        
        System.out.println("Masukkan Kelas");
        String kelas1=input.nextLine();
        String kelas2=input.nextLine();
        String kelas3=input.nextLine();
        String kelas4=input.nextLine();
        String kelas5=input.nextLine();
        String kelas6=input.nextLine();
        String kelas7=input.nextLine();
        
        System.out.println("Masukkan Nama Guru Kelas");
        String cg1=input.nextLine();
        String cg2=input.nextLine();
        String cg3=input.nextLine();
        String cg4=input.nextLine();
        String cg5=input.nextLine();
        String cg6=input.nextLine();
        String cg7=input.nextLine();
        
        System.out.println("Bil.\tKelas\tGuru Kelas");
        System.out.println(bil1+"\t"+kelas1+"\t"+cg1);
        System.out.println(bil2+"\t"+kelas2+"\t"+cg2);
        System.out.println(bil3+"\t"+kelas3+"\t"+cg3);
        System.out.println(bil4+"\t"+kelas4+"\t"+cg4);
        System.out.println(bil5+"\t"+kelas5+"\t"+cg5);
        System.out.println(bil6+"\t"+kelas6+"\t"+cg6);
        System.out.println(bil7+"\t"+kelas7+"\t"+cg7);






    }

    
}
