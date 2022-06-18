package UAPBasisKinerja.Tugas6.SKInheritance;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Manusia> ArrayManusia = new ArrayList<Manusia>();

        ArrayManusia.add(new Manusia("Aku", "3923842934",true, true));
        ArrayManusia.add(new Manusia("Kamu", "0987654567", false, true));
        ArrayManusia.add(new Manusia("Kita", "5676547656", false, false));
        
        ArrayManusia.add(new MahasiswaFilkom("I Putu Yoga", "351923848239", false,false, "205150601111018",3.70));
        ArrayManusia.add(new MahasiswaFilkom("I Putu Orang", "636436434639", true,true, "343242342342343",3.20));
        ArrayManusia.add(new MahasiswaFilkom("I Putu Putu", "7654345676543", true,false, "67876545676543",2.90));
        
        ArrayManusia.add(new Pekerja(7, 22,"195102439283", "Iqbal Biondy", "351717969", true,true));
        ArrayManusia.add(new Pekerja(8, 28,"324234234234", "Ahmad Fathoni", "654567678", false,true));
        ArrayManusia.add(new Pekerja(9, 24,"765434567877", "Sam Irtada", "45432346545", true,false));
        
        ArrayManusia.add(new Manajer(9, 20,"204837283728", "Lyra Hertin", "3517073843920",false, false, 1500));
        ArrayManusia.add(new Manajer(10, 17,"345676545678", "Wisnu Tama", "8765434567876",true, true, 900));
        ArrayManusia.add(new Manajer(11, 25,"989899410988", "Yeyen Tata", "6543456789876",true, false, 600));
        
        for (Manusia manusia : ArrayManusia) {
            System.out.println(manusia.toString());
            System.out.println("-----------------------------------------------");
        }

    }
}
