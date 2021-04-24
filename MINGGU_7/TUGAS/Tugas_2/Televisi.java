
package TUGAS_TMBHN;

public class Televisi {
     String Descripsi;
    int JumlahChannel = 0;
    String[] Channels ;
    int ChannelAktif = 0;
    int Volume = 0;

     public void Televisi() {
        this.Descripsi = Descripsi;
        this.JumlahChannel = JumlahChannel;
    }

    public void getTelevisi(final String Descripsi, final int JumlahChannel) {
        this.Descripsi = Descripsi;
        this.JumlahChannel = JumlahChannel;

    }

    public void getDescripsi() {
        System.out.println(Descripsi);
    }
    public void getChannels() {
        if (Channels == null) {
            System.out.println("Belum ada channel yang di set!");
        }
    }
     public void setChannels( String[] Channels ) {
        // kita tentukan dulu banyak channelnya, lalu buat kodenya
        if (Channels.length > JumlahChannel) {
            System.out.println("Maaf Tv ini hanya dapat menyimpan " + JumlahChannel + " channel saja");
        }
        if (Channels.length <= JumlahChannel) {
            System.out.println("Informasi Channel tv anda telah di update ");
        }
        for (int i = 0; i <= Channels.length; i++) {
            this.Channels = Channels;
        }
     }
     public void setChannelAktif(int CA) {
        
        if (CA > Channels.length) {
            System.out.println("Channel yang anda inginkan belum di set");
            return;
        }
        this.ChannelAktif = CA;
      //  int Channelvavorit = CA;
        System.out.println("Pindah ke Channel  : " + this.Channels[CA -1]);
        }
        public void setVolume(int vol) {
        System.out.println("Intensitas volume sekarang : " + vol);
    
    } 
}
