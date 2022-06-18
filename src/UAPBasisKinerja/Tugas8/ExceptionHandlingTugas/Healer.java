package UAPBasisKinerja.Tugas8.ExceptionHandlingTugas;

public class Healer extends Character{

    Healer(int defence, int attack, int HP) {
        super(defence, attack, HP);
    }

    @Override
    public boolean attack() {
        boolean kena;
        double randomNum = (double)(Math.random() * 11); 
        // cek randomNum
        // System.out.println("random healer :"+randomNum);
        
        if (randomNum <= 8.5) {
            kena = true;
        }else{
            kena = false;
        }

        return kena;
    }

    public void heal(){
        setHP(getHP() + 25);
    }
    
}
