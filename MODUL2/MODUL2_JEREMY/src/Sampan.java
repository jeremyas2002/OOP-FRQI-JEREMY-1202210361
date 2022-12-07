public class Sampan extends TransportasiAir{
    protected int layar;

    public Sampan(int jumlahKursi, int biaya, int layar){
        super(jumlahKursi, biaya);
        this.layar = layar;

    }
    public void informasi(){
        System.out.println("Transportasi air jenis sampan dengan jumlah kursi" + jumlahKursi +" dikenai biaya " + biaya +"");
    }
    public void berlayar(){
        System.out.println("Transportasi air dengan jenis sampan sedang berlayar dengan "+ layar +" layar");
    }
    public void berlabuh(){
        System.out.println("Transportasi air dengan jenis sampan sedang berlabuh tanpa jangkar");
    }
    public void berlabuh(int jangkar){
        System.out.println("Transportasi air jenis sampan berlabuh di pantai menggunakan 2 jangakar");
    }
    
}
