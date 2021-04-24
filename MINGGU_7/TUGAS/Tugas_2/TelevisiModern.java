package TUGAS_TMBHN;

public class TelevisiModern extends Televisi {
    public static final int TV = 1;
    public static final int TeleText = 0;
    int modus_tampilan = TV;
    int halamanTeletext = 0;
    String DiscTray = " ";

    public TelevisiModern(String Descripsi, int JumlahChannel) {
        super();
    }
    TelevisiModern() {
    }
    public void ModusTampilan(int modus_tampilan) {
        switch (modus_tampilan) {
            case TV:
                System.out.println("Modus Tampilan : Televisi ");
                break;
            case TeleText:
                System.out.println("Modus Tampilan : Teletex ");
                break;
        }
    }

    public void setHalamanTeletex(int halamanTeletex) {
        System.out.println("Berpindah ke halaman Teletex :" + halamanTeletex);
    }

    public void setDictrack(String DiscTray) {
        this.DiscTray = DiscTray;

    }

    public void playCD() {
        if (DiscTray == " ") {
            System.out.println("Tidak ada CD dalam distray");
        } else {
            System.out.println("Memutar film " + DiscTray);
        }
    }

}
