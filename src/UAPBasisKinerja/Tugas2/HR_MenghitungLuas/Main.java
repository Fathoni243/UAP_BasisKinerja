package UAPBasisKinerja.Tugas2.HR_MenghitungLuas;

import java.util.*;

class Persegi {
    int sisi;

    void RumusPersegi(int sisi){
        int hasil = sisi*sisi;
        System.out.println(hasil);
    }
}

class Segitiga {
    int alas, tinggi;

    void RumusSegitiga(int alas, int tinggi){
        int hasil = alas * tinggi / 2;
        System.out.println(hasil);
    }
}

class Lingkaran{
    int jj;

    void RumusLingkaran1(int jj){
        int hasil = (int) (22/7 * jj * jj);
        System.out.println((double) hasil);
    }

    void RumusLingkaran2(int jj){
        int hasil = (int) (3.14 * jj * jj);
        System.out.println((double) hasil);
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        byte input = scan.nextByte();

        if (input == 1) {
            Persegi persegi = new Persegi();
            persegi.sisi = scan.nextInt();
            persegi.RumusPersegi(persegi.sisi);

        }else if(input == 2){
            Segitiga segitiga = new Segitiga();
            segitiga.alas = scan.nextInt();
            segitiga.tinggi = scan.nextInt();
            segitiga.RumusSegitiga(segitiga.alas, segitiga.tinggi);

        }else if(input == 3){
            Lingkaran lingkaran = new Lingkaran();
            lingkaran.jj = scan.nextInt();
            if (lingkaran.jj % 7 == 0) {
                lingkaran.RumusLingkaran1(lingkaran.jj);
            }else{
                lingkaran.RumusLingkaran2(lingkaran.jj);
            }

        }else {
            System.out.println("Input yang anda masukan tidak sesuai");
        }
    }
}

