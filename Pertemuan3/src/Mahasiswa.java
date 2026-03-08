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

    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
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
        this.listMatkul = new ArrayList<MataKuliah>();
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    public void setDosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    public String getNim(){
        return this.nim;
    }

    public String getNama(){
        return this.nama;
    }

    public String getProdi(){
        return this.prodi;
    }

    public Dosen getDosenWali(){
        return this.dosenWali;
    }

    public Kendaraan getKendaraan(){
        return this.kendaraan;
    }

    public ArrayList<MataKuliah> getListMatkul(){
        return this.listMatkul;
    }

    public void addMatkul(MataKuliah newMatKul){
        this.listMatkul.add(newMatKul);
    }

    public int getJumlahMatKul(){
        int ans = 0;
        
        for(MataKuliah i : listMatkul){
            ans += 1;
        }

        return ans;
    }

    public int getJumlahSKS(){
        int ans = 0;
        
        for(MataKuliah i : listMatkul){
            ans += i.getSks();
        }

        return ans;
    }

    void printMhs(){
        System.out.println("Nim : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi : " + prodi);
    }

    void printDetailMhs(){
        this.printMhs();
        System.out.println("Dosen : " + dosenWali.getNama());
        System.out.println("Kendaraan : " + kendaraan.getJenis());
        System.out.println("List Matkul : ");
        for(MataKuliah i : listMatkul) System.out.println(i.getNama() + " ");
    }
}
