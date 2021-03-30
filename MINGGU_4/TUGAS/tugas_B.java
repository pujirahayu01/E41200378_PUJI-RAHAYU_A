package Tugas_Mg4;


public class tugas_B {
    public static void main(String[] args){
       System.out.println("                    DO WHILE ");
       System.out.println("           Hasil pangkat 2 (1-100) ");
       System.out.println("======================================================= ");
        
       int i = 1 ;
       int batas = 8;
       int pangkat = 1 ;
       do{
            System.out.print(pangkat + " ");
          pangkat *= 2;
            i++;
        } while ( i < batas);     
    }

}