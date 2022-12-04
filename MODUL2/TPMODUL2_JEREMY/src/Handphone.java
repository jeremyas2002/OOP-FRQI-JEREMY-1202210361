public class Handphone extends Perangkat{
    protected boolean fingerPrint;

    public Handphone(String drive, int ram, float processor, boolean fingerPrint){
        super(drive, ram, processor);
        this.fingerPrint = fingerPrint;

    }

    public void informasi(){
        System.out.println("Handphone ini memiliki ram 8 GB dan processor secepat 2.20 Ghz, dan memiliki fingerprint");
    }
    public void telfon(int no_hp){
        System.out.println("Handphone berhasil menyambungkan telfon ke nomor 08888888");
    }
    public void kirimSMS(int no_hp){
        System.out.println("Handphone berhasil mengirim sms ke nomo 087878788");
    }
    public void kirimWA(int no_wa1, int no_wa2){
        System.out.println("Handphone berhasil mengirim WA ke nomor 0872131381782 dan 087183612618");
    }

}
