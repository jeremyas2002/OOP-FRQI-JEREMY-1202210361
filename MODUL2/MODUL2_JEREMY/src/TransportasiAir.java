public class TransportasiAir {
    protected int jumlahKursi, biaya;

    public TransportasiAir(int jumlahKursi, int biaya){
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;

    }
    public void informasi(){
        System.out.println("Transportasi air dengan jenis tidak diketahui dengan kursi berjumlah 4 dikenai biaya Rp2000");
    }
    public void berlayar(){
        System.out.println("Transportasi air dengan jenis tidak diketahui sedang berlayar");
    }
    public void berlabuh(){
        System.out.println("Transportasi air dengan jenis tidak diketahui sedang berlabuh");
    }
}