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
public class Bus {
    public int penumpang;
    public int maxpenumpang;
   
    
      //kostruktor kelas bus
    public Bus(int maxPenumpang){
        this.maxpenumpang = maxPenumpang;
        penumpang = 0;
    }

  
    
    public void addPenumpang(int penumpang){
        int temp;
        temp = this.penumpang+penumpang;
        if(temp >= maxpenumpang){
            System.out.println("penumpang melebihi kuota");
        }else{
         this.penumpang = temp;   
        }
    }
    
    public void cetak(){
        System.out.println("Penumpang Bus sekarang adalah " + penumpang);
        System.out.println("Penumpang maksimum seharusnya adalah " + maxpenumpang);
    }

    void addpenumpang(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    }

