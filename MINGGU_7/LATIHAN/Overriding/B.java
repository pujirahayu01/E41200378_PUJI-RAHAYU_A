/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overriding;

/**
 *
 * @author User
 */
public class B extends A{
    public void tampilKelayar(){
        super.tampilKelayar();// memanggil method dari superclassn ya
    System.out.println("Method milik class B dipanggil");
    }
    
}
