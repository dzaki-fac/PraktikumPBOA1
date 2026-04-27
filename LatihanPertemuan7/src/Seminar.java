class Seminar {
    Civitasakademika[] pesertas = new Civitasakademika[100];
    int banyakPeserta;

    Seminar() {
        banyakPeserta = 0;
    }

    void registrasi(Civitasakademika c) {
        if (banyakPeserta < 100) {
            pesertas[banyakPeserta] = c;
            banyakPeserta++;
        }
    }

    int countPeserta() {
        return banyakPeserta;
    }

    void tampilPeserta() {
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.println(pesertas[i].getNomor() + " " + pesertas[i].nama);
        }
    }

    int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakPeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa) {
                count++;
            }
        }
        return count;
    }
}