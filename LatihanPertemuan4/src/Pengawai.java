import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.text.NumberFormat;

public class Pengawai {
    /***************ATRIBUT***************/
    private String nip;
    private String nama;
    private LocalDate tanggallahir;
    private LocalDate terhitungmulaitanggal;
    private String jabatan;
    private double gajipokok;

    /***************METHOD***************/
    //Konstruktor untuk pengawai default
    Pengawai(){
        this.nip = "";
        this.nama = "";
        this.tanggallahir = LocalDate.of(0,0,0);
        this.terhitungmulaitanggal = LocalDate.of(0,0,0);
        this.jabatan = "";
        this.gajipokok = 0;
    }

    //Konstruktor untuk pengawai dengan parameter
    Pengawai(String nip, String nama, LocalDate tanggallahir, LocalDate terhitungmulaitanggal, String jabatan, double gajipokok){
        this.nip = nip;
        this.nama = nama;
        this.tanggallahir = tanggallahir;
        this.terhitungmulaitanggal = terhitungmulaitanggal;
        this.jabatan = jabatan;
        this.gajipokok = gajipokok;
    }

    //mengeset NIP pengawai dengan variable nip
    public void setNip(String nip) {
        this.nip = nip;
    }

    //mengeset nama pengawai dengan variable nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    //mengeset tanggal lahir pengawai dengan variable tanggallahir
    public void setTanggallahir(LocalDate tanggallahir) {
        this.tanggallahir = tanggallahir;
    }

    //mengeset tanggal mulai bekerja pengawai dengan variable terhitungmulaitanggal
    public void setTerhitungmulaitanggal(LocalDate terhitungmulaitanggal) {
        this.terhitungmulaitanggal = terhitungmulaitanggal;
    }

    //mengeset jabatan pengawai dengan variable jabatan
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    //mengeset gaji pokok pengawai dengan variable gajipokok
    public void setGajipokok(double gajipokok) {
        this.gajipokok = gajipokok;
    }

    //mengembalikan NIP pengawai
    public String getNip() {
        return nip;
    }

    //mengembalikan nama pengawai
    public String getNama() {
        return nama;
    }

    //mengembalikan tanggal lahir pengawai
    public LocalDate getTanggallahir() {
        return tanggallahir;
    }

    //mengembalikan tanggal mulai bekerja pengawai
    public LocalDate getTerhitungmulaitanggal() {
        return terhitungmulaitanggal;
    }
    
    //mmengembalikan jabatan pengawai
    public String getJabatan() {
        return jabatan;
    }

    //mengembalikan gaji pokok pengawai
    public double getGajipokok() {
        return gajipokok;
    }

    //mengembalikan tunjangan pengawai berdasarkan jabatan dan masa kerja
    public double getTunjangan() {
        if(jabatan.equals("Dosen Tetap")){
            return getGajipokok()*(0.02)*getTahunMasaKerja();
        }else if (jabatan.equals("Dosen Tamu")){
            return getGajipokok()*(0.025);
        }else if (jabatan.equals("Tenaga Didik")){
            return getGajipokok()*(0.01)*getTahunMasaKerja();
        }else{
            return 0;
        } 
    }

    //mengembalikan banyaknya tahun masa kerja pengawai
    int getTahunMasaKerja(){
        int bulan = LocalDate.now().getYear() - terhitungmulaitanggal.getYear();
        bulan = bulan*12;
        bulan = bulan + LocalDate.now().getMonthValue() - terhitungmulaitanggal.getMonthValue() ;

        return bulan / 12;
    }

    //mengembalikan banyaknya tahun dan bulan masa kerja pengawai
    String getMasaKerja(){
        int bulan = LocalDate.now().getYear() - terhitungmulaitanggal.getYear();
        bulan = bulan*12;
        bulan = bulan + LocalDate.now().getMonthValue() - terhitungmulaitanggal.getMonthValue() ;

        return bulan / 12 + " Tahun " + bulan % 12 + " Bulan";
    }

    //menampilkan informasi pengawai
    void printInfo(){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id","ID"));
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id","ID"));
        System.out.println("NIP             : " + getNip());
        System.out.println("Nama            : " + getNama());
        System.out.println("Tanggal Lahir   : " + getTanggallahir().format(format));
        System.out.println("TMT             : " + getTerhitungmulaitanggal().format(format));
        System.out.println("Jabatan         : " + getJabatan());
        System.out.println("Gaji Pokok      : " + formatRupiah.format(getGajipokok()));
        System.out.println("Tunjangan       : " + formatRupiah.format(getTunjangan()));
    }
}
