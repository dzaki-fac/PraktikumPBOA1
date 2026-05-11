/* Pembuat     : Dzaki Fathul 'Alim Cahyo/24060124130103
 * Tanggal     : 4 Mei 2026
 */

import java.util.ArrayList;

public class MainTeman {
    public static void main(String[] args) {
        Teman koleksi = new Teman();
        koleksi.Lnama = new ArrayList<>();

        koleksi.addNama("Andi");
        koleksi.addNama("Budi");
        koleksi.addNama("Siti");
        koleksi.addNama("Andi");

        System.out.println("Jumlah: " + koleksi.getNbelm());
        koleksi.showTeman();

        System.out.println("Cek Siti: " + koleksi.isMember("Siti"));
        
        koleksi.gantiNama("Budi", "Agus");
        koleksi.showTeman();

        System.out.println("Jumlah nama Andi: " + koleksi.countNama("Andi"));

        koleksi.delNama("Siti");
        koleksi.showTeman();

        System.out.println("Indeks 1: " + koleksi.getNama(1));
        System.out.println("Jumlah akhir: " + koleksi.getNbelm());
    }
}

//renungan
//koleksi merupakan objek yang berfungsi sebagai wadah dari objek2 lain
//tujuannya untuk mudah dikelola dan berbagai kegunaan lainnya