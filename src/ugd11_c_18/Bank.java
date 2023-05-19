/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd11_c_18;

import java.util.ArrayList;


public class Bank {
    private String namaBank;
    private String alamatBank;
    private ArrayList<Karyawan> listKaryawan = new ArrayList <Karyawan>();

    public Bank(String namaBank, String alamatBank) {
        this.namaBank = namaBank;
        this.alamatBank = alamatBank;
    }
    
    public void addKaryawan(Karyawan karyawan){
        listKaryawan.add(karyawan);
    }
    
    public void showBank(){
        System.out.println("Tampilan Data");
        System.out.println("Nama Bank : "+namaBank);
        System.out.println("Alamat : "+ alamatBank);
        
        for(int i = 0 ; i<listKaryawan.size();i++){
            System.out.println("----Petugas ke-"+(i+1));
            listKaryawan.get(i).showKaryawan();
        }
    }
    
    
}
