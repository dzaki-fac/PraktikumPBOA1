public class MBangunDatar{
    public static void main (String[] args){
        Persegi Persegi1 = new Persegi(4, "biru", "hitam");
        Lingkaran Lingkaran1 = new Lingkaran(14, "pink", "hitam");
        Persegi1.printInfo();
        Lingkaran1.printInfo();

        System.out.println("Keliling Persegi1 : " + Persegi1.getKeliling());
        System.out.println("Luas Persegi : " + Persegi1.getLuas());

        System.out.println("Keliling Lingkaran1 : " + Lingkaran1.getKeliling());
        System.out.println("Luas Lingkaran1 : " + Lingkaran1.getLuas());

        // BangunDatar B1 = new BangunDatar();
        BangunDatar P1 = new Persegi(10,"Biru","Merah");
        Persegi P2 = new Persegi(5,"Biru","Merah");
        BangunDatar L1 = new Lingkaran(7,"Biru","Merah");
        Lingkaran L2 = new Lingkaran (7,"Biru","Merah");

        System.out.println("Apakah luas P1 = luas P2 : " + P1.isEqualLuas(P2));
        System.out.println("Apakah Keliling L1 = Keliling L2 : " + L1.isEqualKeliling(L2));
    }
}