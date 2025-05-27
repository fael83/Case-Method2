public class TransaksiPengisian {
    Kendaraan kendaraan = new Kendaraan();
    BBM bbm = new BBM();
    double liter;
    double totalBayar;

    public TransaksiPengisian() {
    }

    public TransaksiPengisian(double liter, double totalBayar) {
        this.liter = liter;
        this.totalBayar = totalBayar;
    }
}