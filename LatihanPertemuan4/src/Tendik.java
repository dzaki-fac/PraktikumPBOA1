import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.text.NumberFormat;

public class Tendik extends Pengawai {
    /***************ATRIBUT***************/
    private String bidang;
    private int BUP;
    private LocalDate tanggalpensiun;
    
    /***************METHOD***************/
    //konstruktor untuk tendik default
    Tendik(){
        super();
        this.bidang = "";
        this.BUP = 55;
        this.tanggalpensiun = LocalDate.of(0,0,0);
    }

    //konstruktor untuk tendik dengan parameter
    Tendik(String nip, String nama, LocalDate tanggallahir, LocalDate terhitungmulaitanggal, String jabatan, double gajipokok,String bidang){
        super(nip,nama,tanggallahir,terhitungmulaitanggal,jabatan,gajipokok);
        this.bidang = bidang;
        this.tanggalpensiun = LocalDate.of(tanggallahir.getYear() + BUP, tanggallahir.getMonthValue() + 1, 1);

    }

    //mengembalikan bidang tendik
    public String getBidang() {
        return bidang;
    }

    //mengembalikan BUP tendik
    public int getBUP() {
        return BUP;
    }

    //mengembalikan tanggal pensiun tendik
    public LocalDate getTanggalpensiun() {
        return tanggalpensiun;
    }

    //mengeset bidang tendik dengan variable bidang
    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    //mengeset BUP tendik dengan variable BUP
    public void setBUP(int bUP) {
        BUP = bUP;
    }

    //mengeset tanggal pensiun tendik dengan variable tanggalpensiun
    public void setTanggalpensiun(LocalDate tanggalpensiun) {
        this.tanggalpensiun = tanggalpensiun;
    }

    //menampilkan informasi tendik
    @Override
    void printInfo() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id","ID"));
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id","ID"));

        System.out.println("NIP             : " + getNip());
        System.out.println("Nama            : " + getNama());
        System.out.println("Tanggal Lahir   : " + getTanggallahir().format(format));
        System.out.println("TMT             : " + getTerhitungmulaitanggal().format(format));
        System.out.println("Jabatan         : " + getJabatan());
        System.out.println("Bidang          : " + getBidang());
        System.out.println("Masa Kerja      : " + getMasaKerja());
        System.out.println("Tanggal Pensiun : " + getTanggalpensiun().format(format));
        System.out.println("Gaji Pokok      : " + formatRupiah.format(getGajipokok()));
        System.out.println("Tunjangan       : " + formatRupiah.format(getTunjangan()));
    }
}
