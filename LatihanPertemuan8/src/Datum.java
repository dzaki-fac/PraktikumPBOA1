/* Pembuat     : Dzaki Fathul 'Alim Cahyo/24060124130103
 * Tanggal     : 27 April 2026
 */

class Datum<T> {
    T isi;

    Datum(T isi) {
        this.isi = isi;
    }

    T getIsi() {
        return isi;
    }

    void setIsi(T isiBaru) {
        this.isi = isiBaru;
    }
}