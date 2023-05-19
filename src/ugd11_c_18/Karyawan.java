/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd11_c_18;

/**
 *
 * @author julia
 */
public abstract class Karyawan {
    protected String nama;
    protected String nomorIdentitas;
    protected String tanggalAwal;
    protected String tanggalAkhir;

    public Karyawan(String nama, String nomorIdentitas, String tanggalAwal, String tanggalAkhir) {
        this.nama = nama;
        this.nomorIdentitas = nomorIdentitas;
        this.tanggalAwal = tanggalAwal;
        this.tanggalAkhir = tanggalAkhir;
    }
    
    public abstract void showKaryawan();

}
