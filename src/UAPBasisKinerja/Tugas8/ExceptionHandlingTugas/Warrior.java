package UAPBasisKinerja.Tugas8.ExceptionHandlingTugas;

public class Warrior extends Character{

    Warrior(int defence, int attack, int HP) {
        super(defence, attack, HP);
    }

    @Override
    public boolean attack() {
        boolean kena;
        double randomNum = (double)(Math.random() * 11);
        // cek randomNum
        // System.out.println("random warrior :"+randomNum); 
        
        if (randomNum <= 6) {
            kena = true;
        }else{
            kena = false;
        }

        return kena;
    }
    
}
