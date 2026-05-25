/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.program;

/**
 *
 * @author yumah
 */

import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;
import java.util.List;

public class Program {
    static MysqlMahasiswaService service = new MysqlMahasiswaService();

    public static void main(String[] args) {
        displayAll();

        System.out.println("===insert");
//        Mahasiswa mhsAdd = new Mahasiswa("Haryo");
        Mahasiswa m1 = new Mahasiswa(2, "Agus");
        Mahasiswa m2 = new Mahasiswa(4, "Sugeng");
        service.add(m1);
        service.add(m2);
        displayAll();

//        System.out.println("===update");
//        Mahasiswa mhsUpdate = service.getById(7);
//        if (mhsUpdate != null) {
//            System.out.println("Akan diupdate data lama: " + mhsUpdate);
//            mhsUpdate.setNama("Susanti");
//            service.update(mhsUpdate);
//        }
//        displayAll();

//        System.out.println("===delete");
//        Mahasiswa mhsDelete1 = service.getById(2);
//        Mahasiswa mhsDelete2 = service.getById(6);
//        System.out.println("Akan di delete: " + mhsDelete1);
//        System.out.println("Akan di delete: " + mhsDelete2);
//        service.delete(2);
//        service.delete(6);
//        displayAll();
    }

    public static void displayAll() {
        System.out.println("===displayAll");
        List<Mahasiswa> listMhs = service.getAll();

        for (Mahasiswa mhs : listMhs) {
            System.out.println(mhs);
        }
    }
}
