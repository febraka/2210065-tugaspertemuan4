package tugas.perulangan;

import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan angka: ");
        int n = input.nextInt();
        
        if (n <= 0){
            System.out.println("Inputan harus lebih dari 0");
        }
        
        for(int i = 1; i <= n; i++){
            System.out.println(i);
        }
        input.close();
    }   
}