/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pewarisan;

/**
 *
 * @author User
 */
public class pelajar extends orang {
    private String nim;
    private String asalSekolah;
    private double nilai;
public pelajar (String nama, double tinggi , double berat, String nim,
                String sekolah, double nilai){
    super(nama, tinggi, berat);
    this.nim = nim;
    asalSekolah = sekolah;
    this.nilai = nilai;
   
}
public String toString(){
    return (super.toString()+"\nNIM :" + nim+ "\nSekolah :"+asalSekolah +
                            "\nBilai : " + nilai);
}
}
