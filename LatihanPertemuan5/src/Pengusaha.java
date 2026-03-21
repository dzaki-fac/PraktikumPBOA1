import java.time.LocalDate;

public class Pengusaha extends Manusia implements Pajak {
    /* Atribut */
    private String npwp;
    static int counterPengusaha = 0;

    /* Method */
    // Konstruktor untuk pengusaha default
    public Pengusaha() {
        super();
        this.npwp = "";
        counterPengusaha++;
    }

    // Konstruktor untuk pengusaha dengan parameter
    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    // Mengembalikan npwp pengusaha
    public String getNpwp() {
        return npwp;
    }

    // Mengembalikan jumlah pengusaha yang telah dibuat
    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    // Mengeset npwp pengusaha dengan variable npwp
    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    // Menghitung masa kerja pengusaha
    @Override
    public int hitungMasaKerja() {
        LocalDate sekarang = LocalDate.now();
        return sekarang.getYear() - this.tgl_mulai_kerja.getYear() + 0;
    }

    // Menghitung pajak pengusaha
    @Override
    public double hitungPajak() {
        return this.pendapatan * 0.15;
    }

    // Menampilkan informasi pengusaha
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP: " + this.npwp);
        System.out.println("Masa kerja: " + this.hitungMasaKerja() + " tahun");
        System.out.println("Pajak : " + this.hitungPajak());
    }
}