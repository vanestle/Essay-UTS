package StudyCase;

import java.util.Scanner;

public class EssaySatu {
    public static void main(String[] args) {
        
        int sum = 0;
        int count = 0;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Masukkan nilai kelas bawah: ");
        int bawah = sc.nextInt();
        System.out.println("Masukkan nilai kelas atas: ");
        int atas = sc.nextInt();
        
        for (int i = bawah; i < atas; i++) {
            int check = 0;
            for (int j = 1; j < atas; j++) {
                if(i%j==0){
                check++;
            } 
            }
            if ((check==2)&&(i!=1)){
                System.out.println(i+ " ");
                count++;
                sum+=i;
            }
            
        }
        System.out.println("");
        System.out.println("Maka total semua data adalah: " + sum);
        System.out.println("Banyak data: " + count);
        
    }
}
