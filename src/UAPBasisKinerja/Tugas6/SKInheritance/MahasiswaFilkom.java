package UAPBasisKinerja.Tugas6.SKInheritance;

public class MahasiswaFilkom extends Manusia{
    private String NIM;
    private double IPK;

    MahasiswaFilkom(String nama, String NIK, boolean jenisKelamin, boolean menikah, String NIM, Double IPK) {
        super(nama, NIK, jenisKelamin, menikah);
        this.NIM = NIM;
        this.IPK = IPK;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public double getIPK() {
        return IPK;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    public String getStatus(){
        String angkatan = "20"+getNIM().substring(0,2);
        String prodi = "";

        if (getNIM().charAt(6) == '2') {
            prodi = "Teknik Meniup Gelembung";
        }else if (getNIM().charAt(6) == '3') {
            prodi = "Teknik Berburu Ubur Ubur";
        }else if (getNIM().charAt(6) == '4') {
            prodi = "Sistem Perhamburgeran";
        }else if (getNIM().charAt(6) == '6') {
            prodi = "Pendidikan Chum Bucket";
        }else if (getNIM().charAt(6) == '7') {
            prodi = "Teknologi Telepon Kerang";
        }

        return prodi+", "+angkatan;
    }

    public double getBeasiswa(){
        double beasiswa = 0;
        if (getIPK() >= 3.0 && getIPK() <= 3.5) {
            beasiswa = 50;
        }else if (getIPK() > 3.5 && getIPK() <= 4) {
            beasiswa = 75;
        }

        return beasiswa;
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + this.getBeasiswa();
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nNIM           : "+this.getNIM()+
                "\nIPK           : "+this.getIPK()+
                "\nStatus        : "+this.getStatus();

    }

}
