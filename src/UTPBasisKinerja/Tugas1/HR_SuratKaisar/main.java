package UTPBasisKinerja.Tugas1.HR_SuratKaisar;

import java.util.*;

public class main {
    
    static String geserHuruf(String kalimat, int pergeseran){
        String hasil = "";
        
        for (int i = 0; i < kalimat.length(); i++) {
            int hasilGeser = kalimat.charAt(i) + pergeseran;
            
            if (kalimat.charAt(i) == ' ') {
                hasil += ' ';
            }

            else if (kalimat.charAt(i) > 64 && kalimat.charAt(i) < 91) {
                if (hasilGeser > 90) {
                    hasil += (char)(hasilGeser - 26);
                }else {
                    hasil += (char)(hasilGeser);
                }
            }
            
            else if (kalimat.charAt(i) > 96 && kalimat.charAt(i)< 123){
                if (hasilGeser > 122) {
                    hasil += (char)(hasilGeser - 26);
                }
                else {
                    hasil += (char)(hasilGeser);
                }
            }
        }

        return hasil;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String kata = scan.nextLine();
        int geser = scan.nextInt();

        System.out.println(geserHuruf(kata, geser));
    }
}
