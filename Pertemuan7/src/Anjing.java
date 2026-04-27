class Anjing extends Anabul {
    Anjing(String nama) {
        super(nama);
    }

    void gerak() {
        System.out.println(nama + " bergerak dengan melata");
    }

    void bersuara() {
        System.out.println(nama + " bersuara guk-guk");
    }
}