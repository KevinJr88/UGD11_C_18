/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd11_c_18;

/**
 *
 * @author julia
 */
public class Teller extends Karyawan implements ITeller, IKontrak {
    private int jumlahUangMasuk;
    private int tunjagan;

    public Teller(int jumlahUangMasuk, int tunjagan, String nama, String nomorIdentitas, String tanggalAwal, String tanggalAkhir) {
        super(nama, nomorIdentitas, tanggalAwal, tanggalAkhir);
        this.jumlahUangMasuk = jumlahUangMasuk;
        this.tunjagan = tunjagan;
    }

    
    @Override
    public void showKaryawan() {
        System.out.println("===Data Teller===");
        System.out.println("Nama Petugas : "+ nama);
        System.out.println("Nomor Identitas : "+nomorIdentitas);
        System.out.println("Awal Kontrak : "+ tanggalAwal);
        System.out.println("Akhir Kontrak : "+ tanggalAkhir);
        System.out.println("Jumlah Uang Masuk : "+ jumlahUangMasuk);
        System.out.println("Tugas : ");
        melayaniTransaksi();
        bonusKontrak();
    }
    @Override
    public void melayaniTransaksi() {
        System.out.println("Tugas Anda adalah melakukan transaksi keuangan");
    }

    @Override
    public int durasiKontrak() {
        
    }

    @Override
    public void bonusKontrak() {
        double bonus;
        bonus = durasiKontrak()*13000;
        if(bonus>0){
            System.out.println("Anda mendapatkan bonus");
            System.out.println("Bonus : "+ bonus);
        }
    }
}
