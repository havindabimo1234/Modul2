/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author WINDOWS 10
 */
public class ujibus {
  public static void main(String[]args){
         praktikum2 busBesar = new praktikum2(100);
         busBesar.getpenumpang(24);
         
         busBesar.addpenumpang(15);
         busBesar.addpenumpang(5);
         busBesar.addpenumpang(26);
         busBesar.getAverage();
         busBesar.cetakpenumpang();
}
}



