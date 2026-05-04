public class Kucing extends Anabul {
    double bobot;

    Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    void gerak() {
        System.out.println(nama + " melata");
    }

    void bersuara() {
        System.out.println(nama + " meong");
    }
}