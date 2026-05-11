/* Pembuat     : Dzaki Fathul 'Alim Cahyo/24060124130103
 * Tanggal     : 4 Mei 2026
 */
public class MainPiaraan {
    public static void main(String[] args) {
        Piaraan klinik = new Piaraan();

        Kucing mpus = new Kucing("Mpus", 4.5);
        Kucing oyen = new Kucing("Oyen", 5.2);
        Anabul doggy = new Anabul("Doggy"); 

        klinik.enqueueAnabul(mpus);
        klinik.enqueueAnabul(oyen);
        klinik.enqueueAnabul(doggy);
        
        System.out.println("Jumlah elemen: " + klinik.getNbelm());

        System.out.println("\n showAnabul ");
        klinik.showAnabul();

        System.out.println("\n showJenisAnabul ");
        klinik.showJenisAnabul();

        System.out.println("\nCek Oyen: " + klinik.isMember(oyen));

        System.out.println("\nBanyak Kucing: " + klinik.countKucing());
        System.out.println("Total Bobot Kucing: " + klinik.bobotKucing());

        System.out.println("\n Dequeue ");
        Anabul diproses = klinik.dequeue();
        System.out.println("Keluar: " + diproses.getNama());
        System.out.println("Sisa elemen: " + klinik.getNbelm());
        
        System.out.println("\n Antrean Terbaru");
        klinik.showAnabul();
    }
}

//renungan
//koleksi merupakan objek yang berfungsi sebagai wadah dari objek2 lain
//tujuannya untuk mudah dikelola dan berbagai kegunaan lainnya

