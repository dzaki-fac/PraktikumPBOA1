/* Pembuat     : Dzaki Fathul 'Alim Cahyo/24060124130103
 * Tanggal     : 27 April 2026
 */

class Burung extends Anabul {
    Burung(String nama) {
        super(nama);
    }

    void gerak() {
        System.out.println(nama + " bergerak dengan terbang");
    }

    void bersuara() {
        System.out.println(nama + " berbunyi cuit");
    }
}