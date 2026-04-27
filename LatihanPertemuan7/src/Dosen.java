class Dosen extends Civitasakademika {
    String NIP;

    Dosen(String nama, String NIP) {
        super(nama);
        this.NIP = NIP;
    }

    String getNomor() {
        return NIP;
    }
}