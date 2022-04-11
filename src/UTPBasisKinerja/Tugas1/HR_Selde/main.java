package UTPBasisKinerja.Tugas1.HR_Selde;

import java.util.*;

public class main {

    static String putar(String angkaString){
        String hasil="";
        int jml = angkaString.length();
        
        for (int i = 0; i < angkaString.length(); i++) {
            hasil += angkaString.charAt(jml-1);
            jml--;
        }

        return hasil;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();
        String ubah = String.valueOf(input);

        if (putar(ubah).equals(ubah)) {
            System.out.println(ubah + " adalah selde.");
        }else{
            System.out.println(ubah + " bukan selde.");
        }

    }
}
