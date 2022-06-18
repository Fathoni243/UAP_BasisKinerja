package UAPBasisKinerja.Tugas7.SKPolymorphism;

public class PegawaiHarian extends Pegawai{
    private double upahPerJam;
    private int totalJam;
    
    PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam) {
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }
    
    public double getUpahPerJam() {
        return upahPerJam;
    }
    
    public int getTotalJam() {
        return totalJam;
    }

    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    @Override
    public double gaji() {
        double newGaji = 0;
        if (getTotalJam() <= 40) {
            newGaji = getUpahPerJam() * getTotalJam();
        }else {
            newGaji = (40 * getUpahPerJam()) + ((getTotalJam()-40) * getUpahPerJam() * 1.5); 
        }
        return newGaji;   
    }

    @Override
    public String toString() {
        return "Pegawai Harian  : "+super.getNama()+
                "\nNo KTP          : "+super.getNoKTP()+
                "\nUpah/jam        : "+this.getUpahPerJam()+
                "\nTotal Jam Kerja : "+this.getTotalJam()+
                "\nPendapatan      : "+super.getFormattedPrice(this.gaji());
    }
}
