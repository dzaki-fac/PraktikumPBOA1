import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.text.NumberFormat;

public class DosenTetap extends Dosen {
    /***************ATRIBUT***************/
    private String NIDN;
    private int BUP;
    private LocalDate tanggalpensiun;

    /***************METHOD***************/
    //konstruktor untuk dosen tetap default
    DosenTetap(){
        super();
        this.NIDN = "";
        this.BUP = 65;
        this.tanggalpensiun = LocalDate.of(0, 0, 0);
    }

    //konstruktor untuk dosen tetap dengan parameter
    DosenTetap(String nip, String NIDN, String nama, LocalDate tanggallahir, LocalDate terhitungmulaitanggal, String jabatan, double gajipokok, String fakultas){
        super(nip,nama,tanggallahir,terhitungmulaitanggal,jabatan,gajipokok,fakultas);

        this.NIDN = NIDN;
        this.BUP = 65;
        this.tanggalpensiun = LocalDate.of(tanggallahir.getYear() + BUP, tanggallahir.getMonthValue() + 1, 1);
    }

    //mengembalikan NIDN dosen tetap
    public String getNIDN() {
        return NIDN;
    }

    //mengembalikan BUP dosen tetap
    public int getBUP() {
        return BUP;
    }

    //mengembalikan tanggal pensiun dosen tetap
    public LocalDate getTanggalpensiun() {
        return tanggalpensiun;
    }

    //mengeset NIDN dosen tetap dengan variable NIDN
    public void setNIDN(String NIDN) {
        this.NIDN = NIDN;
    }

    //mengeset BUP dosen tetap dengan variable BUP
    public void setBUP(int BUP) {
        this.BUP = BUP;
    }

    //mengeset tanggal pensiun dosen tetap dengan variable tanggalpensiun
    public void setTanggalpensiun(LocalDate tanggalpensiun) {
        this.tanggalpensiun = tanggalpensiun;
    }

    //menampilkan informasi dosen tetap
    @Override
    void printInfo() {  
        DateTimeFormatter format = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id","ID"));
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id","ID"));

        System.out.println("NIP             : " + getNip());
        System.out.println("NIDN            : " + getNIDN());
        System.out.println("Nama            : " + getNama());
        System.out.println("Tanggal Lahir   : " + getTanggallahir().format(format));
        System.out.println("TMT             : " + getTerhitungmulaitanggal().format(format));
        System.out.println("Jabatan         : " + getJabatan());
        System.out.println("Fakultas        : " + getFakultas());
        System.out.println("Masa Kerja      : " + getMasaKerja());
        System.out.println("Tanggal Pensiun : " + getTanggalpensiun());
        System.out.println("Gaji Pokok      : " + formatRupiah.format(getGajipokok()));
        System.out.println("Tunjangan       : " + formatRupiah.format(getTunjangan()));
    }
}
