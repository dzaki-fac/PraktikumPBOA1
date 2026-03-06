import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    public Mahasiswa(){
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
        this.listMatkul = new ArrayList<>();
    }

    public Mahasiswa(String nim, String nama, String prodi, Dosen dosenWali, Kendaraan kendaraan){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.dosenWali = dosenWali;
        this.kendaraan = kendaraan;
        this.listMatkul = new ArrayList<>();
    }

    public void addMatkul(MataKuliah newMatKul){
        this.listMatkul.add(newMatKul);
    }
}
