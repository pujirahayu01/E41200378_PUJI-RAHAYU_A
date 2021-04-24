
package pewarisan;


public class B extends A{//kelas b merupakan turunan dari class A
    
    int z;
    
    void TampilkanJumlah(){
    // subclass bisa mengakses member dari superclass
    System.out.println("jumlah : " + (x+y+z));
    }
    
}
