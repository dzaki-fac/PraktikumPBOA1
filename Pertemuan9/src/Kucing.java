/* Pembuat     : Dzaki Fathul 'Alim Cahyo/24060124130103
 * Tanggal     : 27 April 2026
 */

public class Kucing extends Anabul {
    double bobot;

    Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    public void setBobot(double bobot) {
        this.bobot = bobot;
    }

    public double getBobot() {
        return bobot;
    }

    void gerak() {
        System.out.println(nama + " melata");
    }

    void bersuara() {
        System.out.println(nama + " meong");
    }
}