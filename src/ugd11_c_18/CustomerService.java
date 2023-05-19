/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd11_c_18;

/**
 *
 * @author kevin
 */
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CustomerService extends Karyawan implements ICustomerService, IKontrak{
    private String fasilitas;
    private int jmlKeluhan;
    
    public CustomerService(String nama, String nomorIdentitas, String tanggalAwal, String tanggalAkhir, String fasilitas, int jmlKeluhan){
         super(nama, nomorIdentitas, tanggalAwal, tanggalAkhir);
         this.fasilitas = fasilitas;
         this.jmlKeluhan = jmlKeluhan;
    }
    
    public void showKaryawan(){
        System.out.println("Nama CS : " + nama);
        System.out.println("Nomor identitas : " + nomorIdentitas);
        System.out.println("Tanggal awal kontrak : " + tanggalAwal);
        System.out.println("Tanggal akhir kontrak : " + tanggalAkhir);
        System.out.println("Fasilitas : " + fasilitas);
        System.out.println("Jumlah Keluhan : " + jmlKeluhan);
        System.out.println("Tugas : "); membukaRekening();
        System.out.println("Durasi Kontrak : " + cekDurasi(tanggalAwal, tanggalAkhir));
        cekBonus();
        bonusKontrak();
        
    }
    
    public void membukaRekening(){
        System.out.println("Karyawan " + nama + " membuka rekening");
    }
    
    public double cekDurasi(String awal, String akhir){        
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


        long diff = secondDate.getTime() - firstDate.getTime();

        return diff / 1000 / 60 / 60 / 24;
          
    }
    
    public void cekBonus(){
        if(cekDurasi(tanggalAwal, tanggalAkhir)<30.0){
            System.out.println("Anda tidak mendapatkan bonus");
        } else{
            System.out.println("Anda mendapatkan bonus");
            System.out.println("Bonus : " + (cekDurasi(tanggalAwal, tanggalAkhir)-30)*15000);
        }
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
    
    @Override
    public void bonusKontrak() {
        if(durasiKontrak(tanggalAwal, tanggalAkhir)<30){
            System.out.println("Bonus : 0.00");
        } else{
            System.out.println("Bonus : " + (durasiKontrak(tanggalAwal, tanggalAkhir)-30)*15000.0);
        }    
    }
}
