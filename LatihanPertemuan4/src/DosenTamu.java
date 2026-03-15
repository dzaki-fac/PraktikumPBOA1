import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DosenTamu extends Dosen {
    /***************ATRIBUT***************/
    private String NIDK;
    private LocalDate tanggalberakhirkontrak;

    /***************METHOD***************/
    //konstruktor untuk dosen tamu default
    DosenTamu(){
        super();
        this.NIDK = "";
        this.tanggalberakhirkontrak = LocalDate.of(0,0,0);
    }

    //konstruktor untuk dosen tamu dengan parameter
    DosenTamu(String nip, String nama, LocalDate tanggallahir, LocalDate terhitungmulaitanggal, String jabatan, double gajipokok, String fakultas, String NIDK, LocalDate tanggalberakhirkontrak){
        super(nip,nama,tanggallahir,terhitungmulaitanggal,jabatan,gajipokok,fakultas);

        this.NIDK = NIDK;
        this.tanggalberakhirkontrak = tanggalberakhirkontrak;
    }

    //mengembalikan NIDK dosen tamu
    public String getNIDK() {
        return NIDK;
    }

    //mengembalikan tanggal berakhir kontrak dosen tamu
    public LocalDate getTanggalberakhirkontrak() {
        return tanggalberakhirkontrak;
    }

    //mengeset NIDK dosen tamu dengan variable NIDK
    public void setNIDK(String NIDK) {
        this.NIDK = NIDK;
    }

    //mengeset tanggal berakhir kontrak dosen tamu dengan variable tanggalberakhirkontrak
    public void setTanggalberakhirkontrak(LocalDate tanggalberakhirkontrak) {
        this.tanggalberakhirkontrak = tanggalberakhirkontrak;
    }

    //menampilkan informasi dosen tamu
    @Override
    void printInfo() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id","ID"));
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id","ID"));
        System.out.println("NIP                     : " + getNip());
        System.out.println("NIDK                    : " + getNIDK());
        System.out.println("Nama                    : " + getNama());
        System.out.println("Tanggal Lahir           : " + getTanggallahir().format(format));
        System.out.println("TMT                     : " + getTerhitungmulaitanggal().format(format));
        System.out.println("Jabatan                 : " + getJabatan());
        System.out.println("Fakultas                : " + getFakultas());
        System.out.println("Masa Kerja              : " + getMasaKerja());
        System.out.println("Tanggal Berakhir Kontrak: " + getTanggalberakhirkontrak().format(format));
        System.out.println("Gaji Pokok              : " + formatRupiah.format(getGajipokok()));
        System.out.println("Tunjangan               : " + formatRupiah.format(getTunjangan()));
    }
}
