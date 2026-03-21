import java.time.LocalDate;

public class PNS extends Manusia implements Pajak {
    /* Atribut */
    private String nip;
    private static int counterPNS = 0;

    /* Method */
    // Konstruktor untuk PNS default
    public PNS() {
        super();
        this.nip = "";
        counterPNS++;
    }

    // Konstruktor untuk PNS dengan parameter
    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    // Mengembalikan nip PNS
    public String getNip() {
        return nip;
    }
    
    // Mengembalikan jumlah PNS yang telah dibuat
    public static int getCounterPNS() {
        return counterPNS;
    }

    // Mengeset nip PNS dengan variable nip
    public void setNip(String nip) {
        this.nip = nip;
    }

    // Menghitung masa kerja PNS
    @Override
    public int hitungMasaKerja() {
        LocalDate sekarang = LocalDate.now();
        return sekarang.getYear() - this.tgl_mulai_kerja.getYear() + 3;
    }

    // Menghitung pajak PNS
    @Override
    public double hitungPajak() {
        return this.pendapatan * 0.10;
    }

    // Menampilkan informasi PNS
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP: " + this.nip);
        System.out.println("Masa kerja: " + this.hitungMasaKerja() + " tahun");
        System.out.println("Pajak : " + this.hitungPajak());
    }
}