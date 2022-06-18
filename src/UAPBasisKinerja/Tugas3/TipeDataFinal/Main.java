package UAPBasisKinerja.Tugas3.TipeDataFinal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Baju.displayBaju();
        System.out.print("Baju yang akan anda beli bertipe : ");
        String jenis = scan.next();
        System.out.print("Jumlah Baju yang akan anda beli adalah : ");
        int jumlah = scan.nextInt();

        Baju baju = new Baju(jenis, jumlah);
        
        baju.display();

    }
}
