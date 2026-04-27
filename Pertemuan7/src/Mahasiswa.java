class Mahasiswa {
    String NIM;
    String Nama;
    String ProgramStudi;

    Mahasiswa() {
        this.NIM = "-999";
        this.Nama = "n/a";
        this.ProgramStudi = "n/a";
    }

    Mahasiswa(String NIM, String Nama, String ProgramStudi) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.ProgramStudi = ProgramStudi;
    }

    Mahasiswa(Mahasiswa mhs) {
        this.NIM = mhs.NIM;
        this.Nama = mhs.Nama;
        this.ProgramStudi = mhs.ProgramStudi;
    }

    void setProgramStudi() {
        this.ProgramStudi = "Kosong";
    }

    void setProgramStudi(String ps) {
        this.ProgramStudi = ps;
    }

    void setProgramStudi(Mahasiswa mhs) {
        this.ProgramStudi = mhs.ProgramStudi;
    }

    void tampil() {
        System.out.println("NIM: " + NIM);
        System.out.println("Nama: " + Nama);
        System.out.println("Program Studi: " + ProgramStudi);
        System.out.println();
    }
}