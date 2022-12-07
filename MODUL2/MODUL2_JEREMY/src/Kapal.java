public class Kapal extends TransportasiAir{
    protected String mesin;

    public Kapal(int jumlahKursi, int biaya, String mesin){
        super(jumlahKursi, biaya);
        this.mesin = mesin;
    }

    public void informasi(){
        System.out.println("Transportasi air jenis kapal dengan jumlah kursi "+ jumlahKursi +"dikenai biaya "+ biaya +"");
    }
    public void berlayar(){
        System.out.println("Transportasi air jenis kapal sedang berlayar dengan mesin diesel dengan kecepatan tidak stabil");
    }
    public void berlayar(int kecepatan){
        System.out.println("Transportasi air jenis kapal sedang berlayar dengan mesin diesel dengan kecapatan "+ kecepatan +" knot");
    }
    public void berlabuh(){
        System.out.println("Transportasi air jenis kapal berlabuh di pantai kuta Bali");
    }
}
