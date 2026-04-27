class Kucing extends Anabul {
    Kucing(String nama) {
        super(nama);
    }

    void gerak() {
        System.out.println(nama + " bergerak dengan melata");
    }

    void bersuara() {
        System.out.println(nama + " berbunyi meong");
    }
}