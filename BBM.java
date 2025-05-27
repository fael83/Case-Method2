public class BBM {
    String namaBBM;
    double hargaPerLiter;
    double jumlahltr;
    double totalBayar;
    Kendaraan data;
    BBM next;
    BBM prev;

    public BBM(BBM prev, Kendaraan data, BBM next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }

    public BBM(String namaBBM, double hargaPerLiter) {
        this.namaBBM = namaBBM;
        this.hargaPerLiter = hargaPerLiter;
    }
}