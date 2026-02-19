/* Nama File   : MTitik.java
 * Deskripsi   : berisi atribut dan method dalam class Titik
 * Pembuat     : Dzaki Fathul 'Alim Cahyo   
 * Tanggal     : 2/19/2026
 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); //Membuat objek titik T1 (0,0)
        T1.setAbsis(3); //mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4); //mengubah ordinat T1 dengan nilai 4
        T1.printTitik(); //mencetak koordinat T1 ke layar
        T1.geser(3,4); //menggeser T1 sejauh (3,4)
        T1.printTitik(); //menampilkan koordinat T1 setelah digeser
    }
}
