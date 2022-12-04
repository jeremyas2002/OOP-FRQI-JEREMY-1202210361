public class Laptop extends Perangkat{
    protected boolean webcam;

    public Laptop(String drive, int ram, float processor, boolean webcam){
        super(drive, ram, processor);
        this.webcam = webcam;

    }

    public void informasi(){
        System.out.println("Laptop ini memiliki drive tipe seagete dengan ram 8 GB dan processor 2.40 Ghz, juga diserai dengan webcam");
    }
    public void bukaGame(String nama_game){
        System.out.println("Laptop berhasil membuka game point blank");
    }
    public void kirimEmail(String email){
        System.out.println("Laptop berhasil mengirim email ke desjar2022@gmail.com");
    }
    public void downloadFile(String file1, string file2){
        System.out.println("Laptop berhasil mendowload file netbeans dan file eclipse");
    }
}