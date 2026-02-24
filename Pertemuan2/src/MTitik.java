/* Nama File   : MTitik.java
 * Deskripsi   : berisi atribut dan method dalam class Titik
 * Pembuat     : Dzaki Fathul 'Alim Cahyo/24060124130103
 * Tanggal     : 19 Februari 2026
 */

/* 
posisi folder di ./Titik
javac -d bin src\*.java
java -cp bin MTitik 
*/

public class MTitik {
    public static void main(String[] args) {

        System.out.println("Membuat Titik T1");
        Titik T1 = new Titik();
        T1.printTitik();

        System.out.println("Set Absis = 3, Ordinat = 4");
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();

        System.out.println("Geser T1 sejauh (3,4)");
        T1.geser(3,4);
        T1.printTitik();

        System.out.println();

        System.out.println("Membuat Titik T2 (6,7)");
        Titik T2 = new Titik(6,7);
        T2.printTitik();

        System.out.println("Counter Titik:");
        System.out.println(Titik.getCounterTitik());

        System.out.println("Kuadran T2:");
        System.out.println(T2.getKuadran());

        System.out.println("Jarak T2 ke pusat:");
        System.out.println(T2.getJarakPusat());

        System.out.println();

        System.out.println("Refleksi X T2:");
        T2.RefleksiX();
        T2.printTitik();

        System.out.println("Refleksi Y T2:");
        T2.RefleksiY();
        T2.printTitik();

        System.out.println();

        System.out.println("Titik Refleksi Baru");
        Titik T3 = T2.getRefleksiX();
        T3.printTitik();

        System.out.println("Jarak T1 ke T2:");
        System.out.println(T1.getJarak(T2));
    }
}