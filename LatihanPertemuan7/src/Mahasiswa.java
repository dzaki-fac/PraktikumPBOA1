class Mahasiswa extends Civitasakademika {
    String NIM;
    Dosen dosenWali;

    Mahasiswa(String nama, String NIM, Dosen dosenWali) {
        super(nama);
        this.NIM = NIM;
        this.dosenWali = dosenWali;
    }

    String getNomor() {
        return NIM;
    }

    void setWali(Dosen d) {
        this.dosenWali = d;
    }

    void tampilDataMahasiswa() {
        System.out.println(NIM + " " + nama + " " + dosenWali.nama);
    }
}