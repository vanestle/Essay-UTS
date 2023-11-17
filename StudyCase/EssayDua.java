
package StudyCase;

import java.util.Scanner;

public class EssayDua {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("input jumlah mahasiswa: ");
        
        int jmh = sc.nextInt();
        String name [] = new String [jmh];
        String status [] = new String [jmh];
        int nilai [] = new int[jmh];
        
        for (int i = 0; i < jmh; i++) {
            System.out.println("Mahasiswa ke: " + (i + 1));
            System.out.println("Nama: ");
            name[i] = sc.next();
            
            System.out.println("Nilai: ");
            nilai[i] = sc.nextInt();
            
            if (nilai[i]<=50){
                status[i] = "tidak lulus";

                
            }
            else {
                status[i] = "lulus";

            }
            System.out.println("Status: " + status[i]);
        }
            
        }
        
            
        } 
    

