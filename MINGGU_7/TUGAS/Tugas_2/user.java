/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS_TMBHN;

public class user {
   
public static void main(String[] args){
   Televisi tv = new Televisi( );
   tv.getTelevisi(" Politron , 14 inches " , 4);
   String[] semuaChannel = {"RCTI" , "SCTV" ,"SBS" ,"TVN" , "NATGEO" , "NET"};
   String[] ChannelFavorit ={ " SBS " , "TVN" ,"RTV" };
   
   System.out.print("PUJI RAHAYU , Membeli Televisi : " ); tv.getDescripsi();
   //System.out.println("");
   tv.getChannels();
   tv.setChannels(semuaChannel);
   tv.setChannels(ChannelFavorit);  
   tv.setChannelAktif(1);
   tv.setVolume(5);
   tv.setChannelAktif(4);
   tv.setChannelAktif(3);
   

}
}
    

