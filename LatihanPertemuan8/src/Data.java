/* Pembuat     : Dzaki Fathul 'Alim Cahyo/24060124130103
 * Tanggal     : 27 April 2026
 */

class Data<T> {
    T[] ruang;
    int banyak;

    Data() {
        ruang = (T[]) new Object[100];
        banyak = 0;
    }

    void setIsi(int posisi, T nilai) {
        if (posisi >= 1 && posisi <= 100) {
            ruang[posisi - 1] = nilai;
            if (posisi > banyak) {
                banyak = posisi;
            }
        }
    }

    T getIsi(int posisi) {
        if (posisi >= 1 && posisi <= banyak) {
            return ruang[posisi - 1];
        }
        return null;
    }

    int getSize() {
        return banyak;
    }
}