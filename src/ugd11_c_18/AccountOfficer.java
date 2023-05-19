/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd11_c_18;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author julia
 */
public class AccountOfficer extends Karyawan implements IAccountOfficer, IKontrak {
    int jumlahNasabah;
    String area;

    public AccountOfficer(int jumlahNasabah, String area, String nama, String nomorIdentitas, String tanggalAwal, String tanggalAkhir) {
        super(nama, nomorIdentitas, tanggalAwal, tanggalAkhir);
        this.jumlahNasabah = jumlahNasabah;
        this.area = area;
    }
    
    @Override
    public void showKaryawan() {
        System.out.println("===Data Account Officer===");
        System.out.println("Nama Petugas : "+ nama);
        System.out.println("Nomor Identitas : "+nomorIdentitas);
        System.out.println("Awal Kontrak : "+ tanggalAwal);
        System.out.println("Akhir Kontrak : "+ tanggalAkhir);
        System.out.println("Jumlah Nasabah : " + jumlahNasabah );
        System.out.println("Area : "+ area);
        System.out.println("Tugas : ");
        mencariNasabah();
        membuatPembukuan();
        bonusKontrak();
    }


    @Override
    public void bonusKontrak() {
        double bonus;
        bonus = (durasiKontrak(tanggalAwal, tanggalAkhir)-30)*12000;
        if(durasiKontrak(tanggalAwal,tanggalAkhir)>30){
            System.out.println("Anda mendapatkan bonus");
            System.out.println("Bonus : "+ bonus);
        }else{
            System.out.println("Anda tidak mendapatkan Bonus");
        }
    }

    @Override
    public void mencariNasabah() {
        System.out.println("Tugas Anda adalah mencari nasabah");
    }

    @Override
    public void membuatPembukuan() {
        System.out.println("Tugas Anda adalah membuat pembukuan");
    }

    @Override
    public int durasiKontrak(String awal, String akhir) {
         Scanner s = new Scanner(awal);
        String[] insert1 = new String[3];
        
        while(s.hasNext()){
            int i = 0;
            insert1[i] = s.next();
            if(!s.hasNext()){
                s.close();
                break;
            }
            i++;
        }
        
        Scanner t = new Scanner(akhir);
        String[] insert2 = new String[3];
        
        while(t.hasNext()){
            int i = 0;
            insert2[i] = t.next();
            if(!t.hasNext()){
                t.close();
                break;
            }
            i++;
        }
        
        Calendar cal = Calendar.getInstance();

        cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(insert1[0]));
        cal.set(Calendar.MONTH, Integer.parseInt(insert1[1]));
        cal.set(Calendar.YEAR, Integer.parseInt(insert1[2]));
        Date firstDate = cal.getTime();

        cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(insert2[0]));
        cal.set(Calendar.MONTH, Integer.parseInt(insert2[1]));
        cal.set(Calendar.YEAR, Integer.parseInt(insert2[2]));
        Date secondDate = cal.getTime();


        int diff = (int) (secondDate.getTime() - firstDate.getTime());

        return diff / 1000 / 60 / 60 / 24;
          
    }
 }
        

