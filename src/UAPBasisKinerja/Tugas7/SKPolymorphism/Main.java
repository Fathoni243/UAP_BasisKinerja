package UAPBasisKinerja.Tugas7.SKPolymorphism;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pegawai> pegawais = new ArrayList<Pegawai>();

        pegawais.add(new PegawaiTetap("Ahmad", "215150700111021", 2000000));
        pegawais.add(new PegawaiTetap("Fathoni", "3556725636537", 1500000));
        pegawais.add(new PegawaiTetap("Adam", "215150700111021", 3000000));
        
        pegawais.add(new PegawaiHarian("Sam", "112313123123123", 8500, 40));
        pegawais.add(new PegawaiHarian("Irtada", "45676543456765", 4000, 36));
        pegawais.add(new PegawaiHarian("Bariq", "65432345654345", 8000, 50));

        pegawais.add(new Sales("Bryan", "215514532665022", 50, 50000));
        pegawais.add(new Sales("Alex", "215145452424488", 40, 40000));
        pegawais.add(new Sales("Immanuel", "215514532665022", 60, 40000));

        for (int i = 0; i < pegawais.size(); i++) {
            getToString(pegawais.get(i));
            System.out.println("-".repeat(40));
        }
    }

    public static void getToString(Pegawai p){
        if (p instanceof PegawaiTetap) {
            PegawaiTetap pegawaiTetap = (PegawaiTetap) p;
            System.out.println(pegawaiTetap.toString()); 
        }else if(p instanceof PegawaiHarian){
            PegawaiHarian pegawaiHarian = (PegawaiHarian) p;
            System.out.println(pegawaiHarian.toString());
        }else if (p instanceof Sales) {
            Sales sales = (Sales) p;
            System.out.println(sales.toString());
        }
    }
}