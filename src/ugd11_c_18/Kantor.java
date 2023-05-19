/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd11_c_18;


public class Kantor {
    private String namaKantor;
    private String namaKepalaKantor;
    private String pendidikanAkhirKepalaKantor;

    public Kantor(String namaKantor, String namaKepalaKantor, String pendidikanAkhirKepalaKantor) {
        this.namaKantor = namaKantor;
        this.namaKepalaKantor = namaKepalaKantor;
        this.pendidikanAkhirKepalaKantor = pendidikanAkhirKepalaKantor;
    }
    
    public void showKantor(){
        System.out.println("-----Tampilan Data-----");
        System.out.println("Nama Kantor :" +namaKantor);
        System.out.println("Nama Kepala Kantor : "+ namaKepalaKantor);
        System.out.println("Pendidikan Akhir Kepala Kantor : "+ pendidikanAkhirKepalaKantor);
    }
    
    
}
