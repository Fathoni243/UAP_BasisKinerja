package UTPBasisKinerja.Tugas4.UBFood;

import java.util.Scanner;

public class Main {
    
    static Scanner scan = new Scanner(System.in);

    static void ulangi(String ulang){
        System.out.println("");
        System.out.println("Ulangi ? (Y/T)");
        System.out.print("Inputan Anda : ");
        ulang = scan.next();
        System.out.println("");
        if (ulang.equalsIgnoreCase("t")) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        boolean kondisi = true;
        String ulang = null;
        
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000));

        while (kondisi) {
            DataMerchant.Menu();
            byte input = scan.nextByte();
            scan.nextLine();
            System.out.println();
            if (input == 1) {
                DataMerchant.tampilData();
                System.out.println("Semua Data Berhasil Ditampilkan");
                ulangi(ulang);
            }else if (input == 2) {
                System.out.println("== Masukkan Data Merchant yang Ditambahkan ==");
                System.out.print("Masukkan Nama Merchant : ");
                String namaMerchant = scan.nextLine();
                System.out.print("Masukkan Nama Produk   : ");
                String namaProduk = scan.nextLine();
                System.out.print("Masukkan Harga Produk  : ");
                Double Harga = scan.nextDouble();
                DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant(namaMerchant, namaProduk, Harga));
                System.out.println("Data Berhasil Ditambahkan");
                ulangi(ulang);
            }else if(input == 3) {
                System.out.print("Cari Berdasarkan Nama Merchant : ");
                String cariNama = scan.nextLine();
                DataMerchant.tampilMerchant(DataMerchant.cariMerchant(cariNama));
                ulangi(ulang);
            }else if (input == 4) {
                System.out.print("Masukkan Berdasarkan Nama Merchant : ");
                String cariNama = scan.nextLine();
                DataMerchant.tampilMerchant(DataMerchant.cariMerchant(cariNama));
                DataMerchant.updateMerchant(DataMerchant.cariMerchant(cariNama));
                ulangi(ulang); 
            }else if (input == 5) {
                kondisi = false;
            }else{
                System.out.println("Inputan Anda Salah");
                ulangi(ulang);
            }
            
        }
        
    }
}
