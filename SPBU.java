import java.util.Scanner;
public class SPBU {
    public static Kendaraan inputKendaraan(Scanner sc){
        System.out.print("Masukkan Plat Nomor    : ");
        String platNomor = sc.nextLine();
        System.out.print("Masukkan Tipe Kendaraan: ");
        String tipe = sc.nextLine();
        System.out.print("Masukkan Merk Kendaraan: ");
        String merk = sc.nextLine();
        return new Kendaraan(platNomor, tipe, merk);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TransaksiPengisian trnski = new TransaksiPengisian();
        int pilih;
        do { 
            System.out.println("\n--- Menu SPBU ---");
            System.out.println("1. Tambah Antrian Kendaraan");
            System.out.println("2. Tampilkan Antrian");
            System.out.println("3. Cek Jumlah Antrian Kendaraan");
            System.out.println("4. Layani Kendaraan");
            System.out.println("5. Tampilkan Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih){ 
                case 1:
                    Kendaraan data = inputKendaraan(sc);
                    trnski.addLast(data);
                    break;
                case 2:
                    System.out.println("-- Antrian Kendaraan --");
                    trnski.print();
                    break;
                case 3:
                    trnski.getSize();
                    break;
                case 4:
                    trnski.dequeue();
                    break;
                case 5:
                    trnski.tampilkanTransaksi();
                    break;
                case 0:
                System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Invalid input. Masukkan menu 1-5");
            }
        } while(pilih != 0);
    }
}