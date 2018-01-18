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
public class integer {
   public static void main(String args[])
    {        
 Scanner input=new Scanner(System.in); 
        int bil = 0, jumlah,nis;
 System.out.println("masukkan bilangan nombor");
            nis=input.nextInt();
            
  System.out.println("masukkan jumlah nombor setiap satunya");
  
  for(int i=1; i<=nis; i+=1)
  {
      bil =input.nextInt();    
      System.out.println("Nombor "+i+" :"+bil);
  }  
   jumlah = bil+bil ;
       int tambah= jumlah+bil;
  
   System.out.println("Hasil tambah semuanya adalah"+tambah);
 
  }
}