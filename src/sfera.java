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
public class sfera {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Masukkan jejari sfera");
                int jejari=input.nextInt();
                int sfera=4/3*22/7*jejari*jejari*jejari;
                
                if (sfera>1.00)
                {
                    System.out.println("x pasti");
                }
    }
}
