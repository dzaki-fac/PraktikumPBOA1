public class MMahasiswa {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.tampil();

        Mahasiswa m2 = new Mahasiswa("30103", "Dzaki", "Informatika");
        m2.tampil();

        Mahasiswa m3 = new Mahasiswa(m2);
        m3.tampil();

        m1.setProgramStudi();
        m1.tampil();

        m1.setProgramStudi("Sistem Informasi");
        m1.tampil();

        m1.setProgramStudi(m2);
        m1.tampil();
    }
}