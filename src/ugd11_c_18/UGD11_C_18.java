/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ugd11_c_18;

/*
    Michael Kevin Kimyuwono - 210711056
    Kevin Julian Rahadinata - 210711024
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UGD11_C_18 {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    
    public static void main(String[] args) {
       String namaKantor, kepalaKantor, pendidikanAkhir;
       String namaBank, alamatBank;
       
       String namaAO, nomorIdentitas, tanggalAwal, tanggalAkhir, area;
       int jmlNasabah;
       
       String namaTeller, nomorIdentitas2, tanggalAwal2, tanggalAkhir2;
       int jmlUang, tunjangan;
       
       String namaCS, nomorIdentitas3, tanggalAwal3, tanggalAkhir3, fasilitas;
       int jmlKeluhan;
       
       try{
           System.out.println("Masukkan nama kantor : "); namaKantor = br.readLine();
           System.out.println("Masukkan Kepala kantor : "); kepalaKantor = br.readLine();
           System.out.println("Pendidikan Akhir kepala kantor : "); pendidikanAkhir = br.readLine();
           Kantor k = new Kantor(namaKantor, kepalaKantor, pendidikanAkhir);
           
           System.out.println("\n\n--------------------------");
           System.out.println("Masukkan Nama bank : "); namaBank = br.readLine();
           System.out.println("Masukkan Alamat bank : "); alamatBank = br.readLine();
           Bank b = new Bank(namaBank, alamatBank);
           
           System.out.println("\n\n----------PETUGAS 1 (Data Account Officer)----------------");
           System.out.println("Masukkan nama petugas : "); namaAO = br.readLine();
           System.out.println("Masukkan Nomor identitas : "); nomorIdentitas = br.readLine();
           System.out.println("Tanggal awal kontrak : "); tanggalAwal = br.readLine();
           System.out.println("Tanggal akhir kontrak : "); tanggalAkhir = br.readLine();
           System.out.println("Jumlah nasabah : "); jmlNasabah = Integer.parseInt(br.readLine());
           System.out.println("Area : "); area = br.readLine();
           AccountOfficer ao = new AccountOfficer(namaAO, nomorIdentitas, tanggalAwal, tanggalAkhir, jmlNasabah, area);
           b.addKaryawan(ao);
           
           System.out.println("\n\n----------PETUGAS 2 (Data Teller)----------------");
           System.out.println("Nama teller : "); namaTeller = br.readLine();
           System.out.println("Nomor identitas : "); nomorIdentitas2 = br.readLine();
           System.out.println("Tanggal awal kontrak : "); tanggalAwal2 = br.readLine();
           System.out.println("Tanggal akhir kontrak : "); tanggalAkhir2 = br.readLine();
           System.out.println("Jumlah uang masuk : "); jmlUang = Integer.parseInt(br.readLine());
           System.out.println("Tunjangan : "); tunjangan = Integer.parseInt(br.readLine());
           Teller t = new Teller(namaTeller, nomorIdentitas2, tanggalAwal2, tanggalAkhir2, jmlUang, tunjangan);
           b.addKaryawan(t);
           
           System.out.println("\n\n----------PETUGAS 1 (Data Customer Service)----------------");
           System.out.println("Nama customer service : "); namaCS = br.readLine();
           System.out.println("Nomor identitas : "); nomorIdentitas3 = br.readLine();
           System.out.println("Tanggal awal kontrak : "); tanggalAwal3 = br.readLine();
           System.out.println("Tanggal akhir kontrak : "); tanggalAkhir3 = br.readLine();
           System.out.println("Fasilitas : "); fasilitas = br.readLine();
           System.out.println("Jumlah keluhan : "); jmlKeluhan = Integer.parseInt(br.readLine());
           CustomerService cs = new CustomerService(namaCS, nomorIdentitas3, tanggalAwal3, tanggalAkhir3, fasilitas, jmlKeluhan);
           b.addKaryawan(cs);
           
           b.showBank();
       } catch(Exception e){
           System.out.println(e);
       } 
    } 
    
}
