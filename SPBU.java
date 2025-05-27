import java.util.Scanner;
public class SPBU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih;
        do { 
            System.out.println("\n--- Menu SPBU ---");
            System.out.println("1. Tambah Antrian Kendaraan");
            System.out.println("2. Tampilkan Antrian");
            System.out.println("3. Cek Jumlah Antrian Kendaraan");
            System.out.println("4. Layani Kendaraan");
            System.out.println("5. Tampilkan Riwayat Transaksi");
            System.out.println("0. Keluar");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih){ 
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Invalid input.");
            }
        } while(pilih != 0);
    }
}