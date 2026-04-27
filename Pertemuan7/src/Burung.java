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