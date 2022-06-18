package UAPBasisKinerja.Tugas7.SKPolymorphism;

public class PegawaiTetap extends Pegawai{
    double upah;

    PegawaiTetap(String nama, String noKTP, double upah) {
        super(nama, noKTP);
        this.upah = upah;
    }
    
    public void setUpah(double upah) {
        this.upah = upah;
    }

    public double getUpah() {
        return upah;
    }

    @Override
    public double gaji() {
        return getUpah();
    }

    @Override
    public String toString() {
        return "Pegawai Tetap   : "+super.getNama()+
                "\nNo KTP          : "+super.getNoKTP()+
                "\nUpah            : "+this.getUpah()+
                "\nPendapatan      : "+super.getFormattedPrice(this.gaji());
    }

}
