package UAPBasisKinerja.Tugas3.TipeDataFinal;

class Baju{
    String jenis;
    int harga, jumlah;

    public Baju(String jenis, int jumlah){
        this.jenis = jenis;
        this.jumlah = jumlah;
    }

    final int hargaAwalA = 100000;
    final int hargaAwalB = 125000;
    final int hargaAwalC = 175000;

    int hargaA(){
        if (jumlah > 100) {
            harga = 95000;
        }else{
            harga = hargaAwalA;
        }
        return harga;
    }
    int hargaB(){
        if (jumlah > 100) {
            harga = 120000;
        }else{
            harga = hargaAwalB;
        }
        return harga;
    }
    int hargaC(){
        if (jumlah > 100) {
            harga = 160000;
        }else{
            harga = hargaAwalC;
        }
        return harga;
    }

    void display(){
        if (jenis.equalsIgnoreCase("a")) {
            hargaA();
        }else if(jenis.equalsIgnoreCase("b")){
            hargaB();
        }else if(jenis.equalsIgnoreCase("c")){
            hargaC();
        }

        System.out.println("Jenis yang anda beli : "+jenis);
        System.out.println("Harga per buah       : "+harga);
        System.out.println("Total Harga          : "+harga*jumlah);
    }

    static void displayBaju(){
        System.out.println("Baju yang tersedia : ");
        System.out.println("Baju A dengan Harga 100000");
        System.out.println("Baju B dengan Harga 125000");
        System.out.println("Baju C dengan Harga 175000");
    }
}
