package UAPBasisKinerja.Tugas6.SKInheritance;

public class Pekerja extends Manusia{
    private double gaji;
    private double bonus;
    private int jamKerja;
    private int hariKerja;
    private String NIP;

    Pekerja(int jamKerja, int hariKerja, String NIP, String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        super(nama, NIK, jenisKelamin, menikah);
        this.jamKerja = jamKerja;
        this.hariKerja = hariKerja;
        this.NIP = NIP;
    }

    public double getGaji() {
        gaji = this.getHariKerja() * this.getJamKerja() * 15;
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getBonus() {
        int libur = 0;
        int minggu = 0;
        for(int i = 1; i <= getHariKerja(); i++){
           if((i - minggu) % 6 == 0){
              libur++;
           }
           if(i % 7 == 0){
              libur++;
              minggu++;
           }
        }

        double jamLembur = (getJamKerja() -7) < 0 ? 0 : getJamKerja() - 7;

        double bonusLembur = (getHariKerja()-libur) * jamLembur * 7;
        double bonusLibur = libur * getJamKerja() * 20;
        bonus = bonusLembur + bonusLibur;
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public int getHariKerja() {
        return hariKerja;
    }

    public void setHariKerja(int hariKerja) {
        this.hariKerja = hariKerja;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getStatus(){
        String kantorCabang = "";
        String numKC = Character.toString(getNIP().charAt(2));
        String Departemen = "";

        switch (getNIP().charAt(0)) {
            case '1':
                kantorCabang = "Mondstadt";
                break;
            case '2':
                kantorCabang = "Liyue";
                break;
            case '3':
                kantorCabang = "Inazuma";
                break;
            case '4':
                kantorCabang = "Sumeru";
                break;
            case '5':
                kantorCabang = "Fontaine";
                break;
            case '6':
                kantorCabang = "Natlan";
                break;
            case '7':
                kantorCabang = "Snezhnaya";
                break;
        }

        switch (getNIP().charAt(6)) {
            case '1':
                Departemen = "Pemasaran";
                break;
            case '2':
                Departemen = "Humas";
                break;
            case '3':
                Departemen = "Riset";
                break;
            case '4':
                Departemen = "Teknologi";
                break;
            case '5':
                Departemen = "Personalia";
                break;
            case '6':
                Departemen = "Akademik";
                break;
            case '7':
                Departemen = "Administrasi";
                break;
            case '8':
                Departemen = "Operasional";
                break;
            case '9':
                Departemen = "Pembangunan";
                break;
        }

        return Departemen+", "+kantorCabang+" cabang "+numKC;
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan()+this.getGaji()+this.getBonus();
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nBonus         : "+this.getBonus()+"$"+
                "\nGaji          : "+this.getGaji()+"$"+
                "\nStatus        : "+this.getStatus();
    }
    
}
