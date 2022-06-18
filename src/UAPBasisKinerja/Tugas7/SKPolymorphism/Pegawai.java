package UAPBasisKinerja.Tugas7.SKPolymorphism;

public abstract class Pegawai {
    private String nama;
    private String noKTP;

    Pegawai(String nama, String noKTP){
        this.nama = nama;
        this.noKTP = noKTP;
    }

    public String getNama(){
        return nama;
    }

    public String getNoKTP(){
        return noKTP;
    }

    public abstract double gaji();

    public String toString(){
        return "Nama            : "+this.getNama()+
                "\nNo KTP          : "+this.getNoKTP();
    }

    public String getFormattedPrice(Double price){
        return String.format("Rp. %.0f", price);
    }
}
