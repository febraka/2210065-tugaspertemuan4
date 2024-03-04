package tugas.perulangan;

import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = 0, b = 0, c = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Masukkan nilai ke " + i + ": ");
            int nilai = input.nextInt();
            if (i == 1) {
                a = nilai;
            } else if (i == 2) {
                b = nilai;
            } else {
                c = nilai;
            }
        }

        if (a != b && a != c && b != c) {
            if (b < a && c < a) {
                if (Math.pow(b, 2) < (Math.pow(a, 2)) + (Math.pow(c, 2))) {
                    System.out.println("Segitiga siku siku");
                } else if (Math.pow(b, 2) > (Math.pow(a, 2)) + (Math.pow(c, 2))) {
                    System.out.println("Segitiga lancip");
                } else if (Math.pow(b, 2) == (Math.pow(a, 2)) + (Math.pow(c, 2))) {
                    System.out.println("Segitiga tumpul");
                }
            } else if (a < c && b < c) {
                if (Math.pow(b, 2) < (Math.pow(a, 2)) + (Math.pow(c, 2))) {
                    System.out.println("Segitiga siku siku");
                } else if (Math.pow(b, 2) > (Math.pow(a, 2)) + (Math.pow(c, 2))) {
                    System.out.println("Segitiga lancip");
                } else if (Math.pow(b, 2) == (Math.pow(a, 2)) + (Math.pow(c, 2))) {
                    System.out.println("Segitiga tumpul");
                }
            } else if (a < b && c < b) {
                if (Math.pow(b, 2) < (Math.pow(a, 2)) + (Math.pow(c, 2))) {
                    System.out.println("Segitiga siku siku");
                } else if (Math.pow(b, 2) > (Math.pow(a, 2)) + (Math.pow(c, 2))) {
                    System.out.println("Segitiga lancip");
                } else if (Math.pow(b, 2) == (Math.pow(a, 2)) + (Math.pow(c, 2))) {
                    System.out.println("Segitiga tumpul");
                }
            }
        } else {
            System.out.println("Tidak Valid");
        }

        input.close();
    }
}