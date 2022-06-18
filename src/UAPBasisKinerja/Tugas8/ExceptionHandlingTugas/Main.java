package UAPBasisKinerja.Tugas8.ExceptionHandlingTugas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean kondisi = true;
        boolean ulang = true;
        
        Character titan = new Titan(0, 45, 200);
        Character magician = new Magician(10, 60, 100);
        Character healer = new Healer(10, 10, 70);
        Character warrior = new Warrior(30, 25, 80);
        
        System.out.println("Selamat Datang di Game Defend FILKOM!");
        System.out.print("Silahkan Masukkan Nama Player : ");
        String nama = scan.nextLine();
        
        while (ulang) {
            boolean condition = true;
            int pilih = 0;
            while (condition) {
                try {
                    System.out.println("Silahkan pilih karakter yang anda inginkan : ");
                    System.out.println("1. Magician");
                    System.out.println("2. Healer"); 
                    System.out.println("3. Warrior");
                    System.out.print("Masukkan Pilihan Anda : ");
                    pilih = scan.nextInt();
                    condition = false;  
                } catch (InputMismatchException e) {
                    System.out.println("Tolong Masukkan Angka");
                }
                scan.nextLine();
            }
            
            if (pilih == 1) {
                System.out.println("Selamat Datang, "+nama+" !");
                System.out.println("-".repeat(12)+" STATUS "+"-".repeat(12));
                info(magician);
                
                int i=1;
                while (kondisi) {
                    System.out.println("=".repeat(12)+" TURN "+(i++)+" "+"=".repeat(12));
                    serang(magician, titan, nama);
                    
                    if (titan.getHP() == 0 || magician.getHP() == 0){
                        kondisi = false;
                    }
                }
                System.out.println();
                System.out.println("=".repeat(33));

                cekPemenang(titan, nama);
                System.out.println();
                
                infoAkhir(magician, titan);
                ulang = false;
            }else if(pilih == 2){
                System.out.println("Selamat Datang, "+nama+" !");
                System.out.println("-".repeat(12)+" STATUS "+"-".repeat(12));
                info(healer);
                
                int i=1;
                while (kondisi) {
                    System.out.println("=".repeat(12)+" TURN "+i+" "+"=".repeat(12));
                    i++;
                    if (i%2 == 1) {
                        System.out.println("Menggunakan skill heal");
                        ((Healer)healer).heal();
                    }
                    
                    serang(healer, titan, nama);
                    
                    if (titan.getHP() == 0 || healer.getHP() == 0){
                        kondisi = false;
                    }
                }
                System.out.println();
                System.out.println("=".repeat(33));
                
                cekPemenang(titan, nama);
                System.out.println();
                
                infoAkhir(healer, titan);
                ulang = false;
            }else if (pilih == 3) {
                System.out.println("Selamat Datang, "+nama+" !");
                System.out.println("-".repeat(12)+" STATUS "+"-".repeat(12));
                info(warrior);
                
                int i=1;
                while (kondisi) {
                    System.out.println("=".repeat(12)+" TURN "+(i++)+" "+"=".repeat(12));
                    serang(warrior, titan, nama);
                    
                    if (titan.getHP() == 0 || warrior.getHP() == 0){
                        kondisi = false;
                    }
                }
                System.out.println();
                System.out.println("=".repeat(33));
                
                cekPemenang(titan, nama);
                System.out.println();
                
                infoAkhir(warrior, titan);
                ulang = false;
            }else {
                System.out.println("Inputan anda salah!");
            }   
        }   
    }
    
    public static void serang(Character player,Character enemy, String nama){
        if (player.attack() == true) {
            enemy.receiveDamage(player.getAttack());
        }
        if (enemy.attack() == true) {
            player.receiveDamage(enemy.getAttack());
        }
        
        System.out.println("Enemy's HP : "+enemy.getHP());
        System.out.println(nama+"'s HP : "+player.getHP());
    }
    
    public static void info(Character character){
        Class className = character.getClass();
        System.out.println("Role        : "+className.getSimpleName());
        character.info();
    }

    public static void infoAkhir(Character player, Character enemy){
        System.out.println("=".repeat(12)+" PLAYER "+"=".repeat(13));
        System.out.println("-".repeat(12)+" STATUS "+"-".repeat(13));
        info(player);
        System.out.println("=".repeat(12)+" ENEMY "+"=".repeat(14));
        System.out.println("-".repeat(12)+" STATUS "+"-".repeat(13));
        info(enemy);
    }

    public static void cekPemenang(Character enemy, String nama){
        if (enemy.getHP() == 0) {
            System.out.println(nama+" menang");
        }else {
            System.out.println("Titan Menang");
        }
    }

}
