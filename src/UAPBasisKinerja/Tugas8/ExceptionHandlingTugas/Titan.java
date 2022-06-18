package UAPBasisKinerja.Tugas8.ExceptionHandlingTugas;

public class Titan extends Character{
    double random;
    Titan(int defence, int attack, int HP) {
        super(defence, attack, HP);
    }

    @Override
    public boolean attack() {
        boolean kena;
        double randomNum = (double)(Math.random() * 11); 
        // cek randomNum
        // System.out.println("random titan :"+randomNum);

        if (randomNum <= 4) {
            kena = true;
        }else{
            kena = false;
        }

        return kena;
    }
    
}
