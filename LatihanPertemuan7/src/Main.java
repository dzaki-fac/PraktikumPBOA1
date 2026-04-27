/* Nama File   : Main.java
 * Pembuat     : Dzaki Fathul 'Alim Cahyo/24060124130103
 * Tanggal     : 27 April 2026
 */



public class Main {
    public static void main(String[] args) {

        Dosen d1 = new Dosen("Pak Budi", "D001");
        Dosen d2 = new Dosen("Bu Sari", "D002");

        Mahasiswa m1 = new Mahasiswa("Andi", "M001", d1);
        Mahasiswa m2 = new Mahasiswa("Budi", "M002", d1);
        Mahasiswa m3 = new Mahasiswa("Cici", "M003", d2);
        Mahasiswa m4 = new Mahasiswa("Dodi", "M004", d2);
        Mahasiswa m5 = new Mahasiswa("Eka", "M005", d1);

        Seminar s = new Seminar();

        s.registrasi(d1);
        s.registrasi(d2);
        s.registrasi(m1);
        s.registrasi(m2);
        s.registrasi(m3);
        s.registrasi(m4);
        s.registrasi(m5);

        System.out.println(s.countPeserta());

        s.tampilPeserta();

        System.out.println(s.countMahasiswa());

        m1.setWali(d2);

        m1.tampilDataMahasiswa();
        m2.tampilDataMahasiswa();
        m3.tampilDataMahasiswa();
        m4.tampilDataMahasiswa();
        m5.tampilDataMahasiswa();
    }
}