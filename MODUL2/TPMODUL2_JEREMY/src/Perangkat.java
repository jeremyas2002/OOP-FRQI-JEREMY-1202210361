public class Perangkat {
    protected String drive, int ram, float processor;

    public Perangkat(String drive, int ram, float processor){
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;

    }
    
    public void Informasi(){
        System.out.println("Perangkat tidak diketahui memiliki drive tipe Adata dengan ram sebesar 2 GB dan processor secepat 1.80 Ghz");
    }
}
