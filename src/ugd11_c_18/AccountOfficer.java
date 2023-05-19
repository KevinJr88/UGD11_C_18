/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd11_c_18;

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
    public int durasiKontrak() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void bonusKontrak() {
        double bonus;
        bonus = durasiKontrak()*12000;
        if(durasiKontrak>30){
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
    
}
