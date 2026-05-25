import java.util.HashMap;
import java.util.Map;

public class Latihan {
    public static void main(String[] args) {
        // map dengan NIM sebagai key dan nama sebagai value
        Map<String, String> mahasiswaMap = new HashMap<>();
        
        // menambah data mahasiswa ke dalam Map
        mahasiswaMap.put("24060124130103", "Jek");
        mahasiswaMap.put("24060124130130", "Hani");
        mahasiswaMap.put("24060124130123", "Buni");
        mahasiswaMap.put("24060124130193", "Switi");

        // menampilkan key dan value dari map mahasiswa
        mahasiswaMap.forEach((nim, nama) -> {
            System.out.println("NIM: " + nim + ", Nama: " + nama);
        });
    }
}