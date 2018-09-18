/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author WINDOWS 10
 */
public class ujiBus {
    public static void main(String[] args){
//membuat objek busBesar dari class Bus
Bus busBesar = new Bus(40);
busBesar.cetak();

busBesar.addpenumpang(15);
busBesar.cetak();

busBesar.addPenumpang(5);
busBesar.cetak();

busBesar.addPenumpang(26);
busBesar.cetak();
    }
}
