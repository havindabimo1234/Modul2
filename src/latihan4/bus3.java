/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

/**
 *
 * @author WINDOWS 10
 */
public class bus3 {
 public int penumpang;
 public int maxpenumpang;
 
 public bus3(int maxpenumpang)
 {
     this.maxpenumpang = maxpenumpang;
     penumpang = 0;
 }
 //Method Mutator
 public void addpenumpang(int penumpang)
 {
     int temp;
     temp = this.penumpang+penumpang;
     if (temp > maxpenumpang)
     {
         System.out.println("penumpang melebihi kuota");
     }
  else   
 }
 this.penumpang=temp;
}
