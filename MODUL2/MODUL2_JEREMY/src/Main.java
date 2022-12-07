public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Class Sampan");
        Sampan sampan1 = new Sampan(20, 50000,2 );
        sampan1.informasi();
        sampan1.berlayar();
        sampan1.berlabuh();
        System.out.println("");

        System.out.println("Class Kapal");
        Kapal kapal1 = new Kapal(50, 1000000, 20);
        kapal1.informasi();
        kapal1.berlayar();
        kapal1.berlabuh();
        System.out.println("");


    
    }
}
