/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistentobjectdao1;

/**
 * File : MainDAO.java
 * Deskripsi : Main program untuk akses DAO
 * @author yumah
 */

public class MainDAO {
    public static void main(String args[]) {
        Person person = new Person("Indra");
        Person person1 = new Person("Yuma");
        Person person2 = new Person("Imam");
        Person person3 = new Person("Pablo");

        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());

        try {
//            m.getPersonDAO().savePerson(person);
//            m.getPersonDAO().savePerson(person1);
//            m.getPersonDAO().savePerson(person2);
            m.getPersonDAO().savePerson(person3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
