import java.util.Scanner;

public class TransaksiPengisian {
    Kendaraan kendaraan;
    BBM bbm;
    double liter;
    double totalBayar;
    BBM head;
    BBM tail;
    int size;
    String [] transaksi = new String [100];
    int jumlahTransaksi = 0;

    public TransaksiPengisian() {
    }

    public TransaksiPengisian(Kendaraan kendaraan, BBM bbm, double liter) {
        this.kendaraan = kendaraan;
        this.bbm = bbm;
        this.liter = liter;
    }
    public boolean isEmpty(){
        return (head == null);
    }
    public void addFirst(Kendaraan kendaraan){
        if(isEmpty()){
            head = new BBM(null, kendaraan, null);
            tail = head;
        }else{
            BBM newNode = new BBM(null, kendaraan, head);
            head.prev = newNode;
        }
    }
    public void addLast(Kendaraan kendaraan){
        if(isEmpty()){
            addFirst(kendaraan);
        } else {
            BBM newNode = new BBM(tail, kendaraan, null);
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
        System.out.println(">> Kendaraan masuk ke dalam antrian.");
    }

    public void print(){
        if (!isEmpty()) {
            BBM tmp = head;
            System.out.println("Antrian Kendaraaan:");
            while (tmp != null) {
                tmp.data.tampilkanInformasi();
                tmp = tmp.next;
                System.out.println("--------------------------------------");
            }
        } else {
            System.out.println("Antrian Kosong");
        }
    }
   
    public void getSize(){
        System.out.println(">> Jumlah Kendaraan dalam antrian: " + size);
    }
    
    public Kendaraan dequeue(){
        Scanner sc = new Scanner(System.in);
        if(isEmpty()){
            System.out.println("Antrian masih kosong, belum ada kendaraan yang mengantri");
            return null;
        }
        BBM transaksi = head;
        Kendaraan kendaraanYangDilayani = transaksi.data;

        System.out.println("Petugas melayani " + kendaraanYangDilayani.platNomor);
        System.out.print("Masukkan Jenis BBM        : ");
        transaksi.namaBBM = sc.nextLine();
        System.out.print("Masukkan Harga per Liter  : ");
        transaksi.hargaPerLiter = sc.nextDouble();
        System.out.print("Masukkan Jumlah liter     : ");
        transaksi.jumlahltr = sc.nextInt();
        sc.nextLine();

        transaksi.totalBayar = transaksi.hargaPerLiter * transaksi.jumlahltr;
        System.out.println(">> Transaksi berhasil dicatat.");

        head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }

        size--;

        String keterangan = kendaraanYangDilayani.platNomor + ": Rp " + transaksi.totalBayar;
        if (jumlahTransaksi < 100) {
            this.transaksi[jumlahTransaksi] = keterangan;
            jumlahTransaksi++;
        } 
        return kendaraanYangDilayani;
    }
     public void tampilkanTransaksi(){
        if (jumlahTransaksi == 0){
            System.out.println("Belum ada transaksi");
        } else {
            System.out.println("-- Riwayat Transaksi -- ");
            System.out.println("Daftar transaksi:");
            for (int i = 0; i < jumlahTransaksi; i++) {
                System.out.println(transaksi[i]);
            }
        }
    }
}