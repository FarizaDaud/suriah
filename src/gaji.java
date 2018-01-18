

import java.util.Scanner;
public class gaji {
    public static void main(String args[])
    {
        Scanner input=new Scanner (System.in);
       
        int bil_jam_sehari, bil_hari, bil_jam_ot, gaji;
       System.out.print("Masukkan nama: ");
        String nama=input.nextLine(); //input nama
        System.out.print("Masukkan bilangan jam bekerja sehari: ");
        bil_jam_sehari=input.nextInt(); //no.3
        int bil_hari1 = bil_hari;
        
       if(bil_jam_sehari>9) { // no.4
            System.out.println("Bilangan jam bekerja tidak boleh melebihi 9 jam sehari,sila masukkan bilangan jam yang betul:");
            bil_jam_sehari=input.nextInt();
       }
       else{
           System.out.print("Masukkan bilangan hari bekerja: ");
           bil_hari1=input.nextInt(); //no.5
       }
           if (bil_hari1>30){
               System.out.println("Bilangan hari bekerja tidak boleh melebihi 30 hari,sila masukkan bilangan hari yang betul:");
               bil_hari1=input.nextInt();
           }
           else {
               System.out.print("Masukkan bilangan jam kerja lebih masa: ");
               bil_jam_ot=input.nextInt();
           }
           if (bil_jam_ot>50){
            System.out.println("Bilangan jam kerja lebih masa tidak boleh melebihi 50 jam,sila masukkan bilangan jam yang betul:");
           }
           else{
               bil_jam_ot=input.nextInt();
           }
                   gaji=(bil_jam_sehari*bil_hari1*20)+(bil_jam_ot*15);
           System.out.println("Rumusan gaji bulanan "+nama+" : ");
           System.out.println("Jumlah jam bekerja: "+bil_jam_sehari+" jam");
           System.out.println("Jumlah hari berkerja: "+bil_hari1+" hari");
           System.out.println("Jumlah jam lebih masa: "+bil_jam_ot+"jam");
           System.out.println("JUMLAH GAJI: RM"+gaji);
    
            
        }
        }
    