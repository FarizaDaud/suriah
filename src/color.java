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
public class color {    
public static void main(String args[]){
 Scanner input=new Scanner(System.in);
 System.out.println("Masukkan nama");
 String nama=input.nextLine();
 System.out.println("Masukkan jantina");
 String gender=input.nextLine();
 System.out.println("Masukkan warna kegemaran");
 String color=input.nextLine();
 System.out.println("Nama:"+nama);
     System.out.println("Jantina:"+gender);
     System.out.println("Warna kegemaran:"+color);
 switch(color)
 {  case "merah":
             System.out.println(color+" melambangkan kekuatan");
             break;           
     case "biru":
             System.out.println(color+" melambangkan ketenangan");
             break;         
     case "kuning":
             System.out.println(color+" melambangkan kegembiraan");
             break;
     case "hijau":
             System.out.println(color+" melambangkan kehidupan");
             break;
     default:
         System.out.println("Maaf tiada maklumat");
 } }}
