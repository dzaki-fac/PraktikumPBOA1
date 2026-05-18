/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.program;

/**
 *
 * @author lenovo
 */
import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;
import java.util.List;

public class Program {
    static MysqlMahasiswaService service = new MysqlMahasiswaService();

    public static void main(String[] args) {
        displayAll();

        System.out.println("===insert");
        Mahasiswa mhsAdd = new Mahasiswa("Haryo");
        service.add(mhsAdd);
        displayAll();

        System.out.println("===update");
        Mahasiswa mhsUpdate = service.getById(4);
        if (mhsUpdate != null) {
            System.out.println("Akan diupdate data lama: " + mhsUpdate);
            mhsUpdate.setNama("Dinaya");
            service.update(mhsUpdate);
        }
        displayAll();

        System.out.println("===delete");
        Mahasiswa mhsDelete = service.getById(4);
        System.out.println("Akan di delete: " + mhsDelete);
        service.delete(4);
        displayAll();
    }

    public static void displayAll() {
        System.out.println("===displayAll");
        List<Mahasiswa> listMhs = service.getAll();

        for (Mahasiswa mhs : listMhs) {
            System.out.println(mhs);
        }
    }
}