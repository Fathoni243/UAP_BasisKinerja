package UAPBasisKinerja.Tugas5.RentCar;

import java.util.ArrayList;

public class RentArchive {
    private ArrayList<CarRent> rentData = new ArrayList<CarRent>();

    public void Rent(CarRider rider, Car car, int rentDur){
        CarRent carRent = new CarRent(rider, car, rentDur);

        if (car.isStatus() == true) {
            rentData.add(carRent);  
            System.out.println("MOBIL "+car.getMerk().toUpperCase()+" BERHASIL DISEWA OLEH "+rider.getName().toUpperCase());
            car.setStatus(String.valueOf(false));
        }else{
            System.out.println("MAAF "+rider.getName().toUpperCase()+", MOBIL "+car.getMerk().toUpperCase()+" SUDAH DISEWA");
        }
    }

    public void info(){
        System.out.println("-".repeat(32));
        System.out.println("INFORMASI PELANGGAN");
        System.out.println("-".repeat(32));
        for (int i = 0; i < rentData.size(); i++) {
            System.out.println("NAMA PEMINJAM : "+rentData.get(i).getRider().getName());
            System.out.println("TIPE MOBIL    : "+rentData.get(i).getCar().getCarType());
            System.out.println("NO. POLISI    : "+rentData.get(i).getCar().getPolNum());
            System.out.println("LAMA RENTAL   : "+rentData.get(i).getRentDur());
            System.out.println("-".repeat(32));
        }
    }
}
