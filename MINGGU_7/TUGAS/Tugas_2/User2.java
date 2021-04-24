
package TUGAS_TMBHN;

public class User2 {
    public static void main(String[] args){
   TelevisiModern tv = new TelevisiModern();
   tv.getTelevisi(" Politron , 30 inches " , 5);
   //tv.Descripsi(" Politron , 14 inches " , 10);
   String [] semuaChannel = {"RCTI" , "SCTV" ,"SBS" ,"TVN" , "NATGEO" };
   
   
   System.out.print("PUJI RAHAYU , Membeli Televisi : " ); tv.getDescripsi();
   //System.out.println("");
   tv.getChannels();
   tv.setChannels(semuaChannel);
  
   tv.setChannelAktif(1);
   tv.setVolume(5);
   tv.setChannelAktif(4);
   tv.setChannelAktif(3);
   tv.ModusTampilan(TelevisiModern.TeleText);
   tv.setHalamanTeletex(250);
   tv.ModusTampilan(TelevisiModern.TV);
   tv.playCD();
   tv.setDictrack("The Matrix");
   tv.playCD();
   
}   
}
