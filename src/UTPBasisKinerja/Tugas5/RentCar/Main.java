package UTPBasisKinerja.Tugas5.RentCar;

public class Main {
    public static void main(String[] args) {
        CarData data = new CarData();
        data.addCar("SUV", "N 1111 AF", "Honda");
        data.addCar("SPORT", "N 2222 AF", "Lamborghini");
        data.addCar("TRUCK", "N 3333 AF", "Suzuki");
        data.addCar("PICK UP", "N 4444 AF", "Mitsubishi");

        data.listOfCar();
        System.out.println();
        
        CarRider Bryan = new CarRider("Koh Bryan", 19, "08970987678");
        CarRider Adam = new CarRider("Koh Adam", 20, "089876545676");
        CarRider Aldy = new CarRider("Koh Aldy", 31, "0898765456788");
        CarRider Faza = new CarRider("Koh Faza", 29, "0898765456789");

        RentArchive arsip = new RentArchive();
        arsip.Rent(Bryan, data.getCarList().get(1), 9);
        arsip.Rent(Adam, data.getCarList().get(2), 3);
        arsip.Rent(Aldy, data.getCarList().get(1), 1);
        arsip.Rent(Faza, data.getCarList().get(3), 10);

        System.out.println();
        arsip.info();

        System.out.println();
        System.out.println("-".repeat(32));
        System.out.println("DIBUAT OLEH");
        System.out.println("-".repeat(32));
        System.out.println("NAMA          : Ahmad Fathoni");
        System.out.println("NIM           : 215150700111021");
        System.out.println("-".repeat(32));
    }   
}
