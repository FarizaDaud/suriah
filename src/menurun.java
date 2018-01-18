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
public class menurun {
    public static void main(String args[])
    {
         Scanner input=new Scanner(System.in);
        System.out.println("masukkan no");
        int no=input.nextInt();
        int i=0;
         System.out.println("Masukkan Nombor:"+no);
        while(i<=no)
        {
           
            System.out.println(i);
              i--;     
        }
    }}
