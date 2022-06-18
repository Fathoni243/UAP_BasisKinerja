package UAPBasisKinerja.Tugas8.ExceptionHandlingTugas;

public class Magician extends Character{
    // double random;

    Magician(int defence, int attack, int HP) {
        super(defence, attack, HP);
    }

    @Override
    public boolean attack() {
        boolean kena;
        double randomNum = (double)(Math.random() * 11); 
        // cek randomNum
        // System.out.println("random magician :"+randomNum);

        if (randomNum <= 3.5) {
            kena = true;
        }else{
            kena = false;
        }

        return kena;
    }
    
}
