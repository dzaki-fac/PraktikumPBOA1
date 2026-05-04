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