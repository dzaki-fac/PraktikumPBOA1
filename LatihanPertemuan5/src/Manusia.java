import java.time.LocalDate;

public abstract class Manusia {
    /***************ATRIBUT***************/
    String nama;
    LocalDate tgl_mulai_kerja;
    String alamat;
    double pendapatan;
    static int counterMns = 0;
    
    /***************METHOD***************/
    //konstruktor untuk manusia default
    public Manusia(){
        this.nama = "";
        this.tgl_mulai_kerja = LocalDate.of(0,0,0);
        this.alamat = "";
        this.pendapatan = 0.0;
        counterMns++;
    }
    
    //konstruktor untuk manusia dengan parameter
    public Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    //mengembalikan nama manusia
    public String getNama() {
        return nama;
    }
    
    //mengembalikan tanggal mulai kerja manusia
    public LocalDate getTgl_mulai_kerja() {
        return tgl_mulai_kerja;
    }

    //mengembalikan alamat manusia
    public String getAlamat() {
        return alamat;
    }

    //mengembalikan pendapatan manusia
    public double getPendapatan() {
        return pendapatan;
    }

    //mengembalikan jumlah manusia yang telah dibuat
    public static int getCounterMns() {
        return counterMns;
    }

    //mengeset nama manusia dengan variable nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    //mengeset tanggal mulai kerja manusia dengan variable tgl_mulai_kerja
    public void setTgl_mulai_kerja(LocalDate tgl_mulai_kerja) {
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }

    //mengeset alamat manusia dengan variable alamat
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    //mengeset pendapatan manusia dengan variable pendapatan
    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    //menampilkan informasi manusia
    public void cetakInfo() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Tanggal Mulai Kerja: " + this.tgl_mulai_kerja);
        System.out.println("Alamat: " + this.alamat);
        System.out.println("Pendapatan: " + this.pendapatan);
    }

    //Abstract method
    //menghitung masa kerja manusia
    public abstract int hitungMasaKerja();
}
