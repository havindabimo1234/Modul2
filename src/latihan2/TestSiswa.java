/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author WINDOWS 10
 */
public class TestSiswa {
    public static void main(String args[]){
        EncapSiswa siswa =  new EncapSiswa();
        siswa.setName("bimo");
        siswa.setAbsen(15);
        siswa.setAddress("malang");
        
        System.out.println("Name :" + siswa.getName()+"Absen :"+ siswa.getAbsen()+
                "Address :" + siswa.getAddress());
    }
}
