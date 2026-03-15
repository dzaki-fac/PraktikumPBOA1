/* Nama File   : MPengawai.java
 * Deskripsi   : berisi atribut dan method dalam class Pengawai, Dosen, Tendik, DosenTetap, DosenTamu
 * Pembuat     : Dzaki Fathul 'Alim Cahyo/24060124130103
 * Tanggal     : 3 Mei 2026
 */

/* 
posisi folder di ./Pengawai
javac -d bin src\*.java
java -cp bin MPengawai 
*/

import java.time.LocalDate;

public class MPengawai {
    public static void main(String[] args) {
        //membuat objek dosen tetap dengan parameter

        DosenTetap DT1 = new DosenTetap("123456789", "987654321", "Budi Santoso", LocalDate.of(1980, 5, 20), LocalDate.of(2010, 8, 1), "Dosen Tetap", 5000000, "Teknik");

        //membuat objek dosen tamu dengan parameter
        DosenTamu DT2 = new DosenTamu("987654321", "Siti Aminah", LocalDate.of(1985, 10, 15), LocalDate.of(2020, 1, 1), "Dosen Tamu", 3000000, "Teknik", "123456789", LocalDate.of(2022, 12, 31));

        //membuat objek tendik dengan parameter
        Tendik T1 = new Tendik("555555555", "Andi Wijaya", LocalDate.of(1990, 3, 10), LocalDate.of(2015, 6, 1), "Tenaga Didik", 4000000, "Akademik");
        

        //menampilkan informasi dosen tetap
        System.out.println("Dosen Tetap:");
        DT1.printInfo();
        System.out.println("\n");

        //menampilkan informasi dosen tamu
        System.out.println("Dosen Tamu:");
        DT2.printInfo();
        System.out.println("\n");

        //menampilkan informasi tendik
        System.out.println("Tendik:");
        T1.printInfo();
        System.out.println("\n");
    }
}
