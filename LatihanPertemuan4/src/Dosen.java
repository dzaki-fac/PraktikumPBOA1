import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Dosen extends Pengawai {
    /*************** ATRIBUT ***************/
    private String fakultas;

    /*************** METHOD ***************/
    // konstruktor untuk dosen default
    Dosen() {
        super();
        this.fakultas = "";
    }

    // konstruktor untuk dosen dengan parameter
    Dosen(String nip, String nama, LocalDate tanggallahir, LocalDate terhitungmulaitanggal, String jabatan,
            double gajipokok, String fakultas) {
        super(nip, nama, tanggallahir, terhitungmulaitanggal, jabatan, gajipokok);
        this.fakultas = fakultas;
    }

    // mengembalikan fakultas dosen
    public String getFakultas() {
        return fakultas;
    }

    // mengeset fakultas dosen dengan variable fakultas
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    // menampilkan informasi dosen
    @Override
    void printInfo() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        System.out.println("NIP                     : " + getNip());
        System.out.println("Nama                    : " + getNama());
        System.out.println("Tanggal Lahir           : " + getTanggallahir().format(format));
        System.out.println("TMT                     : " + getTerhitungmulaitanggal().format(format));
        System.out.println("Jabatan                 : " + getJabatan());
        System.out.println("Gaji Pokok              : " + formatRupiah.format(getGajipokok()));
        System.out.println("Fakultas                : " + getFakultas());
    }
}
